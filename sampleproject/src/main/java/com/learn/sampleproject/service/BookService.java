package com.learn.sampleproject.service;

import java.util.List;

import com.learn.sampleproject.entity.Book;
import com.learn.sampleproject.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int bookId) {
        Book book = null;
        try {
            book = bookRepository.findById(bookId).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    public Book saveBook(Book book) {
        Book savedBook = bookRepository.save(book);
        return savedBook;
    }

    public Book updateBookDetails(Book book) {
        Book updatedBook = null;
        try {
            updatedBook = bookRepository.findById(book.getBookId()).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        updatedBook.setBookAuthor(book.getBookAuthor());
        updatedBook.setBookName(book.getBookName());
        updatedBook.setNoOfPages(book.getNoOfPages());
        updatedBook = bookRepository.save(updatedBook);
        return updatedBook;
    }

    public Book deleteBook(int bookId) {
        Book book = null;
        try {
            book = bookRepository.findById(bookId).get();
            bookRepository.deleteById(bookId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }
}

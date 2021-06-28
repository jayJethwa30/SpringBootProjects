package com.learn.sampleproject.repository;

import com.learn.sampleproject.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}

package com.admin.service;

import com.admin.domain.Book;

import java.util.List;

/**
 * Created by failedOptimus on 20-01-2018.
 */
public interface BookService {

    Book save(Book book);

    List<Book> findAll();

    Book findOne(Long id);

    void removeOne(Long id);

}

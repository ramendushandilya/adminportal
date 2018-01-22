package com.admin.repository;

import com.admin.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by failedOptimus on 20-01-2018.
 */
public interface BookRepository extends CrudRepository<Book, Long> {



}

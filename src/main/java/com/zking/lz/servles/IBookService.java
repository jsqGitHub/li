package com.zking.lz.servles;

import com.zking.lz.model.Book;

import java.util.List;

public interface IBookService {

    int insert(Book record);

    List<Book> querybook();
}
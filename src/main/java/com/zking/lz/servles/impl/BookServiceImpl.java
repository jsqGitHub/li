package com.zking.lz.servles.impl;

import com.zking.lz.mapper.BookMapper;
import com.zking.lz.model.Book;
import com.zking.lz.servles.IBookService;

import java.util.List;

public class BookServiceImpl implements IBookService {

    private BookMapper bookMapper;

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }

    @Override
    public List<Book> querybook() {
        return bookMapper.querybook();
    }
}

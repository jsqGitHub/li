package com.zking.lz.servles.impl;

import com.zking.lz.mapper.BookMapper;
import com.zking.lz.model.Book;
import com.zking.lz.servles.IBookService;
import com.zking.lz.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookServiceImplTest {

    private IBookService iBookService;
    private SqlSession sqlSession;

    @Before
    public void setUp() throws Exception {
        sqlSession = SqlSessionFactoryUtils.openSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        BookServiceImpl bs = new BookServiceImpl();
        bs.setBookMapper(mapper);
        iBookService=bs;

    }

    @After
    public void tearDown() throws Exception {
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void insert() {

    }

    @Test
    public void query() {
        List<Book> books = iBookService.querybook();
        System.out.println(books.size());
        for (Book book:books ) {
            System.out.println(book);
        }
    }
}
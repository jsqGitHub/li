package com.zking.lz.model;

import lombok.ToString;

import java.util.Date;
@ToString
public class Book {
    private Integer bookId;

    private String bookName;

    private String bookNamePinyin;

    private Integer bookCategoryId;

    private String bookAuthor;

    private Float bookPrice;

    private String bookImage;

    private String publishing;

    private String bookDesc;

    private Integer bookState;

    private Date deployDatetime;

    private Integer salesVolume;

    public Book(Integer bookId, String bookName, String bookNamePinyin, Integer bookCategoryId, String bookAuthor, Float bookPrice, String bookImage, String publishing, String bookDesc, Integer bookState, Date deployDatetime, Integer salesVolume) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookNamePinyin = bookNamePinyin;
        this.bookCategoryId = bookCategoryId;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookImage = bookImage;
        this.publishing = publishing;
        this.bookDesc = bookDesc;
        this.bookState = bookState;
        this.deployDatetime = deployDatetime;
        this.salesVolume = salesVolume;
    }

    public Book() {
        super();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookNamePinyin() {
        return bookNamePinyin;
    }

    public void setBookNamePinyin(String bookNamePinyin) {
        this.bookNamePinyin = bookNamePinyin;
    }

    public Integer getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(Integer bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public Integer getBookState() {
        return bookState;
    }

    public void setBookState(Integer bookState) {
        this.bookState = bookState;
    }

    public Date getDeployDatetime() {
        return deployDatetime;
    }

    public void setDeployDatetime(Date deployDatetime) {
        this.deployDatetime = deployDatetime;
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }
}
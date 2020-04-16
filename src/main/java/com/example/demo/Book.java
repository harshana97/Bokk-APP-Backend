package com.example.demo;

import java.util.Date;

public class Book {

    private Integer bookId;
    private String bookName;
    private Date publishedDate;
    private String bookLocation;

    public Book(Integer bookId, String bookName, Date publishedDate, String bookLocation) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.publishedDate = publishedDate;
        this.bookLocation = bookLocation;
    }

//    public Book(int i, String harry_potter, Date date) {
//    }

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

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getBookLocation() {
        return bookLocation;
    }

    public void setBookLocation(String bookLocation) {
        this.bookLocation = bookLocation;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", publishedDate=" + publishedDate +
                ", bookLocation='" + bookLocation + '\'' +
                '}';
    }

}

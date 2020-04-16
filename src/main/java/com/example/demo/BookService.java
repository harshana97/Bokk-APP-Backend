package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class BookService {

    private static int bookCount = 4;
    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book(1, "Harry Potter", new Date(), "Kandy"));
        books.add(new Book(2, "Sri Lanka", new Date(), "Colombo"));
        books.add(new Book(3, "Lord of the rings", new Date(), "Mawanella"));
        books.add(new Book(4, "Hunger games", new Date(), "Ella"));
    }

    public List<Book> findAllBooks() {
        return books;
    }

    public Book addBook(Book book) {
        if (book.getBookId() == null) {
            book.setBookId(bookCount++);
        }
        books.add(book);
        return book;
    }

    public Book findBook(int id){
        for (Book book: books){
        if (book.getBookId() == id){
            return book;
        }
        }
        return null;
    }

    }


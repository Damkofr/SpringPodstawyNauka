package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;


    @Component
    public class BookRepository implements GenericRepository<String, Book> {

        private List<Book> books;

        public BookRepository() {
            books = new LinkedList<>();
        }

        @Override
        public Book get(String isbn) {
            if(isbn == null || (isbn.length() != 13))
                throw new IllegalArgumentException("You have to provide valid ISBN number");
            Book find = books.stream()
                    .filter(b -> isbn.equals(b.getIsbn()))
                    .findFirst()
                    .get();
            return find;
        }

        @Override
        public void add(Book book) {
            if(book == null || book.getIsbn() == null || book.getTitle() == null || book.getAuthor() == null)
                throw new IllegalArgumentException("Book cannot have null fields");
            books.add(book);
        }
    }


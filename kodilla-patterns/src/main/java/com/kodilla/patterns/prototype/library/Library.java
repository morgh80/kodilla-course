package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public void setName(String name) {
        this.name = name;
    }

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }


    @Override
    public String toString() {
        return name + '\'' +
                ", books: " + books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        Set<Book> clonedBooks = new HashSet<>();
        for (Book book : clonedLibrary.getBooks()) {
            clonedBooks.add(book);
        }
        clonedLibrary.books = clonedBooks;
        return clonedLibrary;
    }

}
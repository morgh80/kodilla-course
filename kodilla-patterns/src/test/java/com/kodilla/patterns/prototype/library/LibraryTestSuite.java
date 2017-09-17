package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Book testBook1 = new Book("Ogniem", "Henryk",LocalDate.of(1886, 2, 15));
        Book testBook2 = new Book("Mieczem", "Sienkiewicz", LocalDate.of(1886, 2, 15));

        Library library = new Library("library");
        library.getBooks().add(testBook1);
        library.getBooks().add(testBook2);

        //When
        Set<Book> result = library.getBooks();

        //Then
        Assert.assertEquals(2, result.size());
    }

    @Test
    public void isShallowCloning() {

        //Given
        Book testBook1 = new Book("Ogniem", "Henryk",LocalDate.of(1886, 2, 15));
        Book testBook2 = new Book("Mieczem", "Sienkiewicz", LocalDate.of(1886, 2, 15));

        Library library = new Library("First Library");
        library.getBooks().add(testBook1);
        library.getBooks().add(testBook2);
        Library clonedLibrary = null;

        //When
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Second Library");
        } catch (Exception e) {
            System.out.println(e);
        }

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
    }

    @Test
    public void isDeepCloning() {

        //Given
        Book testBook1 = new Book("Ogniem", "Henryk",LocalDate.of(1886, 2, 15));
        Book testBook2 = new Book("Mieczem", "Sienkiewicz", LocalDate.of(1886, 2, 15));

        Library library = new Library("First Library");
        library.getBooks().add(testBook1);
        library.getBooks().add(testBook2);
        Library clonedLibrary = null;

        //When
        try {
            clonedLibrary = library.deepCopy();
            clonedLibrary.setName("Second Library");
        } catch (Exception e) {
            System.out.println(e);
        }

        library.getBooks().remove(testBook2);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);

        Assert.assertEquals(1, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
    }


}
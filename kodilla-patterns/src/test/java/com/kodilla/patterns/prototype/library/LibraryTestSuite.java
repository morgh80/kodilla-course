package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.time.LocalDate;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LibraryTestSuite {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testGetBooks() {
        //Given
        Book testBook1 = new Book("Ogniem", "Henryk", LocalDate.of(1886, 2, 15));
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
    public void isShallowCloning() throws CloneNotSupportedException {

        //Given
        Book testBook1 = new Book("Ogniem", "Henryk", LocalDate.of(1886, 2, 15));
        Book testBook2 = new Book("Mieczem", "Sienkiewicz", LocalDate.of(1886, 2, 15));

        Library library = new Library("First Library");
        library.getBooks().add(testBook1);
        library.getBooks().add(testBook2);
        Library clonedLibrary = null;

        //When
        clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("Second Library");

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
    }

    @Test
    public void isDeepCloning() throws CloneNotSupportedException {

        //Given
        Book testBook1 = new Book("Ogniem", "Henryk", LocalDate.of(1886, 2, 15));
        Book testBook2 = new Book("Mieczem", "Sienkiewicz", LocalDate.of(1886, 2, 15));

        Library library = new Library("First Library");
        library.getBooks().add(testBook1);
        library.getBooks().add(testBook2);
        Library clonedLibrary = null;

        //When
        clonedLibrary = library.deepCopy();
        clonedLibrary.setName("Second Library");

        library.getBooks().remove(testBook2);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);

        Assert.assertEquals(1, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
    }

    @Test(expected = CloneNotSupportedException.class)
    public void throwsCloneNotSupportedException() throws CloneNotSupportedException {
        //given
        Library libraryMock = mock(Library.class);
        when(libraryMock.shallowCopy()).thenThrow(new CloneNotSupportedException());
        //then
        libraryMock.shallowCopy();
    }

}

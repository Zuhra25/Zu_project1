package packProject2;

import javax.swing.*;

public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return String.format("Книга - %s, %nАвтор - %s, %nГод - %s%n", title, author, year);
    }


    public boolean equals(Book other) {
        return this.year == other.year;
    }

    public int hashCode() {
        return java.util.Objects.hash(title, author, year);
    }
}





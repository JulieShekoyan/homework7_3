package com.company;


public class Main {

    public static void main(String[] args) {
        Author author = new Author("Russel", "Winderand");
        Book book = new Book("Developing Java Software", author, 79.75);
        System.out.println(book.toString());
    }
}

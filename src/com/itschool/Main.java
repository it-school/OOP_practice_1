package com.itschool;

public class Main {

    public static void main(String[] args)
    {
        Book book1 = new Book();
        book1.setTitle("Букварь");
        book1.setGenre("учебная литература");
        book1.setAuthors("В.Г. Городецкий");
        book1.setPages(-40);

        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthors());
        System.out.println(book1.getGenre());
        System.out.println(book1.getPages());

        Book book2 = new Book("Second", "unknown", "", 1000);
        System.out.println(book2);


        Book book3 = new Book("Синенькая", "роман", "Иванов, Петров, Сидоров", 1000);
        System.out.println(book3);

        System.out.println(book3.IsThisAuthor("Иванов"));

    }
}

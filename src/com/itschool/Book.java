package com.itschool;

import java.util.Arrays;

public class Book
{
    private String title;
    private String genre;
    private String []authors;
    private int pages;
    // TODO     добавить использование enum для типа обложки: https://proft.me/2015/03/29/primer-raboty-s-perechisleniyami-enum-v-java/

    public Book()
    {
    }

    public Book(String title, String genre, String authors, int pages) {
        this.title = title;
        this.genre = genre;
        this.setAuthors(authors);
        this.setPages(pages);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthors() {
        return Arrays.toString(this.authors);
    }

    public void setAuthors(String authors) {
        if (authors.length() > 0)
            this.authors = authors.split(",");
        else
        {
            this.authors = new String[1];
            this.authors[0] = "Unknown author";
        }

        /*
        int n = authors.indexOf(","), k = 1;

        if (n>=0)
        {
            do
                {
                    k++;
                    // TODO     учесть запятые в самом начале и в самом конце строки, а так же несколько запятых подряд (рядом)
                   // System.out.println(n);
                }while ((n = authors.indexOf(",", n+1)) > 0);

            this.authors = new String[k];

            do
            {
                this.authors = authors.split(",");
            }while ((n = authors.indexOf(",", n+1)) > 0);

        }
        else
        {
            this.authors = new String[k];

            if (authors.length() > 0)
                this.authors[0] = authors;
            else
                this.authors[0] = "Unknown author";
        }
        */
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = (pages > 0 ? pages : 1);
    }

    @Override
    public String toString() {
        return "Book {" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", authors='" + this.getAuthors() + '\'' +
                ", pages=" + pages +
                '}';
    }

    public boolean IsThisAuthor(String author)
    {
        boolean result = false;

        for (String currentAuthor: this.authors )
        {
            if (currentAuthor.equals(author))
            {
                result = true;
                break;
            }
        }

        return result;

    }
}

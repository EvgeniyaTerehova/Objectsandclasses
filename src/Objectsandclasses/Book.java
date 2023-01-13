package Objectsandclasses;

public class Book {
   private String title;
   private Author author;
   private int yearOfPublication;


    public Book (String title, Author author, String yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = Integer.parseInt(yearOfPublication);
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public String fullBook(){
        String fullBook = (this.title + " " + this.author + " " + this.yearOfPublication);
        return fullBook;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}

package Objectsandclasses;

public class Main {

    public static void main(String[] args){
        Author alexander = new Author("Александр", "Куприн");
        Book olesya = new Book("Олеся",alexander, "2007");

        System.out.print(olesya.getAuthor().getFullName() + " ");
        System.out.print(olesya.getTitle() + " ");
        System.out.println(olesya.getYearOfPublication());
        olesya.setYearOfPublication(2008);
        System.out.println(olesya.getYearOfPublication());

        Author lev = new Author("Лев", "Толстой");
        Book voskresenie = new Book("Воскресение", lev , "2017");

        System.out.print(voskresenie.getAuthor().getFullName() + " ");
        System.out.print(voskresenie.getTitle() + " ");
        System.out.println(voskresenie.getYearOfPublication());
    }
}

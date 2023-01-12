package Objectsandclasses;

public class Author {
   String name;
   String surname;

    public  Author(String name,String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public String getFullName() {
        String fullName = (this.name + " " + this.surname);
        return fullName;
    }
}

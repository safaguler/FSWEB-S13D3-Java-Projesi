package com.workintech.model;

public class Person {
    String firstName;
    String lastName;
    int age;
    boolean isMarried;
    String[] langs;
    String adress;
    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }
    public Person (String firstName, String lastName, int age, boolean isMarried, String[] langs, String adress ) {
        this(firstName, lastName, age);
        this.isMarried = isMarried;
        this.langs = langs;
        this.adress = adress;
    }
    public  String getFirstName() {
        return firstName;
    }
    public  String getLastName() {
        return lastName;
    }
    public  int getAge() {
        return age;
    }
    public  boolean isTeen() {
        if (age<13 || age>19){
            return false;
        };
        return true;
    }
}

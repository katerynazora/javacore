package com.zora.app.classwork.lesson12;

/**
 * Created by Kateryna Zora  on 25.04.2017.
 */
public class Person {
    protected String name;
    protected String university;
    protected  int age;
    protected  int salary = 200;

// Alt - Insert - Constructor
    public Person(String name) {
        this.name = name;
    }
    public Person (String name, String university, int age){
        this(name);
        this.university = university;
        this.age = age;
    }

    public void printSalaryInfo(){
        System.out.println(" salary info: " + salary);
    }
    protected void printPersonInfo(){
        System.out.println("Person's info: " + name);
    }
}

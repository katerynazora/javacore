package com.zora.app.classwork.lesson12;

/**
 * Created by Kateryna Zora  on 25.04.2017.
 */
public class Person {
    private String name;
    private String university;
    private  int age;
    private  int salary;

    public String getName() {
        return name;
    }
    public String getUniversity() {
        return university;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Alt - Insert - Constructor
    public Person(String name) {
        this.name = name;
    }
    public Person (String name, String university, int age, int salary){
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

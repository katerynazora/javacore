package com.zora.app.classwork.lesson12;

/**
 * Created by Kateryna Zora  on 25.04.2017.
 */
public class Student extends Person{

//    public String university;
//    public int age;

    public Student(String name, String university, int age, int salary) {
        super(name, university, age, salary); // унаследует класс, ссылка на обяект перинт класса
    }
    public void  printStudentInfo(){
        System.out.println("Student's info:  name: " + getName() + " university: " + getUniversity() + " age: " + getAge());
    }
    public void printPersonInfo(){
        System.out.println("Person's info: " + getName());
    }
    @Override
    public void printSalaryInfo(){
        System.out.println(" Student salary info: " + getSalary());
    }
}

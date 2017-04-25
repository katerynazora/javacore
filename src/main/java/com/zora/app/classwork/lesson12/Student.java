package com.zora.app.classwork.lesson12;

/**
 * Created by Kateryna Zora  on 25.04.2017.
 */
public class Student extends Person{

    public String university;
    public int age;
    //public int salary = 500;

    public Student(String name, String university) {
        super(name); // унаследует класс, ссылка на обяект перинт класса
        this.university = university;
    }
    public void  printStudentInfo(){
        System.out.println("Student's info:  name: " + name + " university: " + university + " age: " + age);
    }
    public void printPersonInfo(){
        System.out.println("Person's info: " + name);
    }
    @Override
    public void printSalaryInfo(){
        System.out.println(" Student salary info: " + salary);
    }
}

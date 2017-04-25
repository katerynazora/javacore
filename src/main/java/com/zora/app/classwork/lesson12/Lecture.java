package com.zora.app.classwork.lesson12;

/**
 * Created by Kateryna Zora  on 25.04.2017.
 */
public class Lecture extends Person {
    public int experience;
    public String degree;
    public String faculty;
    public int salary = 5000;


    public Lecture(String name, String university, int age, int experience, String degree, String faculty) {
        super(name, university,age);
        this.experience = experience;
        this.degree = degree;
        this.faculty = faculty;

    }
    public void printLectureInfo(){
        System.out.println("Lecture's info:  name: " + name + " university: " + university + " age: " + age
        + " experience: " + experience + " degree: " + degree + " faculty " + faculty);
    }
    @Override
    public void printSalaryInfo(){
        System.out.println(" Lecture salary info: " + salary);
    }
}

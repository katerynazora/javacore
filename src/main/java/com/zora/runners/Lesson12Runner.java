package com.zora.runners;

import com.zora.app.classwork.lesson12.Lecture;
import com.zora.app.classwork.lesson12.Person;
import com.zora.app.classwork.lesson12.Student;

/**
 * Created by Kateryna Zora  on 25.04.2017.
 */
public class Lesson12Runner {
    public static void main(String[] args) {
        String name = "Ketryn";
        String university = "NAU";
        Student student = new Student(name, university);//  new Student() -     Ctrl + Alt + V
        //student.university = "NAU";
        student.age = 20;
        student.printPersonInfo();

        student.printStudentInfo();

        int experience = 15;
        String degree = "Ph.D";
        String faculty = "FPS";
        int age = 35;
        Lecture lecture = new Lecture(name,university,age,experience,degree,faculty );
        lecture.degree = "Ph.D";
        lecture.printLectureInfo();

        lecture.printSalaryInfo();
        student.printSalaryInfo();

    }
}

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
        Student student = new Student(name, university, 20, 500 );//  new Student() -     Ctrl + Alt + V
        //student.university = "NAU";
        student.setAge(20);
        student.setSalary(500);
        student.printPersonInfo();

        student.printStudentInfo();

        int experience = 15;
        String degree = "Ph.D";
        String faculty = "FPS";
        //int age = 35;
        Lecture lecture = new Lecture(name, university, 34, 200, experience, degree, faculty);
        lecture.degree = "Ph.D";
        lecture.setAge(35);
        lecture.setSalary(5000);
        lecture.printLectureInfo();

        lecture.printSalaryInfo();
        student.printSalaryInfo();

    }
}

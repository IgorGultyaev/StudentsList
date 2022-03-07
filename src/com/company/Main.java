package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String data;
        String[] studentData;
        do {
            System.out.println("Введите Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
            data = scanner.nextLine();
            if (!data.equals("")) {
                studentData = data.split(",");
                System.out.println(studentData.length);
                if (studentData.length > 2) {
                    Student student = new Student(studentData[0].trim(),
                            studentData[1].trim(),
                            studentData[2].trim());
                    if (students.contains(student)) {
                        System.out.println("Студент с таким номером студенческого билета уже сужествует");
                    }
                    ;
                    students.add(student);

                }
            }

        } while (!data.equals("end"));
        System.out.println(students.toString());
    }
}

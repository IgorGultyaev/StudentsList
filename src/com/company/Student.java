package com.company;

import java.util.Objects;

public class Student {
    public final String studentId;
    private String name;
    private String group;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    public int hashCode() {
        return Objects.hash(studentId);
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !object.getClass().equals(Student.class)) {
            return false;
        }
        return this.studentId.equals(((Student) object).studentId);
    }

    @Override
    public String toString() {
        return "Студент{" +
                "Номер билета='" + studentId + '\'' +
                ", ФИО='" + name + '\'' +
                ", Группа='" + group + '\'' +
                '}';
    }
}

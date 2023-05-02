package com.tpe.encapsulation;

public class TeacherRunner {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.setFirstname("John");
        System.out.println(teacher.getFirstname());
    }
}

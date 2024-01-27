package com.teachmeskills.lesson6.task2;

public class Runner {
    public static void main(String[] args) {
        Student student1 = new Student("name1", "surname1","passport1", "C27-onl");
        Student student2 = new Student("name2", "surname2","passport2", "C27-onl");
        Student student3 = new Student("name3", "surname3","passport3", "C27-onl");
        Student[] arr = new Student[] {student1, student2, student3};
        for (Student student : arr){
            System.out.println(student.name + ", " + student.surname + ", "
                    + student.passportNumber + ", " + student.groupName);
        }
    }
}

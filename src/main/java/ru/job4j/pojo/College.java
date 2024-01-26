package ru.job4j.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setSurname("Petrov");
        student.setPatronymic("Sergeevich");
        student.setGroupNumber(234);
        student.setAdmissionDate(new Date(123, 10, 8));
        System.out.println("Студент: " + student.getName()
                + " " + student.getPatronymic()
                + " " + student.getSurname()
                + ", номер группы: " + student.getGroupNumber()
                + ", дата поступления: " + new SimpleDateFormat("dd.MM.yyyy").format(student.getAdmissionDate()));
    }
}
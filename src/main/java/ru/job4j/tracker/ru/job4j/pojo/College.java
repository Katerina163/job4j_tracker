package ru.job4j.tracker.ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student stud = new Student();
        stud.setName("EVL");
        stud.setGroup("№ 123");
        stud.setEnrollment(new Date());
        System.out.println(stud.getName() + " в группе " + stud.getGroup() + " зачислен " + stud.getEnrollment());
    }
}

package com.school.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher cheche = new Teacher(1,"Cheche",700);
        Teacher davy = new Teacher(1,"David",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(cheche);
        teacherList.add(davy);

        Student tamasha = new Student(1,"Tamasha",4);
        Student nduhiu = new Student(2,"Antony Nduhiu",12);
        Student rabbi = new Student(3,"Rabbi",5);
        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(nduhiu);
        studentList.add(rabbi);


        School ghs = new School(teacherList,studentList);
        Teacher njeri = new Teacher(3,"Leila Njeri",100000);
        ghs.addTeacher(njeri);

        tamasha.payFees(5000);

        System.out.println("ghs has earned $"+ghs.getTotalMoneyEarned());

        nduhiu.payFees(6000);

        System.out.println("ghs has earned $"+ghs.getTotalMoneyEarned());

        System.out.println(".........Making GHS pay salary.......................");

        lizzy.recieveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to "+lizzy.getName() + " and now has "+ghs.getTotalMoneyEarned());


        davy.recieveSalary(3000);

        System.out.println("GHS has spent for salary to "+davy.getName() + " and now has "+ghs.getTotalMoneyEarned());

        System.out.println(tamasha );
        System.out.println(cheche);

    }
}

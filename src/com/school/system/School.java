package com.school.system;

import java.util.List;


/**
 * School has many teachers and students
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created
     * @param teachers a list of teachers
     * @param students a list of students
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }

    /**
     *
     * @return a list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Add a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * add a student to the school
     * @param student the student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     * @param MoneyEarned money that is supposed to be added
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update total money spent by the school
     * which is the salary given by the school to the teachers
     * @param MoneySpent money to be spent
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneySpent -= MoneySpent;
    }
}

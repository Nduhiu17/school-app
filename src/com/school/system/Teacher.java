package com.school.system;


/**
 * THis class is responsible for keeping track of teachers name,id and the salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    /**
     * creates a new Teacher object
     * @param id id for the teacher
     * @param name name for the teacher
     * @param salary salary for the teacher
     */
    public Teacher(int id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }


    /**
     * return id of the teacher
     * @return
     */
    public int getId(){
        return id;
    }

    /**
     * return the name of the teacher
     * @return
     */
    public String getName(){
        return name;
    }


    /**
     * return salary of the teacher
     * @return
     */
    public int getSalary(){
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }


    /**
     * adds to salary
     * Removes from the total money earned by the school
     * @param salary
     */
    public void recieveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Name of the Teacher: "+name + "Total salary earned: $"+salaryEarned;
    }
}

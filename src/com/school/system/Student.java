package com.school.system;


/**
 * this class is for student id name grade and fees
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Create new by initializing the value
     * @param id id of the student that is unique
     * @param name name of the student
     * @param grade grade of the student
     * fees for every student is 30000
     * fees initially paid is 0
     */
    public Student(int id,String name,int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
    }

    /**
     * used to update student grade
     * @param grade new grade for the student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }


    /**
     * keep adding the fees to fees paid field
     * add the fees to the fees paid
     * the school is going to receive the funds
     * @param fees fees that the student pays
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return totalfees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString(){
        return "Student's name: "+ name + " Total fees paid so far $ "+feesPaid;
    }
}

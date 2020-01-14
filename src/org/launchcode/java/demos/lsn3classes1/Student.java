package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    public static void main(String[] args){
        Student josh = new Student("Josh", 1,1,4.0);
    }

    public Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName() {
        return this.name;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public double getGpa() {
        return this.gpa;
    }

    private void setName(String n) {
        this.name = n;
    }

    private void setStudentId(int id){
        this.studentId = id;
    }

    private void setNumberOfCredits(int n){
        this.numberOfCredits = n;
    }

    private void setGpa(double n){
        this.gpa = n;
    }
}
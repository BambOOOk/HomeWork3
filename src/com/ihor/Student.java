package com.ihor;

/**
 * Created by ihor on 24.09.16.
 */
public class Student extends Person {

    String idNumber;
    double gpa;

    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber='" + idNumber + '\'' +
                ", gpa=" + gpa +
                "} " + super.toString();
    }
}

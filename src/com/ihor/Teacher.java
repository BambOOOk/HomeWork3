package com.ihor;

/**
 * Created by ihor on 24.09.16.
 */
public class Teacher extends  Person {
    double salary;
    String subject1;


    public Teacher(String name, int age, String gender, String subject1,double salary) {
        super(name, age, gender);
        this.salary = salary;
        this.subject1 = subject1;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject1() {
        return subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", subject1='" + subject1 + '\'' +
                "} " + super.toString();
    }
}

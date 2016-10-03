package com.ihor;

/**
 * Created by ihor on 26.09.16.
 */
public class CollegeStudent extends  Student {
    int year;
    String major;


    public CollegeStudent(String name, int age, String gender, int year, String major) {
        super ( name, age, gender );
        this.year = year;
        this.major = major;
    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "year=" + year +
                ", major='" + major + '\'' +
                "} " + super.toString();
    }
}

package com.example.springapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
   @Id 
    private int studentId;
    private String studentName;
    private int tamil;
    private int english;
    private int maths;
    private int science;
    private int socialScience;

    public Student() {
    }

    public Student(int studentId, String studentName, int tamil, int english, int maths, int science, int socialScience) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.tamil = tamil;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.socialScience = socialScience;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getTamil() {
        return tamil;
    }

    public void setTamil(int tamil) {
        this.tamil = tamil;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getSocialScience() {
        return socialScience;
    }

    public void setSocialScience(int socialScience) {
        this.socialScience = socialScience;
    }

   
}

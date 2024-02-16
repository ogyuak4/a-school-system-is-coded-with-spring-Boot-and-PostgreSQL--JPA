package com.example.demo44.studentprofile;

import com.example.demo44.student.Student;
import jakarta.persistence.*;

@Entity
public class StudentProfile {
    @Id
    @GeneratedValue
    private Integer id;
    private String bio;

    @OneToOne
    @JoinColumn(
            name="student_id"
    )
    private Student student; //student class'ında mapping yaparken buna bakıyor
    public StudentProfile() {
    }

    public StudentProfile(String bio) {
        this.bio = bio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}

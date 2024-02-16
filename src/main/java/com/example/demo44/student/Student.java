package com.example.demo44.student;

import com.example.demo44.school.School;
import com.example.demo44.studentprofile.StudentProfile;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id //her entityde bir adet private key olduğunu belirtmemiz şart
    @GeneratedValue
    private Integer id;
    @Column(name = "first_name", length = 31)
    private String firstname;
    private String lastname;
    @Column(unique = true)
    private String email;
    private int age;

    //cascade student silindiğinde s_profilenin de otomaktikmen silinmesini sağlıyo
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private StudentProfile studentProfile;

    @ManyToOne
    @JoinColumn(name="school_id")
    @JsonBackReference //errordan kaçındık bu sayede
    private School school;

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Student() {
    }

    public Student(String firstname, String lastname, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

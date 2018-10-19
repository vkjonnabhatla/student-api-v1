package com.student.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@Entity(name = "STUDENT")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STUDENT_ID")
    @JsonProperty("studentId")
    private int studentId;

    @Column(name = "STUDENT_NAME")
    @JsonProperty("studentName")
    private String studentName;

    @Column(name = "DOB")
    @JsonProperty("dob")
    private Date dob;

    @Column(name = "EMAIL")
    @JsonProperty("email")
    private String email;

    @JsonProperty("courses")
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID")
    private List<StudentCourseEntity> courses;
}

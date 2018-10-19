package com.student.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@Entity(name = "STUDENT_COURSE")
public class StudentCourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "STUDENT_ID")
    @JsonProperty("studentId")
    private int studentId;

    @Column(name = "COURSE_ID")
    @JsonProperty("courseId")
    private int courseId;
}

package com.student.api;

import com.student.model.Course;
import com.student.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-19T13:56:16.618Z")

@Controller
public class StudentApiController implements StudentApi {

    private static final Logger log = LoggerFactory.getLogger(StudentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StudentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addStudent(@ApiParam(value = "Student object that needs to be added to the database." ,required=true )  @Valid @RequestBody Student body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteStudent(@ApiParam(value = "Student Id to delete",required=true) @PathVariable("studentId") Long studentId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> getStudentById(@ApiParam(value = "ID of student to return",required=true) @PathVariable("studentId") Long studentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Student>(objectMapper.readValue("{  \"studentId\" : 0,  \"courses\" : [ {    \"courseName\" : \"courseName\",    \"courseId\" : 6  }, {    \"courseName\" : \"courseName\",    \"courseId\" : 6  } ],  \"dob\" : \"2000-01-23T04:56:07.000+00:00\",  \"studentName\" : \"studentName\",  \"email\" : \"email\",  \"status\" : \"Active\"}", Student.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateStudent(@ApiParam(value = "Student object that needs to be updated." ,required=true )  @Valid @RequestBody Student body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateStudentById(@ApiParam(value = "ID of student to update",required=true) @PathVariable("studentId") Long studentId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Course body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}

/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.student.api;

import com.student.model.Course;
import com.student.model.Student;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-19T13:56:16.618Z")

@Api(value = "student", description = "the student API")
public interface StudentApi {

    @ApiOperation(value = "Add new student information.", nickname = "addStudent", notes = "", tags={ "student", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Student object successfully added to the database."),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/student",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addStudent(@ApiParam(value = "Student object that needs to be added to the database." ,required=true )  @Valid @RequestBody Student body);


    @ApiOperation(value = "Delets student", nickname = "deleteStudent", notes = "", tags={ "student", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid Id supplied"),
        @ApiResponse(code = 404, message = "Student not found") })
    @RequestMapping(value = "/student/{studentId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteStudent(@ApiParam(value = "Student Id to delete",required=true) @PathVariable("studentId") Long studentId);


    @ApiOperation(value = "Get student by student Id", nickname = "getStudentById", notes = "", response = Student.class, tags={ "student", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Student.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Student not found") })
    @RequestMapping(value = "/student/{studentId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Student> getStudentById(@ApiParam(value = "ID of student to return",required=true) @PathVariable("studentId") Long studentId);


    @ApiOperation(value = "Update an existing student.", nickname = "updateStudent", notes = "", tags={ "student", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully updated student"),
        @ApiResponse(code = 400, message = "Invalid ID supplied."),
        @ApiResponse(code = 404, message = "Student not found"),
        @ApiResponse(code = 405, message = "Validation Exception") })
    @RequestMapping(value = "/student",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateStudent(@ApiParam(value = "Student object that needs to be updated." ,required=true )  @Valid @RequestBody Student body);


    @ApiOperation(value = "Update student data by ID", nickname = "updateStudentById", notes = "", tags={ "student", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation"),
        @ApiResponse(code = 405, message = "Invalid Input") })
    @RequestMapping(value = "/student/{studentId}",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateStudentById(@ApiParam(value = "ID of student to update",required=true) @PathVariable("studentId") Long studentId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Course body);

}

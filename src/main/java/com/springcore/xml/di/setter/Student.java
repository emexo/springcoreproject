package com.springcore.xml.di.setter;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Setter
public class Student {
    private int studentId;
    private String studentName;
    private Marks marks;

    public void  getStudentDetails(){
        log.info("Student ID: {}", studentId);
        log.info("Student Name: {}", studentName);
        if (marks != null) {
            marks.getMarksDetails();
        } else {
            log.info("Marks not set");
        }
    }
}

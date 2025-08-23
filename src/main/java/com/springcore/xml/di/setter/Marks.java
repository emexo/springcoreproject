package com.springcore.xml.di.setter;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Setter
public class Marks {
    private int math;
    private int science;
    private int english;

    public void getMarksDetails(){
        log.info("Math Marks: {}", math);
        log.info("Science Marks: {}", science);
        log.info("English Marks: {}", english);
    }
}

package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CourseRegistration {
      private int rollNo;
      private String studentName;
      private String courseName;
      private int semester;
      
      public CourseRegistration(@Value("101")int rollNo,@Value("Akhil")String studentName ) {
        this.rollNo=rollNo;
        this.studentName=studentName;
      }
      @Value("FSAD")
      public void setCourseName(String courseName) 
      {
        this.courseName=courseName;
      }
      @Value("4")
      public void setSemester(int semester)
      {
        this.semester=semester;
      }
      
      public void display() {
        System.out.println("rollNo:"+rollNo);
        System.out.println("studentName:"+studentName);
        System.out.println("courseName:"+courseName);
        System.out.println("semester:"+semester);
        
        }
      
 }

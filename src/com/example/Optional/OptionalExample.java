package com.example.Optional;

import java.util.Optional;

public class OptionalExample {
	
	    public static void main(String[] args) {
	    	
	    	//before option class used
	    	Student Student1 = getStudentWithName1("hamza");
	        if(Student1 != null){
	             System.out.println(Student1.getName());
	        }else {
	          System.out.println("no Student with the given name ");
	        }
	        
//************************************* //after using Optional class*************************
	        Optional<Student> student2 = Optional.ofNullable(getStudentWithName1("hamza"));
	        if (student2.isPresent()) {
	            System.out.println(student2.get().getName());
	        } else {
	            System.out.println("Student  is not present");
	        }

	    }
//*****************Using orElse*************************************
	    Student  student = Optional.ofNullable(getStudentWithName1("hamza")).orElse(new Student("no one", 0, "Unknown"));
	    System.out.println(student.getName());
//***********************************Using orElseThrow*****************************************	    
	    Student  student4 = Optional.ofNullable(getStudentWithName1("hamza")).orElse(new Student("no one", 0, "Unknown"));
        System.out.println(student4.getName());
//*********************************************************************
	   public  static Student  getStudentWithName1(String name ){
	        // lets suppose that our database contain only 2 students ahmed and hamza .
	        if (name.equals("hamza") || name.equals("ahmed")) {
	            return new Student(name , 22 , "Morocco");
	        } else {
	            return null ;
	        }
	   }
 
   

		/*
		 * public static Student getStudentWithName2(String name){ // lets suppose that
		 * our database contain only 2 students ahmed and hamza . if
		 * (name.equals("hamza") || name.equals("ahmed")) { return new Student(name , 22
		 * , "Morocco"); } else { return null ; }
		 * 
		 * }
		 */
	   
 //*******************************************************
	    	
	     
	}

}

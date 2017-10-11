/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softengassign.reg_sys_b;
/**
 *
 * @author cproc
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.joda.time.DateTime;

import com.softengassign.student_reg_system.Module;
import com.softengassign.student_reg_system.Course;
import com.softengassign.student_reg_system.Student;


public class Main 
{
    public static void main( String[] args )
    {
    	ArrayList<Student> studentListA = new ArrayList<>();
    	studentListA.add(new Student("Declan Powell", 27, "29/08/1990", 12345601) );
    	
    	ArrayList<Student> studentListB = new ArrayList<>();
    	studentListA.add(new Student("Brian McMahon", 23, "20/08/1994", 12345603) );
    	studentListB.add(new Student("Gary Casey", 28, "30/08/1989", 12345604) );
    	studentListB.add(new Student("Sarah Brady", 26, "24/03/1991", 12345602) );
        
        ArrayList<Student> studentListC = new ArrayList<>();
        studentListC.add(new Student("Brian McMahon", 23, "20/08/1994", 12345603) );
        studentListC.add(new Student("Declan Powell", 27, "29/08/1990", 12345601) );
        studentListC.add(new Student("Gary Casey", 28, "30/08/1989", 12345604) );
        studentListC.add(new Student("Sarah Brady", 26, "24/03/1991", 12345602) );
    	
    	ArrayList<Module> moduleList = new ArrayList<>();
    	moduleList.add(new Module("Mathematics", "CT123", studentListA) );
    	moduleList.add(new Module("Cryptography", "CT273", studentListA) );
    	moduleList.add(new Module("Software Engineering", "CT789", studentListB) );
    	moduleList.add(new Module("Machine Learning", "CT760", studentListB) );
        moduleList.add(new Module("Algorithms (Mandatory)", "CT567", studentListC) );

    	
    	ArrayList<Course> courseList = new ArrayList<>();
    	courseList.add(new Course("IT", moduleList, new DateTime(), new DateTime()) );

        HashMap<String, String> map = new HashMap<>();
    	
    	for( Course course : courseList ){
	    	for( Module module : course.getModuleList() ){
	    		for( Student s : module.getStudentList() ){
	    			String nameOfStudent = s.getName();
	    			if( !map.containsKey( nameOfStudent ) ){
	    				map.put( nameOfStudent, module.getName() );
	    			}
	    			else{
	    				map.put( nameOfStudent , map.get( nameOfStudent ) + ", " + module.getName() );
	    			}
	    		}
	    	}
	    	for( Entry<String, String> entry : map.entrySet() ){
	    		System.out.println("Student: " + entry.getKey() + "\t\tCourse: " + course.getName()  + "\t\tModules: " + entry.getValue() + "\n" );
	    	}
    	}
    }
}
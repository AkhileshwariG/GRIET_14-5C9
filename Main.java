import java.util.*;
import java.io.*;
import java.bufferReader.*;
import Student.*;
import Student.Array.Operation.*;
import StudentGroup.*;


public class Main {
	String student;
	BufferReader br= new BufferReader(args[0],",");
	public static void main(String[] args) 
	{
		Student s1=new Student[100];
		
		s1.setStudent( s, 1);
	s1.add( student, 2);
	s1.addFirst( student);
	s1.addLast( student);
	s1.remove(2);
	s1.remove(student);
	s1.removeFromIndex(2);
	s1.removeFromElement(s);
	s1.removeToIndex(2);
	s1.removeToElement(student);
	s1.getByBirthDate(28-10-1996);
	s1.getBetweenBirthDates(10-11-1989, 28-10-1996);
	s1.getNearBirthDate(28-10-1996,14);
	s1.getCurrentAgeByDate(12);
	s1. getStudentsByAge(20);
	s1.getStudentsWithMaxAvgMark();

	}

}

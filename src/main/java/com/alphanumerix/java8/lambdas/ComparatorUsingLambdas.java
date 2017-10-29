package com.alphanumerix.java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.alphanumerix.java8.data.Student;

public class ComparatorUsingLambdas {
	
	public static void main(String[] args) {
		Comparator<Student> enrollComparator = (a, b) ->  a.getEnrollNumber() - b.getEnrollNumber();
		Comparator<Student> nameComparator = (a, b) -> a.getName().compareTo(b.getName());
		Student[] studentArray = {
				new Student(111,"Vasanth","New Jersey"),
				new Student(123,"Raship", "Rutgers"),
				new Student(545,"Daniel", "Rochester")
		};
		List<Student> unSorted = Arrays.asList(studentArray);
		Collections.sort(unSorted, enrollComparator);
		
		for(Student student : unSorted) {
			System.out.println(student.getEnrollNumber());
		}
		
		Collections.sort(unSorted, nameComparator);
		for(Student student : unSorted) {
			System.out.println(student.getEnrollNumber()+":"+student.getName());
		}
	}

}

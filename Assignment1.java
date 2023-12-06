package pack;

import java.util.*;
import java.util.stream.*;

class Student
{
	String name;
	int index;
	int age;
	
	public Student(String name, int index, int age)
	{
		this.name = name;
		this.index = index;
		this.age = age;
	}
	
	public void print()
	{
		System.out.println(name);
		System.out.println(index);
		System.out.println(age);
	}
}

public class Assignment1 {
	
	Student createStudent(String name, int indexNo, int age)
	{
		return new Student(name, indexNo, age);
	}

	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("Jovan", "Prohor", "Tristan", "Matej", "Vangel");
		List<Student> students = Arrays.asList();
		
		names.stream().map(x -> x).forEach((i) -> 
		{
			students.add(new Student(i, (int)Math.random()*10000, (int)Math.random()*30));
		});
		students.stream().forEach((student) -> {
			System.out.print("Name: "+student.name+"  Age: "+ student.age + " Index: " +student.index);
		});
	}
}

package com.meltsan.cursoJava.tareaClasses.studentpackage;

public class Main {
	
	public static void main(String[] args) {
		Student student1 = new Student(1, "Vicente", 8.0, 8.5, 7.0);
		Student.increaseStudentCount();
		Student student2 = new Student(2, "Manuel", 8.0, 8.5, 7.0);
		Student.increaseStudentCount();
		Student student3 = new Student(3, "Alfredo", 8.0, 8.5, 7.0);
		Student.increaseStudentCount();
		System.out.println("Total de Estudiantes: " + Student.getStudentCount());
		System.out.println(student1.getDatos());
		System.out.println(student2.getDatos());
		System.out.println(student3.getDatos());
	}

}

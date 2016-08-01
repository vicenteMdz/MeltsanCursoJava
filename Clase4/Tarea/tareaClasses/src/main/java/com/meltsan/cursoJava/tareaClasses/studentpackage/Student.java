package com.meltsan.cursoJava.tareaClasses.studentpackage;

public class Student {

	private StudentRecord studentRecord;
	private int studentID;
	private static int studentCount = 0;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, double mGrade, double eGrade,
            double sGrade) {
		// TODO Auto-generated method stub
		this.studentID = id;
		this.studentRecord = new StudentRecord(name, mGrade, eGrade, sGrade);
	}
	
	public String getDatos(){
		return "Id de Estudiante: " + this.getStudentID()+
				"\nNombre de estudiante: " + this.studentRecord.getName() + 
				"\nGrado de Matemáticas: " + this.studentRecord.getMathGrade() + 
				"\nGrado de Ingles: " + this.studentRecord.getEnglishGrade() + 
				"\nGrado de ciencias: " + this.studentRecord.getMathGrade() + 
				"\nPromedio: " + this.studentRecord.getAverage();
	}
	
	public StudentRecord getStudentRecord() {
		return studentRecord;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public void setStudentRecord(StudentRecord studentRecord) {
		this.studentRecord = studentRecord;
	}
	
	public static int getStudentCount(){
	       return studentCount;
	}

	public static void increaseStudentCount(){
	       studentCount++;
	}
	
}

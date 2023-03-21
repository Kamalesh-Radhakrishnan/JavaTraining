package main;

public class StudentMarks {
	
	public static void main(String[] args) {
		Result student1 = new Result("Kamalesh",22,100,100,100);
		System.out.println(student1.getTotalMark());
	}
	
}

class Student{
	String name;
	int rollno;
	
	Student(String name,int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
}

class Exam extends Student{
	
	int mark1;
	int mark2;
	int mark3;
	
	Exam(String name,int rollno,int mark1,int mark2,int mark3){
		super(name,rollno);
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	
	
}

class Result extends Exam{
	int totalMark;
	
	Result(String name,int rollno,int mark1,int mark2,int mark3){
		super(name,rollno,mark1,mark2,mark3);
	}
	
	public int getTotalMark() {
		totalMark = mark1 + mark2 + mark3;
		return totalMark;
	}
}
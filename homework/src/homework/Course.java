package homework;

public class Course {

	public Course() {
		System.out.println("çalýþtým");
	}
	public Course(int id, String name, String teacher, int status) {
		this.id= id;
		this.name= name;
		this.teacher= teacher;
		this.status= status;
	}
	
	int id;
	String name;
	String teacher;
	int status;
}

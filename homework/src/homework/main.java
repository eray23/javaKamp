package homework;

public class main {

	public static void main(String[] args) {
		
		
		Course course1 = new Course();
		course1.id=123;
		course1.name= "java kampı";
		course1.teacher="Engin Demiroğ";
		course1.status= 20;
		
		Course course2 = new Course();
		course2.id=234;
		course2.name= "yazılım kampı";
		course2.teacher="Engin Demiroğ";
		course2.status= 10;
		
		Course course3 = new Course(456, "C kampı", "Engin Demiroğ", 15);
		
		
		Course[] courses = {course1, course2, course3};
		
		
		for(Course course : courses){
			System.out.println("Kurs ismi : " + course.name);
		}
		System.out.println("Mevcut Kurs Adedi : " + courses.length);
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.deleteCourse(course1);
		
	}

}

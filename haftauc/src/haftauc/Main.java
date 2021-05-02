package haftauc;

public class Main {

	public static void main(String[] args) {
		
		
		
		Instructor engin = new Instructor();
		engin.firstName= "Engin";
		engin.lastName=" Demiroğ";
		engin.question=" 2+2= ?";
		
		Student eray = new Student();
		eray.firstName = "Eray";
		eray.lastName= " Vural";
		eray.reply= " 5";
		
		UserManager userManager = new UserManager();
		userManager.add(engin);
		userManager.add(eray);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addQuestion(engin);
		StudentManager studentManager = new StudentManager();
		studentManager.addReply(eray);
		
	}

}

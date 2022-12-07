// real time program on 3 level upcasting 
class ManagementDashboard
{
	int noOfEmp=500;
	int noOfCourses=50;
	int noOfBranches=100;
	int noOfStudents =7000;
	void informationToManager()
	{
		System.out.println("This is managers information dashboard");
	}

	void checkFacultyDetails()
	{
		System.out.println("Click on trainer profile ");
	}
}

class FacultyDashboard extends ManagementDashboard
{
	String name="Karthik Sir";
	String course="core java ";
	int noOfStudentsInClass=130;
	void teach()
	{
		System.out.println("Teaches Excellent");
	}
	void assignment()
	{
		System.out.println("Gives Daily Assignments ");
	}
	void typeMessageToStudents()
	{
		System.out.println("Type Message to Students here!");
	}

	void shareScreen()
	{
		System.out.println("Share Screen to students");
	}

}

class StudentDashBoard extends FacultyDashboard

{
	String nameOfStudent="Praveen B Ronad";
	String courseOpted="Software testing";
	int noOfCoursesCompleted = 2;
	void joinClass()
	{
		System.out.println("joining class daily at 5PM");
	}

	void submitAssignment()
	{
		System.out.println("Do Assignment Daily and submit");
	}

	void typeMessageToFaculty()

	{
		System.out.println("Type Message to trainer here!");
	}
}


class OnlineLearningPlatform

{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Online Learning Portal!");

		StudentDashBoard ref1 = new StudentDashBoard(); // object creation and assigning ref variable to store address of the object

		// Properties of Management dashboard 
		System.out.println("Number of Emplyees are = " + ref1.noOfEmp);
		System.out.println("Number of Courses are = " + ref1.noOfCourses);
		System.out.println("Number of Brnaches  are = " + ref1.noOfBranches);
		System.out.println("Number of Students  are = " + ref1.noOfStudents);
		ref1.informationToManager();
		ref1.checkFacultyDetails();
		
		// properties of faculty Dasboard 
		System.out.println(ref1.name);
		System.out.println(ref1.course);
		System.out.println(ref1.noOfStudentsInClass);
		ref1.teach();
		ref1.assignment();
		ref1.typeMessageToStudents();
		ref1.shareScreen();

		// properties of Student Dash Board

		System.out.println(ref1.nameOfStudent);
		System.out.println(ref1.courseOpted);
		System.out.println(ref1.noOfCoursesCompleted);
		ref1.joinClass();
		ref1.submitAssignment();
		ref1.typeMessageToFaculty();

		FacultyDashboard ref2=ref1; // Upcasting assigning  StudentDashBoard() object to FacultyDashboard referance variable

		
		// it will show show properties of faculty and managment dashboard , it wont show studnetdashboard properties 
		
		System.out.println("Number of Emplyees are = " + ref2.noOfEmp);
		System.out.println("Number of Courses are = " + ref2.noOfCourses);
		System.out.println("Number of Brnaches  are = " + ref2.noOfBranches);
		System.out.println("Number of Students  are = " + ref2.noOfStudents);
		ref2.informationToManager();
		ref2.checkFacultyDetails();
		
		// faculty dashboard behaves like Mangament dashboard propeties 

		System.out.println(ref2.name);
		System.out.println(ref2.course);
		System.out.println(ref2.noOfStudentsInClass);
		ref2.teach();
		ref2.assignment();
		ref2.typeMessageToStudents();
		ref2.shareScreen();
		


		ManagementDashboard ref3=ref2;
		// ref3 only shows management dashboard properties 
		System.out.println("Number of Emplyees are = " + ref3.noOfEmp);
		System.out.println("Number of Courses are = " + ref3.noOfCourses);
		System.out.println("Number of Brnaches  are = " + ref3.noOfBranches);
		System.out.println("Number of Students  are = " + ref3.noOfStudents);
		ref1.informationToManager();
		ref1.checkFacultyDetails();
	}
}
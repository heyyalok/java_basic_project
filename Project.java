package project.ece;

class Studentdetail{
	String studentname1;
	String studentname2;
	String studentname3;
	String unirollno1;
	String unirollno2;
	String unirollno3;
	public void studentintro() {
		System.out.println("Name of 1st student "+studentname1);
		System.out.println("Roll no of 1st student "+unirollno1);
		System.out.println("Name of 2nd student "+studentname2);
		System.out.println("Roll no of 2nd student "+unirollno2);
		System.out.println("Name of 3rd student "+studentname3);
		System.out.println("Roll no of 3rd student "+unirollno3);
		System.out.println("--------------------------------------------");
	}
	
}
class Student{
	char groupname;
	String projectname;
	String guidename;
	float expenses;
	float eachshare;
	
	
	public void intro(){
		System.out.println("Group name :- "+groupname);
		System.out.println("Project name :- "+projectname);
		System.out.println("Guide name :- "+guidename);

	}
	
	
	public void price() {
		System.out.println("Total cost of making the project is "+expenses+"Rs");
		System.out.println("Share for each student in a group is "+eachshare+"Rs");
	}
	
	
	public void projectcategory1() {
		System.out.println("Project category :- Software based");	
	}
	
	
	public void projectcategory2() {
		System.out.println("Project category :- Hardware based");
	}
	
}
public class Project {
    public static void main(String[]args) {
    	System.out.println("ECE 7th z1");
    	System.out.println("Total students 30");
    	System.out.println("No of groups formed = 10");
    	System.out.println("No of mentors = 10");
    	System.out.println("--------------------------------------------");
    	
    	
    	//details of 1st group
    	Student firstgroupdetails = new Student();
    	firstgroupdetails.groupname = 'A';
    	firstgroupdetails.projectcategory1();
    	firstgroupdetails.projectname = "Small travel website (front-end)";
    	firstgroupdetails.guidename = "Mr. Mohit Kaushik";
    	firstgroupdetails.intro();
    	firstgroupdetails.expenses = 5100;
    	firstgroupdetails.eachshare = 1700;
    	firstgroupdetails.price();
    	Studentdetail firstgroupstudentname = new Studentdetail();
    	firstgroupstudentname.studentname1 = "Hritik ";
    	firstgroupstudentname.unirollno1 = "ECE-1801";
    	firstgroupstudentname.studentname2 = "Simranpreet";
    	firstgroupstudentname.unirollno2 = "ECE-1802";
    	firstgroupstudentname.studentname3 = "Manvi";
    	firstgroupstudentname.unirollno3 = "ECE-1803";
    	firstgroupstudentname.studentintro();
    	
    	
    	//details of 2nd group
    	Student secondgroupdetails = new Student();
    	secondgroupdetails.groupname = 'B';
    	secondgroupdetails.projectcategory2();
    	secondgroupdetails.projectname = "IOT based home automation ";
    	secondgroupdetails.guidename = "Mr. Rajesh Arora";
    	secondgroupdetails.intro();
    	secondgroupdetails.expenses = 4500;
    	secondgroupdetails.eachshare = 1500;
    	secondgroupdetails.price();
    	Studentdetail secondgroupstudentname = new Studentdetail();
    	secondgroupstudentname.studentname1 = "Manpreet";
    	secondgroupstudentname.unirollno1 = "ECE-1804";
    	secondgroupstudentname.studentname2 = "Dipendra";
    	secondgroupstudentname.unirollno2 = "ECE-1805";
    	secondgroupstudentname.studentname3 = "Aakash";
    	secondgroupstudentname.unirollno3 = "ECE-1806";
    	secondgroupstudentname.studentintro();
    	
    }

}
 

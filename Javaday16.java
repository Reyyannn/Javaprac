package prac;

public class Javaday16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student aastha = new Student ("aastha", 20, "austin");
		aastha.displayName();
		
		Teacher kasanda= new Teacher ("kasanda", 24, "austin", 2000);
		kasanda.dailybonus();
		//kasanda.displayName();
		
		StudentA lily= new StudentA ("lily", 29);
		lily.displayNamee();
		
		teacherA maya= new teacherA("maya", 31, 3000);
	    maya.displayage();
	    maya.displaysalary();
	    
	    professor kloe= new professor("kloe", 40, 3500, "nepali");
	    
	    System.out.println(kloe.fullname);
	    System.out.println(kloe.age);
	    System.out.println(kloe.salary);
	    System.out.println(kloe.spec);
	    
	    kloe.displayage();
	    kloe.displayNamee();
	    kloe.displaysalary();
	    kloe.displayspec();                //why is it sysout null
	    
	    
	    Dad yuba= new Dad("yuba", "acharya");
	    daughter aasthaa= new daughter("aastha", "yuba", "acharya");
	    Son anish= new Son("anish", "yuba", "acharya");
	    
	    yuba.displayname();
	    aasthaa.displaydname();
	    anish.displaysname();
	    
	    Sonsdad yubbaraj= new Sonsdad("yubbaraj", "acharyaa");
	    yubbaraj.displayname1();
	    
	    Sonsdaughter rosey= new Sonsdaughter("rosey", "yubbaraj", "Acharya");
	    rosey.displaynamme();
	    
	    System.out.println(rosey.firstname);
	    System.out.println(rosey.lastname);
	    System.out.println(rosey.name3);
	    
	    Granddaughter hollla= new Granddaughter ("hollla", "yubaraj", 21, 50);
	    
	    System.out.println(hollla.lastnamee);
	    System.out.println(hollla.lastname);
	    System.out.println(hollla.firstnamee);
	    System.out.println(hollla.firstname);
	    System.out.println(hollla.family);
	    System.out.println(hollla.age);
	    
	    hollla.displayyname();
	    hollla.displayname1();
	    
	    Sonsdad yubbaraj1= new Sonsdad("yubaraj","acharua");
	    Sonsdaughter rosey1= new Sonsdaughter("rosey", "yubaraj","acharya");
	    Granddaughter hollaa= new Granddaughter("hollla", "yubaraj", 21, 50);
	    
	    yubbaraj1.displayname1();
	    rosey1.displaynamme();
	   
	    
	}

}

//single inheritance 

class Student {
	String fullname;
	int age;
	String city; 
	
	public Student(String fn, int ag, String cy) {
		this.fullname= fn;
		this.age= ag;
		this.city= cy;
	}
	
	public void displayName() {
		System.out.println(this.fullname);
	}
}

class Teacher extends Student {
	int salary;
	public Teacher(String fn, int ag, String cy, int salary) {
		super(fn, ag, cy);
		this.salary= salary;
	}
	public void dailybonus() {
		this.displayName();
		System.out.println(200);
	}
	
}

class StudentA {
	protected String fullname;
	protected int age;
	
	public StudentA(String fn, int ag) {
		this.fullname= fn;
		this.age= ag;
	
	}
	public void displayNamee() {
		System.out.println(this.fullname);
	}
}

class teacherA extends StudentA{
	int salary;
	public teacherA(String Fullname, int age, int salary) {
		super(Fullname, age);
		this.salary= salary;
	}
	
	public void displayage() {
		System.out.println(this.age);
		
	}
	public void displaysalary() {
		System.out.println(this.salary);
	}
}

//multilevel 

class professor extends teacherA {
	String spec;
	String fullname;
	int age;
	String salary;
	public professor(String fn, int ag, int salar, String spec) {
		super(fn, ag, salar);
		this.spec= spec;
			
	}
	
	void displayspec() {
		System.out.println(this.spec);
	}
}

//hierarchical

class Dad {
	String firstName;
	String lastName;
	
	public Dad(String fn, String ln) {
		this.firstName= fn;
		this.lastName= ln; 
		
	}
	void displayname() {
		System.out.println(this.firstName+this.lastName);
	}
	
}

class daughter extends Dad{
	String name1; 
	public daughter(String fn, String ln, String nam) {
		super(fn, ln);
		this.name1= nam;
		
		
	}
     void displaydname() {
    	 System.out.println(this.name1+this.firstName+this.lastName);
     }
	
	
}

class Son extends Dad{
String sname;
	public Son(String fn, String ln, String sname) {
		super(fn, ln);
		this.sname= sname;
	}
	void displaysname() {
		System.out.println(this.sname+this.firstName+this.lastName);
	}
	
}


class Sonsdad {
	String firstname; 
	String lastname; 
	public Sonsdad(String fn, String ln) {
		this.firstname= fn;
		this.lastname= ln; 
		
	}
	void displayname1() {
		System.out.println(this.firstname+this.lastname);
	}
}

class Sonsdaughter extends Sonsdad {
	String name3;
	public Sonsdaughter(String fn, String ln, String name3) {
		super(fn, ln);
		this.name3= name3;
		
	}
	
	void displaynamme() {
		System.out.println(this.firstname+this.lastname+this.name3);
	}
	
	
}

class Granddaughter extends Sonsdad{
      String firstnamee;
      String lastnamee;
      int age;
      int family;
	public Granddaughter(String fn, String ln, int ag, int fam) {
		super(fn, ln);
		this.family= fam;
	}
	void displayyname() {
		System.out.println(this.family);
	}
	
}




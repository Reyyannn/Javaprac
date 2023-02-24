package prac;

public class day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student aastha= new Student ("aastha", 20, "austin");
		aastha.displayName();
		
		
	}

}

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



class teacher {
	
}

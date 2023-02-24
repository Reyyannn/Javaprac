package prac;

public class inherity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		greatGrandMother khoi= new greatGrandMother();
		khoi.displayGGM();
		
		
		
		
		
		
		
		
	}

}

class greatGrandMother {
	String firstname;
	String lastname;
	
	public void displayGGM() {
		System.out.println(this.firstname+this.lastname);
	}
}

class Mother extends greatGrandMother{
	String motherMName= "khoi";
	
	public void displayMname() {
		System.out.println(this.motherMName+this.lastname);
	}
}

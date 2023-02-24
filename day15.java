package prac;

public class day15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// objectsss
		
		// without constructor 
		
		GrandMother tara= new GrandMother ();
		tara.displayGName();
		
		
		Mother sarswoti= new Mother ();           // conductor 
		
		System.out.println(sarswoti.firstName);
		System.out.println(sarswoti.lastName);
		System.out.println(sarswoti.motherName);
		
		
		sarswoti.displayGName();
		sarswoti.displayMname();
		
		
		Daughter aastha= new Daughter ();
		
		System.out.println(aastha.firstName);
		System.out.println(aastha.lastName);
		System.out.println(aastha.motherName);
		System.out.println(aastha.daughterName);
		
		aastha.displayGName();
		aastha.displayMname();
		aastha.displayDname();
		
		//with constructor 
		
		GrandMotherB taraa= new GrandMotherB ("tara", "adhikari");
		
		System.out.println(taraa.firstname2);
		System.out.println(taraa.lastname2);
		
		tara.displayGName();
		
		MotherB saraswoti= new MotherB ("tara", "saraswoti", "adikari");
		
		System.out.println(saraswoti.firstName1);
		System.out.println(saraswoti.firstname2);
		System.out.println(saraswoti.lastname2);
		
		saraswoti.displayFName();
		saraswoti.displayGName();
		
		
		daughterA aasthaa= new daughterA ("tara", "saraswoti", "aastha", "sarswoti" ); 
			
		System.out.println(aasthaa.dName);
		System.out.println(aasthaa.firstname2);
		System.out.println(aasthaa.lastname2);
		System.out.println(aastha.firstName);
		
		aastha.displayDname();
		aastha.displayGName();
		aastha.displayMname();
		
		
		
		
		
		
		
	}

}

  class GrandMother {
	  String firstName= "tara";
	  String lastName= "adhikari";
	  
	  public GrandMother(String gfn, String gln) {         //??? told me to create a constructor when I tried to add super gfn gln
		
	}

	public GrandMother() {
		
	}

	public void displayGName() {
		  System.out.println(this.firstName+this.lastName);
	  }
  }

  class Mother extends GrandMother {                             //extends gives you the grandmother inherit 
	  String motherName= "saraswoti";                  
	  
	  public void displayMname() {
		  System.out.println(this.motherName+this.lastName);
	  }
  }
  
  class Daughter extends Mother {
	  String daughterName= "aastha";
	  
	  public void displayDname() {
		  System.out.println(this.daughterName+this.motherName);
	  }
  }
  
  
  
  class GrandMotherB {
	  String firstname2;
	  String lastname2;
	  
	  public GrandMotherB(String fn2, String ln2) {
		  this.firstname2= fn2;
		  this.lastname2=ln2;
	  }
	  public void displayGName() {
		  System.out.println(this.firstname2+this.lastname2);
	  }
  }
  
                //with constructor 
  
  class MotherB extends GrandMotherB{
	  String firstName1;
	  public MotherB (String Gfn, String Gln, String Df) {
		  
		  //fn= tara 
		  //ln= adhikari
		  //daughter= sarswoti 
		  
		  super(Gfn, Gln);
		  this.firstName1= Df;
		   
	  }
	  
	  public void displayFName() {
		  System.out.println(this.firstName1+this.lastname2);
	  }
	  
	  
	  
  }
  
  class daughterA extends MotherB{
	  String dName;

	public daughterA(String Mfn, String Mln, String Df, String Dn) {
		super(Mfn, Mln, Df);
		this.dName= dName;
	}
	
	public void displaydName() {
		System.out.println(this.dName+this.lastname2);
	}
	  
  }
  
  
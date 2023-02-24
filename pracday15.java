package prac;

public class pracday15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		GrandFather ganesh= new GrandFather();
		ganesh.Displayname();
		
		
		Father yubaraj= new Father ();
		System.out.println(yubaraj.Fatherfirstname);
		System.out.println(yubaraj.firstName);
		System.out.println(yubaraj.lastName);
		
		yubaraj.displayname();
		yubaraj.Displayname();
		
		
		Son yuba= new Son ();
		System.out.println(yuba.Fatherfirstname);
		System.out.println(yuba.firstName);
		System.out.println(yuba.lastName);
		System.out.println(yuba.sonName);
		
		yuba.displayyname();
		yuba.displayname();
		yuba.Displayname();
		
		// with constructor 
		
		GrandFatherC ganeshh= new GrandFatherC ("ganeshh", "acharya");
		System.out.println(ganeshh.firsttname);
		System.out.println(ganeshh.lasttname);
		ganeshh.displayGname();
		
		FatherC yubaa= new FatherC ("ganesh", "acharya", "yubaa");
		System.out.println(yubaa.ffirstname);
		System.out.println(yubaa.firsttname);
		System.out.println(yubaa.lasttname);
		
		yubaa.displayName();
		yubaa.displayGname();
		
		
		SonC yubaR= new SonC ("ganesh", "acharya", "yubaR", "yubaa");
		System.out.println(yubaR.ffirstname);
		System.out.println(yubaR.firsttname);
		System.out.println(yubaR.lasttname);
		System.out.println(yubaR.sName);
		
		yubaR.displayGname();
		yubaR.displayNaame();
		yubaR.displayName();
	}

}

   class GrandFather {
	   String firstName= "ganesh";
	   String lastName= "acharya";
	  
	   public void Displayname() {
		   System.out.println(this.firstName+this.lastName);
	   }
   }
   
   class Father extends GrandFather{
	   String Fatherfirstname= "yubaraj";
	   
	   public void displayname() {
		   System.out.println(this.Fatherfirstname+this.lastName);
	   }
   }
   
   class Son extends Father {
	   String sonName= "yuba";
	   
	   public void displayyname() {
		   System.out.println(this.sonName+this.lastName);
	   }
   }
   
             //with constructor and child not having constructor 
   
  class GrandFatherC {
	  String firsttname;
	  String lasttname;
	  
	  public GrandFatherC (String fnn, String lnn) {
		  this.firsttname= fnn;
		  this.lasttname= lnn;
		  
	  }
	  public void displayGname() {
		  System.out.println(this.firsttname+this.lasttname);
	  }

	
  }
  
  class FatherC extends GrandFatherC {
      String ffirstname;
	public FatherC(String ffn, String lnn, String fn) {
		super(fn, lnn);
		
		this.ffirstname= ffn;
	}
	
	public void displayName() {
		System.out.println(this.ffirstname+this.lasttname);
	}
	
	  
	  
	 
  }
  
  class SonC extends FatherC {
	  String sName;

	public SonC(String fn, String ln, String sName, String fnn) {
		super(fn, ln, fnn);
		this.sName= sName; 
		
	}
	public void displayNaame() {
		System.out.println(this.sName+this.lasttname);
	}
	
	  
  }
package prac;

public class c14daypr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		log jav= new log ();             //this is for class log 
		jav.classs();
		
		
		 
		logB cat= new logB ();                    //this is for class log b
		//System.out.println(cat.name);
		
		cat.displayname1();
		
		//object of data
		
		values set= new values ();                //this is for class values
		set.city= "austin";
		System.out.println(set.city);
		
		
		
		//logC set1= new logC();
	//	System.out.println(set1.city);
		
		logC set1= new logC ();
		set1.city2 = "pune";
		System.out.println(set1.city2);
		
		set1.setcityName("bhaktapur");
		
	}

}
          class log{
        	  void classs () {
        		  System.out.println("students");
        	  }
        	  
          }
          
          class logB{
        	  private String name= "lily";
        	  
        	  private void displayname() {
        		  System.out.println(this.name);
        	  }
        	  
        	  void displayname1() {
        		  this.displayname();
        	  }
          }
      class values{
    	  String city= "austin";
    	  
      }
      
      
      class logC{
    	  private String city= "ktm";
    	  
    	  public String city2= "ktm";
    	  
    	  // setter
    	  
    	  public void setcityName(String km) {
    		  this.city= km;
    		  
    	  }
    	  
    	  //getter 
    	  
    	  public String getcityName() {
    		  return this.city;
    	  }
      }
          
          

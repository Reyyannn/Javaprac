package prac;

public class day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object of java 
		java JC= new java ();
		JC.class1();             //--- this should give you "hello class" you wrote from the method
		
		
		//objects of students 
		
		
		//students one= new students ();
		// System.out.println(one.name);           //------won't give anything so create another method 
		
	//	one.displayname1();          //---- this should give you the answer "lily"
		
		
		//object for dataclass1
		
		data1 setting= new data1();
		setting.city= "austin";
		System.out.println(setting.city);        //should print out austin
		
		
		//object for data2
		
		data2 setting1= new data2();
		//System.out.println(setting1.city);
		
		
		setting1.setCityName("nagarkot");
		String updatedCity= setting1.getCityName();
		System.out.println(updatedCity);                        //=----this should update the name from austin to nagarkot 
		
		// getting for data3 
		
		data3 setting2= new data3 ("ktm");
		System.out.println(setting2.getCity());          //------ should just give ktm
		
		setting2.setCity("dallas");
		System.out.println(setting2.getCity());        //---- should update the value to dallas
		
	}

}
         
        class java {
        	void class1() {                              //-----this is default 
        		System.out.println("hello class");
        	}
        	
        		
        }
        
        // /*  class students{
        //	private String name= "lily";
        	
        //	private void displayname() {
        //		System.out.println(this.name);
        //	}
        //	void displayname1() {
       // 		this.displayname1();
      //  	}
       // }
        
        class data1{
        	String city= "austin";
        	
        }
        
        class data2{
        	private String city= "austin";                    //----this is private 
        	
        	//setting the value
        	
        	public void setCityName(String aU) {         //---------public 
        		this.city= aU;
        	}
        	
        	// getting the value
        	
        	public String getCityName() {            //returning
        		return this.city;
        	}
        }
        
        
        
        class data3{
        	private String city;
        	
        	public data3(String ct) {
        		this.city= ct;
        	}
        	
        	void setCity(String citi) {
        		this.city=citi;
        		
        	}
        	//get the city 
        
        	String getCity() {
        		return this.city;
        	}
        	
        	
        }
        
        
        //default ---- declaration are visiable only withing the package
        //private or public pacage
        //private---- declaration are visible with the class only 
        // protected----- declaration are visibile within the package or all subclasses
        // public---- declarations are visiable everywhere 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
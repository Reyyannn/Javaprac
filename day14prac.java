package prac;

public class day14prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//getting and setting------ private public void return 
		// get private then make it visible (public)
		// then do default (class void sysout)
		
		
		data0 set = new data0 ();
		set.state= "canadaa";
		System.out.println(set.state);
		
		
		data1 set1= new data1();
	//	System.out.println(set1.state);
		
		
		data1 set0= new data1 ();
		
		
		
		
		
		
		
		
	}

}
       class data{
    	   private String state;
    	   
    	   public data(String sta) {
    		   this.state= sta;
    		   
    	//	void setStatee(String statee) {
    	//		this.state= statee;                  ???? don't know why its giving error 
    	//	}
    			
    		
    	   }
       }
       
       
       class data0{
    	   String state= "canada";
       }
       
       
       
       class date1{
    	   private String state = "canada";
    	   
    		
    	 void setState(String Ca) {
    		this.state= Ca;
    		
    	}
    	
    	public String getState() {
    		return this.state;
    	}
    	   
    	
    	
    	class data2 {
    		private String state;
    		
    		public data2 (String st) {
    			this.state= st;
    			
    		}
    		
    		void setState(String sta) {
    			this.state= sta;
    			
    		}
    		
    		String getState() {
    			return this.state;
    		}
    	}
    	
    	
       }
      
       

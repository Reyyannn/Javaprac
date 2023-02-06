package prac;

public class reverseString {
	
	public static void main(String[] args, char[] rev1) {
		//reverse String 
	
	String city = "bhaktapur";
	// 0   1   2   3    4     5   6   7    8   
	// b   h   a   k    t     a   p    u   r
	char a = city.charAt(3);
	System.out.println(a); //k
	System.out.println(city.length());
	
		String city1 = "ktm";
		int len = city.length();
		System.out.println(len);
		
		for(int i = 0; i <3; i++);
		System.out.println(city1.charAt(0));
		
		//reverse string 
		
	String country = "dubai";
	String rev = "";
	
	for(int i = 0 ; i < country.length() ; i++) {
		System.out.println(country.charAt(i));
		
		rev = country.charAt(i) + rev;
	}
			System.out.println(rev);
			
			
			//index in reverse
			
			String city2 = "kalanki";
			
			// 0    1    2    3   4    5    6    
			// k    a    l    a   n    k    i 
			
			for(int i = city.length()-1 ; i >=0 ; i--) {
				 System.out.println(i);
			
				
			
				
				//character reverse 
				
				String city3 = "balambhu";
				String rev2 = "";
				
				// 0    1     2     3     4      5     6      7
				// b    a     l     a     m      b     h      u
				
				System.out.println(city3.charAt (i));
				rev2 = rev2 + city3.charAt(i);
				
				// ""   +  a =======> u 
				// u    +  h =======>uh
				// uh    + b =======> uhb
				// uhb   + m =======> uhbm
				// uhbm  + a =======> uhbma
				// uhbma + l =======> uhbmal
				// uhbmal + a ======> uhbmala
				// uhbmala + b =====> uhbmalab
				
				
			}
	        System.out.println(rev2);
	
			
	
	
}
}




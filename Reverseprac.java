package prac;

public class Reverseprac {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub

		String city = "ktm";
       // 0    1   2  
	//    k    t   m 
		char a = city.charAt(3);
		System.out.println(a);
		System.out.println(city.length());

		String city1 = "bhaktapur";
		int len = city.length();
		System.out.println(len);

		for (int i = 0; i < 3; i++)
			;
		System.out.println(city.charAt(0));

		// reverse string

		String country = "Europe";
		String rev = "";

		for (int i = 0; i < country.length(); i++) {
			System.out.println(country.charAt(i));

			rev = country.charAt(i) + rev;
			System.out.println(rev);

		}
		//index in reverse 
		
		String city2 = "dhangadi";
		
		// 0   1    2    3    4    5    6    7
		// d   h    a    n    g    a    d    i 
		
		for(int i = city.length()-1 ; i >=0 ; i--) {
			System.out.println(i);
		}
		
		// character reverse 
		
		String city3= "dharan";
		String rev2 = "";
		
		// 0    1   2    3   4   5
		// d    h   a    r   a   n
		
	
		// System.out.println(city3.charAt(a));
		for(int k=0; k<city3.length();k++) {
			rev2= city3.charAt(k)+rev2;
			
		}
			
		//rev2= rev2 + city3.charAt(a);
		 
		// ""   +  a  ====> d
		// n    +  a =====> na
		// na   +  r =====> nar
		// nar  +  a =====> nara
		// nara +  h =====> narah
		// narah + d =====> narahd
		System.out.println(rev2);
	}
	  
	  
	   
	

}


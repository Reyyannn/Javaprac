package prac;

public class Stringday3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String city= "pokhara";
		System.out.println(city);
		
		// 0   1   2   3   4   5   6   
		// p   o   k   h   a   r   a
		
		for(int i = 0 ; i < 6; i++) {
			
			System.out.println(city.charAt(i));
		}

		// 0   1   2   3   4   5   6   
		// p   o   k   h   a   r   a
		for(int i = city.length()-1 ; i>=0 ; i--) {
			System.out.println(city.charAt(i));

		}
		//Program 3 
		//aastha ===> ahtsaa
		// balambhu ===> uhbmalab
		
		String country = "singapore";
				String rev = "";
		
		for(int i = 0 ; i < country.length() ; i++) {
			
			rev = country.charAt(i) +rev;
			System.out.println(rev);
			
		}
		System.out.println(rev);
		
		String city1 = "solukhumbu";
		String rev2 = "";
		
		for(int i = city1.length()-1 ; i >=0 ; i--) {
			rev2= rev2 + city1.charAt(i);
			
			// "" + a ====> u
			// u  + b ====> ub
			// ub + m ====> ubm
			// ubm + u ===> ubmu
			// ubmu + h ===> ubmuh
			// ubmuh + k ===> ubmuhk
			// ubmuhk + u ===> ubmuhk
			// ubmuhk + l ===> ubmukhl
			// ubmuhkl + o ===> ubmuhkl
			// ubmuhklo + s===> ubmukhlos
			
		}
		System.out.println(rev);
		
		
		//program4 
		String food = "bhaat daal tarkari rakshi";
		String userInput = "rakshi";
		if(food.contains(userInput)) {
			System.out.println("food is available");
			
		}
		else {
			System.out.println("fruit is not available");
			
		}
		//program5
		// aastha     "a"   "e"     "i"    "o"    "u"
		String firstName = "aastha";
		int count = 0;
		
		for(int i = 0 ; i <firstName.length() ; i++) {
			System.out.println(firstName.charAt(i));
			
			if(firstName.charAt(i)== 'a' || firstName.charAt(i)== 'e' || firstName.charAt(i)== 'i' || firstName.charAt(i)== 'o' || firstName.charAt(i)== 'u') {
				count = count +1;
				
			}
			
			System.out.println(count);
		}
		
		
	}

}

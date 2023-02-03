package prac;

public class day11pr {
	public static void main ( String  args ) {
		System.out.println("hello");
		


//creating a String 
		// program 1 
		String subject = "Iam learning selenium"; {
		String subject2 = "Iam learning python";
		String subject3 = "Iam learning java";
		System.out.println(subject); 
		System.out.println(subject2);
		System.out.println(subject3);
		
		//String + Integer ===> String
		// Integer + integer ===> Integer 
		// Integer + String ===> String
		// String + String ===> String 
		
		// program 2
		System.out.println("hello"+2); 
		System.out.println(3+2);
		System.out.println(3+3);
		System.out.println("3"+"3");
		
		//program 3
		// lengh() of string 
		
		String greet = "I am learning python";
		int a1 = greet.length();
		System.out.println(a1);
		System.out.println(greet.length());
		
		int x1 =80;
		System.out.println(x1);
		System.out.println("x1"); //x1
		
		// program 4
		String first = "Python";
		String second = "Learning";
		System.out.println(first+second);
		
		//program 5
		
		String three = "I am learning";
		String four = "java !";
		String five = three.concat(four);
		System.out.println(five);
		
		// program 6 
		String city = new String ("ktm");
		System.out.println(city);
		
		//program 7
		
		String city1= "bhaktapur";
		String cityU= city1.toUpperCase();
		System.out.println(cityU);
		
		String city2= "kulekhani";
		String cityL= city2.toLowerCase();
		System.out.println(cityL);
		
		String city3 = "india";
		System.out.println(city3.length());
		
		String country = "Dubai";
		int q3 = country.toUpperCase().toLowerCase().length();
		System.out.println(q3); 
		//"dubai".length()
		// 5.toUpperCase()
	
		}
	}
}
		
		
		
		
	

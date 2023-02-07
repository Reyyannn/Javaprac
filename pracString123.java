package prac;

public class pracString123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating string 
		//program 1
		String subject= "I am learning java";
		String subject2="I am learning ";
		String subject3= "I am learning selineum";
		System.out.println(subject);
		System.out.println(subject2);
		System.out.println(subject3);
		
		//program2
		System.out.println("hi"+2);
		System.out.println(2+2);
		System.out.println("4"+"4");
		System.out.println(4+"4");
		
		//program3
		//length of string
		
		String greet = "Learning java";
		int a = greet.length();
		System.out.println(a);
		System.out.println(greet.length());
		
		int y1= 100;
		System.out.println(y1);
		System.out.println("y1");
		
		//program 4
		String first ="java";
		String second = "is complicated";
		System.out.println(first+second);
		
		//program 5
		String three = "java";
		String four = "is great";
		String five = three.concat(four).concat("learning !");
		System.out.println(five);
		
		//program 6
		String city = new String("ktm");
		System.out.println(city);
		
		// program 7 
		String city1= "lalitpur";
		String cityU= city1.toUpperCase();
		System.out.println(cityU);
		
		String city2= "dhangadi";
		String cityL= city2.toLowerCase();
		System.out.println(cityL);
		
		String city3 = "ghantaghar";
		System.out.println(city3.length());
		
		String country = "Nepal";
		int a1 = country.toUpperCase().toLowerCase().length();
		System.out.println(a1);
		System.out.println("5".toUpperCase());
		
		String city4 = "bhaktapur";
		String city5 = "balambhu";
		String city6 = "bhaktapur";
		
		boolean result = city4.equals(city5);
		System.out.println(result);
		if (result) {
			System.out.println("city4 and city 5 equals");
		}
		else {
			System.out.println("city4 and city 5 not equal");
		}
		//compare city4 and city 5 with ternary operator 
		String result2= city4.equals(city6) ? "equal": "not equal";
		System.out.println(result2);
		
		//escape character 
		String example = "best \"if you don't have feelings\"";
		
		String city7 = "thachaina";
		boolean result3= city7.endsWith("a");
		boolean result4= city7.endsWith("ina");
		System.out.println(result3);
		System.out.println(result4);
		
		String city8 = "bhopal";
		boolean result5= city8.startsWith("b");
		boolean result6= city8.startsWith("bho");
		System.out.println(result5);
		System.out.println(result6);
		
		//program8
		String sen1= "I am learning";
		boolean result7 = sen1.contains("am");
		System.out.println(result7);
		
		//program 9
		String sen2= "java script";
		String result8= sen2.replace("j", "s");
		System.out.println(result8);
		
		String result9= sen2.replaceAll("java", "script");
		System.out.println(result9);
		
		String result10= sen2.replaceFirst("script", "java");
		System.out.println(result10);
		
		String city9= "birendranagar";
		//index starts from 0 
		//0  1  2  3  4  5  6  7  8  9 10 11 12   
		//b  i  r  e  n  d  r  a  n  a g  a   r
		char b= city9.charAt(8);
		System.out.println(b);
		System.out.println(city9.length());
		
		String city10= "khoi";
		//0   1   2  3  
		//k   h   o  i 
		int len = city10.length();
		System.out.println(len);
		
		for(int i = 0; i< len ; i++) {
			System.out.println(city10.charAt(i));
		}
		
	}

}

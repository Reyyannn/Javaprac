package prac;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "java is good";
		String q= str.substring(0, 5);
		System.out.println(q);
		
		//0  1  2   3   4   5   6   7  8  9  10 11
		//o  r  g   a   n   i   z   a  t  i  o  n
		String str1= "organization";
		String q1= str1.substring(11);
		System.out.println(q1);
		
		// 0 1  2  3  4
		// n e  p  a  l
		String str2= "nepal";
		String q2= str2.substring(1, 4);
		System.out.println(q2);
		
		// joining
		String str3= "hello";
		String str4= "I am happy learning java";
		String str5= "class";
		
		String b= String.join(" ", str3, str4, str5);
		System.out.println(b);
		
		String str6= "aastha.acharya";
		String str7= "yahoo.com";
		
		String c= String.join("@", str6, str7);
		System.out.println(c);
		
		String str8= "aastha";
		String str9= "is";
		String str10= "very tired";
		
		String d= String.join(".", str8, str9, str10);
		System.out.println(d);
		
		//program 3
		
		String city2= "balambhu";
		//0  1  2  3  4  5  6  7
		//b  a  l  a  m  b  h  u
		
		int q4= city2.indexOf('h');
		System.out.println(q4);
		
		String city3= "dharan";
		//0  1  2  3  4  5
		//d  h  a  r  a  n
		
		int q5= city3.indexOf("a",3 );
		System.out.println(q5);
		
		String city4= "dallas";
		for(int i= 1; i< city3.length(); i++) {
			if (city3.charAt(i)=='a') {
		
			}
			System.out.println(i);
			
		}
		
		//triming
		String city5= "aastha acharya";
		String city6= city5.trim();
		System.out.println(city6.length());
		System.out.println(city5.length());
		
		// if want to remove space in between
		String q6= city6.replace(" ", "");
		System.out.println(q6);
		
		//program4
		String q7= "learning coding is stressing";
		String[] q8= q7.split(" ");
		System.out.println(q8);
		
		//program5
		String firstName= "Reyyann is my nickname";
		String firstName1= "";
		
		boolean q9= firstName.isEmpty();
		System.out.println(q9);
		
		boolean q10= firstName1.isEmpty();
		System.out.println(q10);
		
		
	}

}

package prac;

public class pracall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int phrases = 0;
		String a= "larning java";
		String g= "hora";
		String h= "tara sakchu ki nai";
		String k= "sakincha dw";
		System.out.println(a);
		System.out.println(g);
		System.out.println(h);
		System.out.println(k);
		System.out.println(a + g);
		
		String meet= "java";
		int b= meet.length();
		System.out.println(b);
		System.out.println(meet.length());
		
		int j1= 300;
		System.out.println(j1);     //gives the value
		System.out.println("j1");   // gives j1
		
		String aa = "happy";
		String bb= "padhne";
		System.out.println(aa+bb);
		
		String one= "hora";
		String two= "haina hola";
		String three= "haha";
		String four= one.concat(three).concat("hai !");
		System.out.println(four);
		
		String city= "austin";
		String U= city.toUpperCase();
		System.out.println(U);
		
		String city1= "COLORADO";
		String L= city1.toLowerCase();
		System.out.println(L);
		
		String zero= "funnnn";
		String five= "horaaa";
		String six= zero.concat(five).concat("hehe @");
		System.out.println(six);
		
		String state= "caliii";
		int k1= state.toLowerCase().toUpperCase().length();
		System.out.println(k1);
		System.out.println("2".toUpperCase());                 /////what is it supposed to do???
		
		String ss= "dallas";
		String jj= "fr worth";
		String kkk= "dallas";
		boolean results= ss.equals(kkk);
		System.out.println(results);
		
		if(results) {
			System.out.println("ss is not equal to jj");
		}
		else {
			System.out.println("ss is equal to kkk");
		}
		String country3= "bali";
		String country4= "london";
		String country5= "USA";
		boolean result1= country3.equals(country5);
		System.out.println(result1);
		
		if(result1) {
			System.out.println("country4 is not equal to country3");
		}
		else {
			System.out.println("country5 is not equal country4");
		}
		
		String city6= "love";
		int qq2= city6.length();
		System.out.println(qq2);
		
		for(int i=0; i < city6.length();i++) {
			System.out.println(city6.charAt(i));
		}
		
		String city7= "dallass";
		int q3= city7.length();
		System.out.println(q3);                           //get the index of the value
		for(int i=0; i<city7.length();i++) {
			System.out.println(city7.charAt(i));       //you get all the char at singlyy
		}
		
		String citi= "dallas";
		String rev= " ";
		
		for(int i=0; i<citi.length();i++) {
			rev= citi.charAt(i)+rev;
			System.out.println(rev);           //gives all the character in reverse
			
		}
		
		String citi1= "austin";
		String rev1= " ";
		for(int i=0; i<citi1.length();i++) {
			rev1= citi1.charAt(i)+rev1;
			System.out.println(rev1);
			}
		
		String citi2= "colorado";
		String rev2= " ";
		for(int j=0; j<citi2.length();j++) {
			rev2= citi2.charAt(j)+rev2;
			System.out.println(rev2);
		}
		
		String l1 = "uff";
		for(int i=l1.length()-1;i>0; i--) {
			System.out.println(l1);
		}
		
		String kr= "hayeeere";
		for(int i= kr.length()-2; i>-1; i--) {
			System.out.println(kr);              //don't get itt
		}
		
		
		String state1= "san fransico";
		char n= state1.charAt(4);          //gives you the char of the index
		System.out.println(n);
		System.out.println(state1.length());     //gives the number of how many values 
		
		String state2= "canada";
		char m= state2.charAt(2);
		System.out.println(m);
		System.out.println(state2.length());
		
		String hh= "hary";
		String h2= hh.substring(1);          //get all the char after 1
		System.out.println(h2);
		
		
		String h4= "aastha";
		String h5= h4.substring(3);
		System.out.println(h5);
		
		String h6= "apun";
		String hh2= h6.substring(0);
		System.out.println(hh2);
		
		
		String j11= "hii";
		String l2= "hola";
		String l3= "come estas";
		String q33= String.join("$",j11, l2, l3);
		System.out.println(q33);
		
		String ff2= "namaskaram";
		String ff= "k xa halkhabar";
		String ww= String.join("&", ff2,ff);                  //joins everything 
		System.out.println(ww);
		
		String rr= "bonjur";
		String rr2= "mujhe pata nahi";
		String ww1= String.join("**", rr, rr2);
		System.out.println(ww1);
		
		String rr3= "hahaha";
		int rr4= rr3.indexOf("h", 2);                      //index of certain number
		System.out.println(rr4);
		
		String str= "hehehe";
		int rr5= str.indexOf("e",1);
		System.out.println(rr5);
		
		String hh6= "hello";
		String q6 []= hh6.split("l");
		System.out.println(q6);
		
		int numbers[]= new int [3];
		
		numbers[0]= 10;
		numbers[1]= 20;
		numbers[2]= 30;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);       
		
		int nums[]= new int [2];
		nums[0]= 100;
		nums[1]= 200;
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		
		for(int i=0; i<nums.length;i++) {
			System.out.println(nums[i]);           //gives you 100,200
		}
		
		int nums1[]= new int [3];
		nums1[0]= 101;
		nums1[1]= 202;
		nums1[2]= 303;
		
		for(int i=0; i<nums1.length;i++) {
			//System.out.println(nums1);            //gives you just reference 
			System.out.println(nums1[i]);
		}
		
		String lasname= "acharya";
		char a1 []= lasname.toCharArray();
		System.out.println(lasname.length());
		for(int i=0; i<a1.length;i++) {
		//	System.out.println(a1);                  // come all together seperately 
			System.out.println(a1[i]);               //lasname will come out char wise seperately 
		}
		
		String firname= "Rayenn";
		char q4 []= firname.toCharArray();
		System.out.println(firname.length());
		for(int i=0; i<q4.length;i++) {
			System.out.println(q4[i]);
		}
		
		String firstname= "lily";
		char q7[]= firstname.toCharArray();
		System.out.println(firstname.length());
		for(int i=0; i<q7.length;i++) {
			System.out.println(q7[i]);
		}
		
		String lastname= "rodriquez";
		char a3[]= lastname.toCharArray();
		System.out.println(lastname.length());
		for(int i=0; i<a3.length;i++) {
			System.out.println(a3[i]);
		}
		
		String [] qq4= {"austin, dallas, ftworth"};
		//System.out.println(qq4);
		for(int i=0; i<qq4.length;i++) {
			System.out.println(i);          //index
			System.out.println(qq4[i]);     //char
		}
		
		String [] [] qw1= {{"austin, colo, dalla"}, {"orlando, ohio, pens"}};
		System.out.println(qw1);
		for(int i=0; i<qw1.length;i++) {
			System.out.println(i);
			System.out.println(qw1[i]);            //will give just reference 
		}
		
		//condtional statement 
		//one input mutiple output

		int numbers1= 10;
		if (numbers1 < 0) {
		System.out.println("10 is greater/positive ");
		}
		else {
			System.out.println("0 is negative");
		}
		
		int numbers2 = 101;
		if(numbers2>50) {
		System.out.println("numbers2 is positive");
		}
		else {
			System.out.println("it is negative");
		}
		
		int numbers3= 0;
		if(numbers3>5) {
			System.out.println("numbers3 is negative");
		}
		else {
			System.out.println("it is false");
		}
		
		int numT= 10;
		if(numT >5 && numT >2) {
			System.out.println("get 10% discount");
		}
		else {
			System.out.println(" get 5% discount");
		}
		
		int numbers4= 5;
		if(numbers4 >2 && numbers4 <10) {
			System.out.println("you get 10% discount");
		}
		if (numbers4 <8 && numbers4 >4) {
			System.out.println("you also get 5% discount");
		}
		else {
			System.out.println("you get nothing");
		}
		
		int kl= 202;
		int jn= 303;
		int df= 222;
		
		if(kl<jn && jn>df) {
			System.out.println("it is true");
		}
		if(kl<jn) {
			System.out.println("true");
		}
		if(kl>jn) {
			System.out.println("wrong");
		}
		if(jn>df) {
			System.out.println("yes as well");
		}
		else {
			System.out.println("default");
		}
		
		//print 1 to 6
		for(int i=1; i<=6;i++) { 
			System.out.println(i);      //output would be 1-6 because it is increment 
		}
		
		for(int i=10; i>=5;i--) {
			System.out.println(i);         //output would be 10to 5 because it is decrementing
		}
		
		for(int i=5; i<=10;i++) {
			System.out.println(i);      // the output would be 5-10
		}
		
		for(int i=15; i>=10;i--) {      //the output would be true 15 is greater than 10 so it prints 15-10 decrementing
			System.out.println(i);
		}
		
		for(int i=3; i<5; i++) {
			System.out.println(i);
		}
		
		
		
	}

}

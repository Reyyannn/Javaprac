package prac;

public class PRAC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//program 1
		String line1 = "i am okay";
		String line2= "its valentines day ew";
		String line3= "being single rocks";
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		
		//program 2
		System.out.println("hi"+3);
		System.out.println("8"+"8");
		System.out.println(9+9);
		System.out.println("18"+18);
		
		//program3
		String welcome= "aastha";
		int a1= welcome.length();
		System.out.println(a1);
		System.out.println(welcome.length());
		
		int g1= 200;
		System.out.println(g1);
		System.out.println("g1");
		
		//program4
		String city2= "lalitpur";
		String U= city2.toUpperCase();
		System.out.println(U);
		
		String city3= "austin";
		String L= city3.toLowerCase();
		System.out.println(L);
		
		//program 5
		String one= "learning";
		String two= "is great";
		String three= one.concat(two).concat(" i guess");
		System.out.println(three);
		//program 6
		String country= "dubai";
		int j1= country.toUpperCase().toLowerCase().length();
		System.out.println(j1);
		System.out.println("4".toUpperCase());
		
		String citi6= "dhangadi";
		String citi2= "ktm";
		String citi1= "ktm";
		boolean result= citi6.equals(citi1);
		System.out.println(result);
		if (result) {
			System.out.println("citi6 and citi2 not equal");
		}
			else {
				System.out.println("citi2 and citi1 equals");
			}
		String city7= "bhaktapue";
		String city8= "dharan";
		String city9= "balambhu";
		boolean result1= city7.equals(city9);
		if (result1) {
			System.out.println("city7 and city8 not equal");
		}
			else {
				System.out.println("city9 and city 8 not equal");
			}
		String city10= "austin";
		int lulu= city10.length();
		System.out.println(lulu);
		
		 for(int j=0; j< lulu; j++) {
			 System.out.println(city10.charAt(j));
		 }
		 String citi0= "dharan";
		 String rev4= "";
		 for(int i=0; i<citi0.length();i++) {
			 rev4= citi0.charAt(i)+rev4;
			 System.out.println(rev4);
			 }
		String citi00= "bhaptapur";
		for(int i= citi00.length()-1; i>0; i--) {
			System.out.println(i);
		}
		
		String country2= "bali";
		char c= country2.charAt(3);   //i
		System.out.println(c);
		System.out.println(country2.length());
		
		String q1= "java";
		String qq2= q1.substring(0);
		System.out.println(qq2);
		//program8 
		
		String a= "i";
		String b= "love";
		String c1= "austin";
		
		String d= String.join("*", a, b, c1);
		System.out.println(d);
		
		String city101= "bhaktapur";
		int q11= city101.indexOf('k');
		System.out.println(q11);
		
		String city102= "kapan";
		int q12= city102.indexOf("p",1);      ///?????
		System.out.println(q12);
		//program 9
		String q13= "learning java";
		String[] q14= q13.split(" ");
		System.out.println(q14);
		
		int numms[]= new int[4];
		numms[0]= 20;
		numms[1]= 30;
		numms[2]= 40;
		numms[3]= 50;
		System.out.println(numms[0]);
		System.out.println(numms[1]);
		System.out.println(numms[2]);
		System.out.println(numms[3]);
	
		int nums[]= new int [3];
		nums[0]= 200;
		nums[1]= 300;
		nums[2]= 400;
		System.out.println(nums.length);
		for(int i=0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		//program9
		String firstName= "arpan";
		char[] a20= firstName.toCharArray();
		System.out.println(firstName.length());
		for(int i=0; i<a20.length; i++) {
			System.out.println(a20[i]);
		}
		
	//program 10
		String [] citii22= {"cali", "austin", "dallas"};
		System.out.println(citii22[0]);
		for(int i=0; i<citii22.length;i++) {
			System.out.println(i);
		System.out.println(citii22[i]);
		}
	//	how to print only one citi from the multiple string???????
		
		// multidemensional array??
		// aeiou????
		//count????
		
		//conditional statement 
		//one input multiple outcome
		int number= 100;
		if(number > 0) {
			System.out.println("it is positive");
		}
			else {
				System.out.println("it is negative");
			}
		int a3= 200;
		int b4= 300;
		if(a3>b4) {
			System.out.println("a3 is smaller");
		}
		else {
			System.out.println("b4 is greater");
		}
		
		int numT= 5;
		if(numT >0 && numT<=10) {
			System.out.println("5% discount");
		}
			if(numT >1 && numT<=0) {
				System.out.println("10%discount");
			}
		if(numT >5 && numT<=10) {
			System.out.println("20%disount");      ///???? 
		}
		int marks= 90;
		if(marks >80) {
		System.out.println("Grade B");
		}
		if(marks >92) {
		System.out.println("grade A");
		}
		if(marks <89) {
		System.out.println("grade c");
		}
		if(marks >95) {
		System.out.println("grade d");
		}
		else if(marks<85) {
			System.out.println("grade e");
		}
		else if(marks>90) {
		System.out.println("grade f");
		}
		else {
			System.out.println("it is default");
		}
		
		int ch= 100;
		int hg= 200;
		int bh= 300;
		
		if(ch>hg) {
			System.out.println("hg is greater");
		}
		if(bh>hg) {
			System.out.println("bh is greater");
		}
		if(hg>ch) {
			System.out.println("hg is greater");
		}
		else if(hg<bh) {
			System.out.println("bh is greater");
		}
		if(ch>hg) {
			
		}
			if(bh>hg) {
				System.out.println("bh is greater");
		}
			else if(hg>ch) {
				
			}
			if (ch>bh) {
					System.out.println("hg is greater ");
				}
			
          if(ch>bh && hg<bh) {
        	  System.out.println("bh is greater");
          }
          else if(hg<bh && hg>ch) {
        	  System.out.println("hg is greater");
          }
          else {
        	  System.out.println("ch is greater");
          }
		//switch case 
          int size= 35;
          
          switch (size) {
          case 20: 
        	  System.out.println("xtrasmall");
        	  
          case 24:
        	  System.out.println("medium");
        	  
          case 45:
        	  System.out.println("large");
        	  default:
        		  System.out.println("enter correct values");
          }
          switch (size) {
          case 33:
          case 35:
          System.out.println("small");
          break;
          
          case 25:
          case 28:
        	  System.out.println("medium");
        	  break;
        
          case 40:
          case 45:
        	  System.out.println("large");
        	  break;
          }
          // for loop 
          //for(initializition ; conditioncheck; increment/decrement 
          
          //print 1 to 5
          for(int i=5; i>=1; i--) {
        	  System.out.println(i);
          }
          // table of 2 
          for(int i=2; i<=20; i= i+2) {
        	  System.out.println(i);
          }
          //table of 6
          for(int i=6; i<=60; i= i+6) {
        	  System.out.println(i);
          }
          //even number between 1 to 50 
          for(int i=1; i<=50; i++) {
        	  if(i % 2 ==0) {
        		  System.out.println(i);
        	  }
          }
          
          
          String city103= "kmapan";
  		int q113= city103.indexOf("p",1);      ///?????
  		System.out.println(q113);
          
          String firstname= "aaseetha";
          int count= 0;
          for(int i=0; i<firstname.length();i++) {
        	  //System.out.println(i);
        	  System.out.println(firstname.charAt(i));
        	  if(firstname.charAt(i)=='a'||firstname.charAt(i)=='e'||firstname.charAt(i)=='i'||firstname.charAt(i)=='o'||firstname.charAt(i)=='u')
        	 {
        		  count=count+1;
        	 }
          }
          System.out.println(count);
          
          int [] k= {1,3,5};
          int [][] l= {{25,28,30},{12,15,18}};
          int [][][] m= {{{101,202,303}},{{203,404,505}}};
          
          for(int i=0; i<k.length;i++) {
        	  System.out.println(k[i]);
          }
          for(int i=0; i<l.length;i++) {
        	  System.out.println(l[i]);
        	  int [] s1= l[i];
        	  for(int j = 0; j<s1.length;j++) {
        		  System.out.println(s1[j]);
        	  }
          }
          for(int i=0; i<m.length;i++) {
        	  System.out.println(m[i]);
        	  int [][] s2= m[i];
        	  for(int j=0; j<s2.length;j++) {
        		  System.out.println(s2[j]);
        		  int [] s3= s2[j];
        		  for(int k1=0; k1<s3.length;k1++) {
        			  System.out.println(s3[k1]);
        		  }
        	  }
        	  
          }
          //break 
          for(int i= 200; i>=1; i--) {
        	  System.out.println(i);
        	  if(i==195) {
        		  break;        //prints out all from 200 till 195
        	  }
          }
          
          for(int i= 10; i>=5; i--) { //10// 9////8//7//6
        	  System.out.println(i);
        	  if(i==6) {      //9// 8// 7// 6
        		  break;     //it would print out 10,9,8,7,6
        	  }
          }
          
          for(int i=15; i>=10; i--) { //15//14//13// 12//11//10      ask for clarification?????
        	  System.out.println(i);
        	  if(i==7) {            // 14// 13// 12// 11//10//
        		 break;        // it would print out 15 till 10
        	  }
          }
          
          for(int i=20; i>=4;i--) {     //20//19//18//17//16//15//14//13//12//11//10
        	  System.out.println(i);
        	  if(i==10) {              //19/ 18//17//16//15//14//13//12//11//10
        		  break;           //it should print out from 20 till 10 because it is incrementing from 20 till 10
        	  }
          }
          
          for(int i=10; i<=15;i++) {     //10//11//12//13//15
        	  System.out.println(i);
        	  if(i==5) {            //11//12//13//14//15//16
        		  break;       //it should print out 10 till 15 
        	  }
          }
          
          for(int i=5; i<=16; i++){ //5//6//7//
        	  if(i==8) {             //6//7//
        		  break;
        		  
        	  }
        	  System.out.println(i);  // should print only from 5-7
          }
          
          for(int i=10; i<=17; i++) {  //10//11//13//14//16//
        	  if(i==5) {             //11//12//13//15//16//17
        		  break;
        	  }
        	  System.out.println(i);    //should print 10-17
          }
          
          //print 1to 5
          int z1= 2;
          
          while (z1 <=3) {
        	  System.out.println(z1);
        	  z1 ++;                      //??? how
          }
          
          int z2= 5;
          while(z2 >=1) {
        	  System.out.println(z2);
        	  z2 --;
        	  
          }
          
          int z3= 8;
          while(z3 >=3) {
        	  System.out.println(z3);
        	  z3 --;                    //should be 8,7,6,5,4,3 until 3
          }
          
          int z4= 10;
          while(z4 >= 5) {
        	  System.out.println(z4);
        	  z4 --;                    //should be 10,9,8,7,6,5
          }
          
          int z5= 90;                      //????
          while(z5 <= 9) {
        	  System.out.println(z5);  // should be 15,14,13,12,11,10,9 or idk??? 
        	  z5 = z5 - 9;
          }
          
          int z6= 40;
          while(z6 >= 4) {
        	  System.out.println(z6);
        	  z6= z6 - 4;
          }
          
          int y= 50;
          while(y >=5) {
        	  if(y==10) {
        		  break;
        		  
        	  }
        	  System.out.println(y);
        	  y--;
          }
          
          int y1= 60;
          while(y1 >= 10) {
        	  System.out.println(y1);
        	  if(y1==30) {
        		  break;
        	  }
        	  y1--;
          }
          
          int y2= 20;
          while(y2 >=7) {
        	  if(y2==15) {
        		 y2--;
        		 continue;
        		  
        	  }
        	  System.out.println(y2);  //20//19//18//17//16//15//
        	  y2--;                   // 19//18//17//16//15//14//13//12//11//10//9//8//7//
          }
          
          String l2= "happy lava learning";
         for(int i=0; i<l2.length();i++) {
        	 if(l2.charAt(i)=='a') {
        		 System.out.println(i);       /// why is the outcome 9 and 13????????
        	 }
         }
         
         int [] numbs = {55, 66, 77};
         int summs= 0;
         for(int i=0; i<numbs.length;i++) {
        	 summs= summs+numbs[i];
        	
         }
         System.out.println(summs);   //should give you the sum of the array
         
         int [] numbss = {10,20,30};
         int summms= 0;
        for(int i=0; i<numbss.length;i++) {
        	summms= summms+numbss[i];
        }
        System.out.println(summms);
        
        int x= 20;
        int n = 30;
        
        String hello= n > x ? "n is greater":"x is greater";
        System.out.println(hello);
        
        String name = "aastha";
        int count5= 0;
        
       for(int c11=0; c11<name.length();c11++) {
    	   System.out.println(name.charAt(c11));
    	   if(name.charAt(c11)== 'a' || name.charAt(c11)== 'e') {
    		   count= count+1;
    	   }
       }
       System.out.println(count);          //why is the count saying 8????????
}
}

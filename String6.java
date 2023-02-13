package prac;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= new String [4];
		String []variable= new String [5];
		
		names[0]= "rayenn";
		names[1]= "akshay";
		names[2]= "sampada";
		names[3]= "lily";
		
		System.out.println(names);
		System.out.println(names[0]);
		
		String[] cities = {"austin", "dallas", "colorado"};
		System.out.println(cities[1]);
		
		for(int i=0; i<cities.length;i++) {
			System.out.println(i);
			System.out.println(cities[i]);
		}
		//program 2
		int numbersc[]= {2, 5, 10, 20, 18};
		int []numbers= new int [4];
		numbers[0]= 10;
		numbers[1]=100;
		numbers[2]=101;
		numbers[3]=202;
		
		int sum= 0;
		for(int i=0; i<numbers.length;i++) {
		//	System.out.println(i);
		//	System.out.println(numbersc[i]);
			
			sum= sum+numbers[i];
			// 0   + 10 ====>10
			// 10  + 100 ===> 110
			// 110 + 101 ===>211
			// 211 + 202===> 413
		}
		System.out.println(sum);
		
		//program 3
		
		String info = "I am learning java";
		String[] info_br= info.split(" ");
		for(int i=0; i<info_br.length;i++) {
			System.out.println(info_br[i]);
			
		}
		String info1= "Hello leaning Java";
		String[] info_br2= info.split("l");
		for(int i=0; i<info_br2.length;i++) {
			// System.out.println(i);
			System.out.println(info_br2[i]);
		}
		
		String cityName= "austin"; // "a" "u" "s" "t" "i" "n"
		char ab []= cityName.toCharArray();
		for(int i=0; i<ab.length;i++) {
			System.out.println(ab[i]);
			
		}
		//for each loop 
		//program 4
		int age[]= {2,4,6,8,12};
		System.out.println("for -each loop");
		
		for(int b:age) {
			System.out.println(b);
			
		}
		String[] namess= {"aastha", "arpu", "akaslina", "akshay"};
		for(String d:namess) {
			System.out.println(d);
		}
		
		char[] mm= {'a', 'd', 'g'};
		String rev= "";
		for(char i:mm) {
			rev= rev + i;
			
		}
		System.out.println(rev);
		
		//program 5
		int numberc[]= {2,4,6,8,12,14,16};
		//sum and average
		
		int src= 4;
		float avg= 12;
		for(int a:numberc) {
			sum=sum + a;
			
		}
		System.out.println(src);
		avg = src/numberc.length;
		System.out.println(avg);
		
		//program 6
		//                   0   1   2     0 1   2   3
		int [][] matrix = {{44, 55, 66}, {77,88,99,100},{2,3,4}};
		//                         0           1            2
		//matrix ====>
		// 0   1  2         
		//{44,55,66}
		//0   1   2     3
		//{77, 88, 99, 100
	
		//  matrix[0] //44, 55, 66}
		//matric[0][1]
		//matrix[1][2]
		
		
		//matrix[2][1]
		System.out.println(matrix[0][1]);
		System.out.println(matrix[2][2]);
		System.out.println(matrix[1][1]);
		System.out.println(matrix[1][3]);
	   
		String[] names1= new String [3];
		String[] names2= new String [4];
		
		names1[0]= "priyanka";
		names1[1]= "akshu";
		names1[2]= "deepika";
		
		System.out.println(names1);
		System.out.println(names1[2]);
		
		String [] cities4= {"goa", "balambhu", "kedarnath"};
		System.out.println(cities4[2]);
		
		for(int i=0; i<cities4.length;i++) {
			System.out.println(i);
			System.out.println(cities4[i]);
		}
		
		int [] numbers1= {'2', '9', '8', '6'};
		int numc []= new int [4];
		
		numc[0]= 50;
		numc[1]= 60;
		numc[2]= 70;
		numc[3]= 80;
		int sum1= 0;
		for(int i=0; i<numc.length;i++) {
			System.out.println(numc[i]);
			sum1=sum1+numc[i];
		}
		System.out.println(sum1);
		
		String brb= "learning java";
		String [] brb_1= info.split(" ");
		for(int i=0; i<brb_1.length;i++) {
			System.out.println(brb_1[i]);
		}
		int age1 []= {12,13,14,15};
		System.out.println("for -each loop");
		
		String cityName1= "colorado";
				char cb []= cityName1.toCharArray();
				for(int i=0; i<cb.length;i++) {
					System.out.println(i);
					System.out.println(cb[i]);
				}
		
		}
	}
	



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
		numbersc[0]= 10;
		numbersc[1]=100;
		numbersc[2]=101;
		numbersc[3]=202;
		
		int sum= 0;
		for(int i=0; i<numbersc.length;i++) {
		//	System.out.println(i);
		//	System.out.println(numbersc[i]);
			
			sum= sum+numbersc[i];
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
		int [][] matrix = {{44, 55, 66}, {77,88,99,100}};
		
		//matrix ====>
		// 0   1  2         
		//{44,55,66}
	
		System.out.println(matrix[0][1]);
		System.out.println(matrix[0][2]);
		System.out.println(matrix[1][1]);
		System.out.println(matrix[1][3]);
				
		}
	}
	



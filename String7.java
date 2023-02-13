package prac;

import java.util.Arrays;

public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] b = new int[4][6];
		// b=[

		// [10,20,30,40];
		// [50,60,70,80];
		// [90,100,101,102];

		// ]
		// program1

		int[][] b1 = {
				// 0 1 2 3
				{ 2, 4, 6, 8 }, // index is 0
				// 0 1 2
				{ 10, 20, 30 }, // index is 1
				// 0
				{ 1000 } // index is 2
		};

		System.out.println(b1[0][2]);
		System.out.println(b1[1][2]);
		System.out.println(b1[1][1]);
		System.out.println(b1[2][0]);

		// for(int i=0; i<b1.length;i++) {
		// System.out.println(i);
		// System.out.println(b1[i].length);
		// int[] c=b1[i];
		// for(int k=0; k<c.length;i++) {
		// System.out.println(c[k]);                // ????????????
		// }
		// }
		// program 2

		int numsb[] = { 70, 80, 90 };
		for (int d1 : numsb) {
			System.out.println(d1);
		}

		//Multidimensional array
		
		int numbers[][]= {
				{2,4,6},
				{6,8,10},
				{12,14,16}
		};
		for(int [] c1:numbers) {
			//System.out.println(c1);
		//	System.out.println(Arrays.toString(c1));
			for(int c2:c1) {
				System.out.println(c2);
			}
			
		}
		
		//program 4
		int numms[][]= {
				{100,200,200},
				{300,400,300},
				{400,40,50}
		};
		for(int []row1:numms) {
			//System.out.println(row1);
			//System.out.println(Arrays.toString(row1));
			for(int low:row1) {
				System.out.println(low);
			}
		}
		//program 5 three dimensional 
		
		int[][][] j1= {
				      {
		{50,50,66},
		{88,99,77}
	                  },
	                  {
		{1,2,3},
		{5,6,7}
	                  }
	
                      };
		System.out.println(j1[0][0][1]);
		System.out.println(j1[1][1][2]);
		System.out.println(j1[1][1][1]);
		System.out.println(j1[0][1][2]);            //???????
		
		
		int [][] c3= {
				{103,104,105},    //index 0
				
				{110,115,118},    // index1
				
				{200,202,210}     //index2
				
		};
		System.out.println(c3[0][2]);
		System.out.println(c3[2][0]);
		System.out.println(c3[1][2]);
		System.out.println(c3[2][2]);
		
		for(int i=0; i<c3.length;i++) {
			int [] b4= c3[i];
			for(int j=0; j<b4.length;j++) {
				System.out.println(b4[j]);
			}
		}
	}

}

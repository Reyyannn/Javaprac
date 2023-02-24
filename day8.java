package prac;

import java.util.Arrays;

public class day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array 
		
		int [] b= new int [3];
		b[0]= 10;
		b[1]= 20;
		b[2]= 30;
		
		int [] bD= {2,4,6};
		
		for(int i=0; i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		//program 2
		 int [] [] cc= new int[4][4];    //the index from 0-4 then the columns are 4 of them 
		 
		// index is 0 for row 0
		 cc[0][0]= 11;
		 cc[0][1]= 22; 
		 cc[0][2]= 33;
		 cc[0][3]= 44;
		 
		 // index is 1 for row 1
		 cc[1][0]= 111;
		 cc[1][1]= 222; 
		 cc[1][2]= 333;
		 cc[1][3]= 444;
		 //index is 2 for row 2
		 cc[2][0]= 110;
		 cc[2][1]= 220; 
		 cc[2][2]= 330;
		 cc[2][3]= 440;
		 //index is 3 for row 3
		 cc[3][0]= 112;
		 cc[3][1]= 222; 
		 cc[3][2]= 332;
		 cc[3][3]= 442;
		 
		 int [][] bDd= {
				 {11,22,33,44},       //row1
				 {111,222,333,444},   //row2
				 {110,220,330,440},   //row3
				 {112,222,332,442}    //row4
		 };
		
		for(int i=0; i<bDd.length;i++) {
			System.out.println(i);
			 System.out.println(bDd[i]);   //only gives reference 
			 String m= Arrays.toString(bDd[i]);
			 System.out.println(m);            //gives all the rows values 
			 
				 int [] mm= bDd[i];
				 for(int k=0; k<mm.length;k++) {
			 System.out.println(mm[k]);       
			 }
			 
		 }
		 
	//	 for(int [] mm: bDd) {
	//		 for(int ach:mm) {
	//			 System.out.println(ach);
	//		 }
	//	 }
	 
		 //program 3 
		 
		 int ddd [][][]= new int [3][3][3];
		 //whole thing is index 0 and next value is 0 till 3 then next is the index of them
		 ddd[0][0][0]= 55;                       //second row is at 0
		 ddd[0][0][1]= 66;
		 ddd[0][0][2]= 77;
		 
		 //index 1
		 ddd[0][1][0]= 1;                      //second row is at 1
		 ddd[0][1][1]= 2;
		 ddd[0][1][2]= 3;
		 
		 //index of 2
		 ddd[0][2][0]= 20;                    //second row is at 2
		 ddd[0][2][1]= 30;
		 ddd[0][2][2]=40;
		 //--------------------------// next index is 1 
		 
		 ddd[1][0][0]= 0;          // second row is still at 0 index 
		 ddd[1][0][1]= 1;
		 ddd[1][0][2]= 2;
		 
		 ddd[1][1][0]= 3;
		 ddd[1][1][1]= 4;          //second row is at 1
		 ddd[1][1][2]= 5;
		 
		 ddd[1][2][0]= 300;
		 ddd[1][2][1]= 400;          //second row is at 2 now 
		 ddd[1][2][2]= 500;
		 //-------------------------next index is at 2 
		 
		 ddd[2][0][0]= 3;
		 ddd[2][0][1]= 4;          //second row is at 0 and first is at index 2 now
		 ddd[2][0][2]= 5;
		 
		 ddd[2][1][0]= 3;
		 ddd[2][1][1]= 4;          //second row is at 1 and first is index of 2 for whole thing
		 ddd[2][1][2]= 5;
		 
		 ddd[2][2][0]= 3;
		 ddd[2][2][1]= 4;          //second row is at 2
		 ddd[2][2][2]= 5;
		
	        for(int i=0; i<ddd.length;i++) {
	//		 System.out.println(ddd[i]);
			 int jj[][]= ddd[i];
			 for(int j=0; j<jj.length;j++) {
				// System.out.println(jj[j]);
				 int kk []= jj[j];
				 for(int l=0; l<kk.length;l++) {
					 System.out.println(kk[l]);
				 }
			 }
		 }
		 
		// for(int [][] nn:ddd) {
		//	 for(int [] nnm:nn) {
			//	 for(int kr:nnm) {
			//		 System.out.println(kr);
			//	 }
		//	 }
		// }
		 
		/* for(int i=0; i<ddd.length;i++) {
		//	 System.out.println(ddd[i]);
			 int[][]ch= ddd[i];
			 for(int k=0; k<ch.length;k++) {
				// System.out.println(ch[k]);
				 int[] ch1 = ch[k];
				 for(int j=0; j<ch1.length;j++) {
					 System.out.println(ch1[j]);
				 }
			 }
			 
		 }*/
		 
		 int jkl[][][]= new int [2][2][2];
		 
		 jkl [0][0][0]= 44;
		 jkl [0][0][1]= 33;
		 
		 jkl [0][1][0]= 55;                             //why is this number not showing 
		 jkl [0][1][1]= 66;
		 //----------------------
		 
		 jkl [1][0][0]= 77;                            //why is this number not showing after sysout????
		 jkl [1][1][1]= 88;
		 
		 jkl [1][1][0]= 99;
		 jkl [1][1][1]= 100;
			//-----------------------
		 
		for(int i=0; i<jkl.length;i++) {
			//System.out.println(jkl[i]);
			int [][] cfg= jkl[i] ;
			for(int j=0; j<cfg.length;j++) {
		//	System.out.println(cfg[j]);
				int [] cvb= cfg[i];
				for(int p=0; p<cvb.length;p++) {
					System.out.println(cvb[p]);       
				}
			}
				
			
		}
		 
		 
		 
		 
		 
				 
	}

}

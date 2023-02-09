package prac;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String salad = "chicken salad";
		int a = salad.indexOf('k', 4);
		System.out.println(a);

		int count = 0;
		for (int i = 0; i < salad.length(); i++) {
			if (salad.charAt(i) == 'k') {
				System.out.println(i);
				count = count + 1;
			}

		}
		System.out.println(count);

		// array

		int nums[] = new int[4];
		nums[0] = 20;
		nums[1] = 200;
		nums[2] = 30;
		nums[3] = 300;

		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);

		String s = "salad";
		for (int i = 0; i < s.length(); i++) {
			// System.out.println(i);
			System.out.println(s.charAt(i));
		}

		// program 3
		int numss[] = new int[3];
		numss[0] = 400;
		numss[1] = 500;
		nums[2] = 600;

		System.out.println(numss.length);
		for (int i = 0; i < numss.length; i++) {
			System.out.println(numss[i]);
		}
		// program4

		String cities[] = new String[4];
		cities[0] = "nagarkot";
		cities[1] = "balambhu";
		cities[2] = "dharan";
		cities[3] = "austin";

		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}

		// program5
		// 0 1 2 3 4 5
		int numberc[] = { 12, 13, 14, 15, 16, 18 };
		for (int i = 0; i < numberc.length; i++) {
			System.out.println(numberc[i]);
		}

		// program 6
		String foods[] = { "bhaat", "daal", "tarkari", "masu" };
		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i]);
		}
		// program 7
		char cb[] = { 'a', 'a', 'n', 'd', 'a' };
		for (int i = 0; i < cb.length; i++) {
			System.out.println(i);
			System.out.println(cb[i]);
		}
		// program 8
		String firstName = "aastha";
		char[] ac = firstName.toCharArray();
		for (int i = 0; i < ac.length; i++) {
			// System.out.println(i);
			System.out.println(ac[i]);
		}
		// program 9
		String e = "learning javascript";
		String h2[] = e.split(" ");
		String h3[] = e.split("r");

		for (int i = 0; i < h2.length; i++) {
			System.out.println(i);
			System.out.println(h2[i]);

			for (int i1 = 0; i1 < h3.length; i1++) {
				// System.out.println(i1);
				System.out.println(h3[i1]);
			}
		}
		String y = "enhoying java";
		String h4[] = e.split(" ");
		String h5[] = e.split("a");

		for (int i = 0; i < h4.length; i++) {
			// System.out.println(i);
			System.out.println(h5[i]);

		}
		for (int i = 0; i < h5.length; i++) {
			System.out.println(h5[i]);
		}
		String fruits = "apple";
		int m = fruits.indexOf('p', 2);
		System.out.println(m);

		int count1 = 0;
		for (int i = 0; i < fruits.length(); i++) {
			if (fruits.charAt(i) == 'p') {

			}
			System.out.println(i);
			count = count + 1;

		}
		
		//array
		
		int[] numms = new int [5];
		numms[0]= 102;
		numms[1]= 104;
		numms[2]= 202;
		numms[3]= 303;
		numms[4]= 405;
		System.out.println(numms[0]);
		System.out.println(numms[1]);
		System.out.println(numms[2]);
		System.out.println(numms[3]);
		System.out.println(numms[4]);
		
		int [] nummms= new int [2];
		nummms[0]= 404;
		nummms[1]= 104;
		nummms[2]= 304;
		System.out.println(nummms.length);
		for(int i=0; i<nummms.length;i++) {
			System.out.println(nummms[i]);		}
				
	}
	
}

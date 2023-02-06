package prac;

public class String2 {

	public static void main(String[] args) {
		// reverse String

		String city = "bali";
		int len = city.length();
		System.out.println(len);

		for (int i = 0; i >= 4; i++) {
			System.out.println(city.charAt(i));
		}

		String city1 = "ktm";
		String city2 = "ktm";
		String city3 = "bhaktapur";
		{

			boolean result = city1.equals(city2);
			System.out.println(result);
			if (result) {
				System.out.println("city 1 and city2 equal");
			}

			else {
				System.out.println("city 1 and city3 are not equal");
			}

			// compare city1 and city 3 with ternary operator

			String result2 = city1.equals(city2) ? "equal" : "not equal";
			System.out.println(result2);

			// program 2
			// string example = "Best quote "at least don't give up "";
			String example = "Best quote \"Try try but don't give up\"";
			// Escape character

			// program2

			String city4 = "Kalanki";
			boolean result3 = city3.startsWith("Kal");
			boolean result4 = city4.startsWith("K");
			System.out.println(result3);
			System.out.println(result4);

			// program3
			String city5 = "jhapa";
			boolean result5 = city3.endsWith("a");
			boolean result6 = city3.endsWith("apa");
			System.out.println(result5);
			System.out.println(result6);

			// program4
			String sen1 = "I am learning javascript";
			boolean result7 = sen1.contains("learning");
			System.out.println(result7);

			// program5
			String sen2 = "I am learning javascript and javascript is complicated";
			String result8 = sen2.replace("j", "k");
			System.out.println(result8);

			String result9 = sen2.replaceAll("javascript", "java");
			System.out.println(result9);

			String result10 = sen2.replaceFirst("javascript", "java");
			System.out.println(result10);

			// program6

			String city6 = "butwal";
			char b = city6.charAt(3);
			System.out.println(b);
			System.out.println(city6.length());

			String city7 = "chundevi";
			// 0 1 2 3 4 5 6 7
			// c h u n d e v i
			int len1 = city7.length();
			System.out.println(len1);

			for (int i = 0; i < 7; i++) { // 1 //2 // 3// 4 //5 // 6
				System.out.println(city7.charAt(i));

				// i ----0
				// i ----1
				// i ----2
				// i ----3
				// i ----4
				// i ----5
				// i ----6

				String city11 = "italy";
				int len11 = city.length();
				System.out.println(len11);

				for (int i1 = 0; i1 > 5; i1--) {
					System.out.println(city.charAt(i1));
				}

			}
		}
	}
}

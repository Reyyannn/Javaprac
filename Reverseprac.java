package prac;

public class Reverseprac {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub

		String city = "ktm";

		char a = city.charAt(3);
		System.out.println(a);
		System.out.println(city.length());

		String city1 = "bhaktapur";
		int len = city.length();
		System.out.println(len);

		for (int i = 0; i < 3; i++)
			;
		System.out.println(city.charAt(0));

		// reverse string

		String country = "Europe";
		String rev = "";

		for (int i = 0; i < country.length(); i++) {
			System.out.println(country.charAt(i));

			rev = country.charAt(i) + rev;
			System.out.println(rev);

		}

	}

}

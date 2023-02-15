package one;

public class javastring3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 012345678910
		// java is fun
		String str2 = "java is fun ";
		String q1 = str2.substring(0, 4);// End value is not included

		System.out.println(q1);

		String str3 = "program";// end index is optional
		String q2 = str3.substring(2);

		System.out.println(q2);
		// 0123
		// pune

		String str4 = "pune";
		String q4 = str4.substring(1, 3);
		System.out.println(q4);

		// join

		String str5 = "Hi";
		String str6 = "I am learning";
		String str7 = "java";

		String q5 = String.join(" ", str5, str6, str7);
		System.out.println(q5);

		String str8 = "chunnugurung";
		String str9 = "gmail.com";
		String str10 = String.join("@", str8, str9);
		System.out.println(str10);

		String str11 = "sunita";
		String str12 = "Pragati";
		String str13 = "Manisha";
		String q6 = String.join("-", str11, str12, str13);
		System.out.println(q6);

		// Program 3
		String city1 = "chitwan";
		// 0123456
		// chitwan
		int q7 = city1.indexOf('a');
		System.out.println(q7);

		String city2 = "bharatpur";
		int q8 = city2.indexOf("a", 3);
		System.out.println(q8);

		String city3 = "Kathmandu Nepal";
		for (int i = 1; i < city3.length(); i++) {
			if (city3.charAt(i) == 'a') {

				System.out.println(i);
			}

		}

		String city4 = " learning java is fun ";
		String city5 = city4.trim();
		System.out.println(city5.length());
		System.out.println(city4.length());

		// if want to remove space in between

		String q9 = city5.replace(" ", "");
		System.out.println(q9);

		// Program4
		String q10 = "I am learning java";
		String[] q11 = q10.split("");
		System.out.println(q11);

	}

}

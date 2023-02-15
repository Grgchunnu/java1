package one;

public class javastring5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program
		String[] names = new String[4];
		// String names1 [] = new String [4];

		names[0] = "asha";
		names[1] = "pavitra";
		names[2] = "Rojila";
		names[3] = "kabita";

		System.out.println(names);
		// Array stores the element by index
		System.out.println(names[3]);

		String[] cities = { "chitwan", "kathmandu", "pokhara" };
		System.out.println(cities[1]);

		for (int i = 0; i < cities.length; i++) {
			// System.out.println(i);
			System.out.println(cities[i]);

		}

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			// System.out.println(i);
		}

		// PROGRAM2

		int[] numbers = { 22, 33, 44, 55, 66 };

		int[] numbers1 = new int[3];
		numbers1[0] = 11;
		numbers1[1] = 22;
		numbers1[2] = 33;
		// 0 1 2
		// 11 22 33

		int sum = 0;
		for (int i = 0; i < numbers1.length; i++) {
			// System.out.println(i);

			sum = sum + numbers1[i];
			// 0 + 11 ====>11
			// 11 + 22 ====> 33
			// 33 + 33 ====> 66
		}

		System.out.println(sum);

		// PROGRAM3
		String info = "I am learning javascript";
		// String [] info_br =info.split(" ");
		String[] info_br1 = info.split("a");
		// ["I","am","learning","javascript"];
		// ["I ","m le","rning j","v","script"]

		for (int i = 0; i < info_br1.length; i++) {
			// System.out.println(i);
			System.out.println(info_br1[i]);
		}
		String cityname = "Nagpur";
		// ['N','a','g','p','u','r']
		char[] t = cityname.toCharArray();
		System.out.println(t);
		for (int i = 0; i < t.length; i++)
			;
		{
			// System.out.println(t[i]);
		}

//for each loop

		// program 4
		int age[] = { 2, 11, 22, 33 };
		System.out.println("for each loop");
		for (int a : age) {
			System.out.println(a);
		}

		String[] names1 = { "anisha", "binita", "karuna", "anisha" };
		for (String s : names1) {
			System.out.println(s);
		}

		char[] nm = { 'b', 'i', 'n', 'i', 't', 'a' };
		String rev = "";
		for (char i : nm) {
			rev = i + rev;
			// rev =rev + i;
		}

		System.out.println(rev);

		// Program 5
		int numbers2[] = { 3, 44, 55, 66, 77, 88, 9, 44 };
		// sum and average
		int suma = 0;
		float avg = 0;
		for (int a : numbers2) {
			suma = suma + a;
		}
		System.out.println(suma);
		avg = suma / numbers2.length;
		System.out.println(avg);

		// Program 6
		int[][] matrix = { { 11, 22, 33 }, { 44, 55, 66 } };

		// matrix ==> [
		// [11,22,33]
		// [44,55,66]
//]		 
System.out.println(matrix [0][0]);
System.out.println(matrix [1][2]);




	}

}

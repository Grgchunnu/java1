package one;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");

		// arithmetic operation
		int s = 10;
		int t = 2;
		System.out.println(s + t);
		System.out.println(s - t);
		System.out.println(s * t);
		System.out.println(s / t);
		System.out.println(s % t);
		//
		January(12, 6);
		January(8, 4);

		Addition();

		Subtraction(8, 4);

		int z = multiplication(3, 6);
		System.out.println(z);
		System.out.println(z + 4);
		System.out.println(z * 2);
		System.out.println(z - 3);
	}

	static void January(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

	}
	// function without parameter and without return

	static void Addition() {
		System.out.println(4 + 4);
	}

	// function with parameter and without return
	static void Subtraction(int a, int b) {
		System.out.println(a - b);
	}

	// function with parameter and with return
	static int multiplication(int c, int d) {
		return c * d;
	}

}

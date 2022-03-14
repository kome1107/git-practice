
public class FizzBuzz {
	public static void main(String[] args) {

		for (int n = 1; n < 101; n++) {
			if (0 == n % 15) {
				System.out.println("FizzBuzz");
			} else if (0 == n % 3) {
				System.out.println("Fizz");
			} else if (0 == n % 5) {
				System.out.println("Buzz");
			} else {
				System.out.println(n);
			}

		}

	}
}

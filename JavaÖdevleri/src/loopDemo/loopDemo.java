package loopDemo;

public class loopDemo {

	public static void main(String[] args) {
		// For
		for (int i = 02; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");

		// While
		int i = 0;
		while (i < 10) {
			i += 2;
			System.out.println(i);
		}
		System.out.println("While Döngüsü Bitti");

		// Do-While
		int j = 0;
		do {
			j += 2;
			System.out.println(j);

		} while (j < 10);

		System.out.println("Do-While Döngüsü Bitti");

	}

}

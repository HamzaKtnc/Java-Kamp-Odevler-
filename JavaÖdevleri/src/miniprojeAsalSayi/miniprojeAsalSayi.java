package miniprojeAsalSayi;

public class miniprojeAsalSayi {

	public static void main(String[] args) {
		int number = 1;
		int bölünenSayi = 0;

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				bölünenSayi++;
			}

		}
		if (bölünenSayi == 2) {

			System.out.println("Sayı Asaldır");
		} else
			System.out.println("Sayı Asal Değildir");
	}

}

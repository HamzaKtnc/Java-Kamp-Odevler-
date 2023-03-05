package sayiBulma;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayılar = { 2, 5, 7, 8, 9 };
		int aranacak = 5;
		boolean varMi = false;
		for (int i = 0; i < sayılar.length; i++) {
			if (sayılar[i] == aranacak) {
				varMi = true;

			}
		}
		if (varMi) {
			System.out.println("Aranan sayı dizide bulunmaktadır.");

		} else {
			System.out.println("Aranan sayı dizide bulunmamaktadır.");

		}
	}
}

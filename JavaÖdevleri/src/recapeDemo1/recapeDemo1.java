package recapeDemo1;

public class recapeDemo1 {

	public static void main(String[] args) {
		int sayi1 = 344;
		int sayi2 = 734;
		int sayi3 = 931;
		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;

		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En büyük sayı :" + enBuyuk);
	}
}

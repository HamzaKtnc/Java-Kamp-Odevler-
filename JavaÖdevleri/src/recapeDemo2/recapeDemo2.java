package recapeDemo2;

public class recapeDemo2 {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.6, 5.3, 8.7 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;

			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("En Büyük Sayı:" + max);
		System.out.println("Toplam:" + total);

	}

}

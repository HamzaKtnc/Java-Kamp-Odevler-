package sesliHarfler;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf = 'G';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Girilen harf kalın ünlü harftir");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("Girilen harf ince ünlü harftir");
			break;
		default:
			System.out.println("Girilen harf sessiz harftir");
		}
	}
}
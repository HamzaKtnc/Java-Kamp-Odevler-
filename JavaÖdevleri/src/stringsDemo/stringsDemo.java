package stringsDemo;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün Hava Çok Güzel.";
		System.out.println(mesaj);
		System.out.println("Eleman Sayısı:" + mesaj.length());
		System.out.println("5.Eleman:" + mesaj.charAt(4));
		System.out.println(mesaj.concat("Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("!"));
		char[] Karakterler = new char[5];
		mesaj.getChars(0, 5, Karakterler, 0);
		System.out.println(Karakterler);
		System.out.println(mesaj.indexOf("B"));
		System.out.println(mesaj.lastIndexOf("B"));
	}

}

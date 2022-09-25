package donguler;

public class ifdongusu {

	public static void main(String[] args) {
		int sayi1 = 13;
		int sayi2 = 45;
		int sayi3 = 22;
		int enBuyuk = sayi1;

		if (sayi2 > enBuyuk) {
		enBuyuk = sayi2;
		}
		if (sayi3 > enBuyuk) {
			enBuyuk = sayi3;
		}

		System.out.println("en buyuk sayı:" + enBuyuk);

	}

}

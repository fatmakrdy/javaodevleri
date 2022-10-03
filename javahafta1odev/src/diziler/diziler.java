package diziler;

public class diziler {

	public static void main(String[] args) {
		String[] kisiler = new String[4];
		kisiler[0] = "ali";
		kisiler[1] = "ayse";
		kisiler[2] = "fatma";
		kisiler[3] = "ahmet";

		// bir dizinin kaç elemanı oldugunu öğrenmek için length kullan
		for (int i = 0; i < kisiler.length; i++) {
			System.out.println("kişi ismi:" + kisiler[i]);
		}

		System.out.println("------------------");

		for (String kisi : kisiler) {
			System.out.println(kisi);
		}
	}

}

package striglerleCalismak;

public class stringlerlecalısma {

	public static void main(String[] args) {
		String text = " Bugün cok çalıstım.";

		System.out.println("mesaj uzunluğu " + text.length());
		System.out.println("mesajın 7.elemanı " + text.charAt(6)); // charAt() içine istenilen elemanın index numarası
																	// yazılır.
		System.out.println(text.concat("İyi iş çıkardın:)")); // concat'ı ifadene ekleme yapmada kullanabilirsin.
		System.out.println(text);// concat işlemin bir değişkene atamadığından ilk halini yazar
		String text_2 = text.concat("iyi iş çıkardın");
		System.out.println(text_2);
		System.out.println(text.startsWith("b"));
		// startswith string'in istediğin ifade ile mi başlıyor
		System.out.println(text.endsWith("."));
		// endswithbstring'in istediğin ifade ile mi bitiyor.

		// getchars diziden seçtiğimiz karakterleri hedef diziye kopyalar
		// getChars(int:srcBegin, int:srcEnd, char[] dst, int:dstBegin)

		char[] karakterler = new char[6];
		text.getChars(0, 4, karakterler, 0);
		// 5,indexe kadar 0'dan başlayarak yazar
		// 0'dan 4'e kadar elemanları karakterlere ata.10 karakterden 0.indexden
		// başlayarak ata

		System.out.println(karakterler);
		System.out.println(text.indexOf("a"));
		// sorduğumuz karakterin index numarasını verir
		// ilk bulduğu karakteri verir.
		System.out.println(text.indexOf("ün"));
		System.out.println(text.lastIndexOf("e"));// sondan kontrol etmeye başlar.
		String text_3 = text.replace(' ', '-');// metinde değiştirmek istediğimiz yerleri değiştirir.
		// bu ingilizce karakter olabilir
		System.out.println(text_3);

		System.out.println(text.substring(2));// bir metnin içiden parça almak
		// 2.den itibaren yazar.
		System.out.println(text.substring(2, 5));// bir metnin içiden parça almak

		// bir metni belli karakterya da karakter dizisini dikkate alarak parçalamaya
		// yarar.
		// bugün , çok , ders , çalıştım şeklinde bir dizi olarak verir

		for (String kelime : text.split(" ")) {// boşluk karakterine göre dizi oluşturdu.
			System.out.println(kelime);
		}

		System.out.println();

		System.out.println(text.toLowerCase());// bütün harfleri küçük harfe çevirir.
		System.out.println(text.toUpperCase());

		System.out.println(text.trim());// ifadenin başındaki ve sonundaki boşlukları atar

	}

}

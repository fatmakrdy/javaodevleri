package diziler;

public class cokboyutludiziler {

	public static void main(String[] args) {
		String kisiler[][] = new String[3][3];
		kisiler[0][0] = "ibrahim";
		kisiler[0][1] = "özlem";
		kisiler[0][2] = "fatma";
		kisiler[1][0] = "mehmet";
		kisiler[1][1] = "kamil";
		kisiler[1][2] = "hatice";
		kisiler[2][0] = "yusuf";
		kisiler[2][1] = "hasan";
		kisiler[2][2] = "hilal";
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(kisiler[i][j]);
			}
		}

	}

}

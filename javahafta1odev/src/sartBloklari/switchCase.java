package sartBloklari;

public class switchCase {

	public static void main(String[] args) {
		char not='F';
		switch(not) {
		case 'A':
        System.out.println("tebrikler sınavı geçtiniz");
        break;
        
		case 'B':
		case 'C':
		case 'D':
		System.out.println("sınavı geçtiniz ama daha iyisi olabilirdi ..");
		break;
		
		case 'F':
			System.out.println("ÜZGÜNÜM DERSTEN KALDINIZ!:( ");
		break; 
		}
	}

}

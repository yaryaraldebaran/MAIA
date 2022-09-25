package ujian.ujiankelima.ifpackage;

import java.util.Scanner;
//belum beres yar
public class MethodMathNoThree {
	public static void main(String[] args) {
		boolean isLanjut = true;
		Scanner scnInput = new Scanner(System.in);
		do {
			System.out.println("Masukkan angka pertama");
			int pertama = scnInput.nextInt();
			System.out.println("Masukkan angka kedua");
			int kedua = scnInput.nextInt();
			System.out.println("apakah anda ingin melanjutkan? ");
			String strLanjut = scnInput.nextLine();
			if (strLanjut.equalsIgnoreCase("y")) {
				isLanjut= true;
			}
			else if (strLanjut.equalsIgnoreCase("n")) {
				isLanjut=false;
				scnInput.close();
			}
		} while (isLanjut);
	}
	
}

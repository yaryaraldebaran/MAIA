package latihan.latihantrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BelajarFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SHIFT + ALT + D untuk masuk mode debug
		// F6 untuk run tiap statement
		try {
//			double j = 9.0;
//			int x = j;
			Scanner sc = new Scanner(System.in);
			int xSc = sc.nextInt();
		}
		catch(NumberFormatException e){
			System.err.println("terjadi kesalahan ");
		}
		finally {
			System.out.println("program kembali dijalankan");
		}
		System.out.println("Masih Jalan");
	}
//	public static void inum(int h) {
//		
//	}
//	public static String inum(int h) {
//		
//	}

}

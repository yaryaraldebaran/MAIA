package latihan.latihantrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BelajarThrows {
	public static void main(String[] args) {
//		Thread.sleep(1500);
//		System.out.println("Selesai");
		try {
			eksekusi();
		} catch (InputMismatchException e) {
			System.out.println("Informasi error "+e);
		}
	}
	static void eksekusi() throws ArithmeticException, NullPointerException, InputMismatchException {
		System.out.println("proses eksekusi");
		throw new NullPointerException();
	}
}

package latihan.latihantrycatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("not_existing_file.txt");
	    try {
	        FileInputStream stream = new FileInputStream(file);
	    } catch (FileNotFoundException e) {
	    	String namaKelas = Thread.currentThread().getStackTrace()[1].getClassName();
//	        e.printStackTrace();
	    	System.out.println("ini adalah pesan error pada "+namaKelas);
	    }
	}

}

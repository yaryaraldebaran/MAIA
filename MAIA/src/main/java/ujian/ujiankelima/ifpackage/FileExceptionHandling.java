package ujian.ujiankelima.ifpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileExceptionHandling {
	public static void main(String[] args) {
		try {
			bacaTampilFile("C:\\Users\\NEXSOFT\\Downloads\\testqwq.txt");
		} catch (Exception e) {
			System.out.println("File tidak ditemukan");
		}
	}
	
	public static void bacaTampilFile(String lokasi) throws FileNotFoundException {
		File myObj = new File(lokasi);
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
	}
}

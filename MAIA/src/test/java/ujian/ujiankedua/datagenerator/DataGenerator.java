package ujian.ujiankedua.datagenerator;

import java.nio.charset.Charset;
import java.util.Random;

public class DataGenerator {
	Random rnd=new Random();
	public String strGenerator() {
		int leftLimit = 48; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 2;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();

	    System.out.println(generatedString);
	    return generatedString;
	}
	public int intGenerator(int bawah, int atas) {
		int intRandom = rnd.nextInt(bawah,atas);
		return intRandom;
	}
	public double doGenerator(double bawah, double atas) {
		double doRandom = rnd.nextDouble(bawah,atas);
		return doRandom;
	}
	public static void main(String[] args) {
		DataGenerator dtg = new DataGenerator();
		System.out.println(dtg.intGenerator(2, 100));
	}
	public String genStr() {
		int a;
		String b = "";
		StringBuilder strb = new StringBuilder();
		for (int i =0; i<3;i++) {
			a= rnd.nextInt(47,123);
			if ((a>47&&a<58)||(a>96&&a<123)) {
				b += strb.append(a).toString();
			}
		}
		return b;
			 
	}
}

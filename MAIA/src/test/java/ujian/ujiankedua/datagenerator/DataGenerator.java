package ujian.ujiankedua.datagenerator;

import java.nio.charset.Charset;
import java.util.Random;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class DataGenerator {
	Random rnd = new Random();
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
		for(int k =0;k<20;k++) {
			System.out.println(dtg.genStr());
		}
		
	}
	public String genStr() {
		String b = "";
		while(b.length()<2) {
			int rand= rnd.nextInt(47,123);
			if ((rand>47&&rand<58)||(rand>96&&rand<123)) {
				StringBuilder strb = new StringBuilder();
				char c = (char) rand;
				b += strb.append(c).toString();
			}

		}
		return b;
			 
	}
}

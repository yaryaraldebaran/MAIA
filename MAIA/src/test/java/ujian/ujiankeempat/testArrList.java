package ujian.ujiankeempat;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class testArrList {

	@Test
	public void arrlist() {
		ArrayList<Object> strList = new ArrayList<>();
		strList.add("Sumedang");
		strList.add("Bandung");
		strList.add("Semarang");
		strList.add("Jogja");
		strList.add("Kediri");
		strList.add("Depok");
		getKota(strList);
		
	}
	public static String getKota(ArrayList<Object> ListParam) {
		for(Object kot:ListParam) {
			System.out.println(kot);
		}
		return null;
	}

}

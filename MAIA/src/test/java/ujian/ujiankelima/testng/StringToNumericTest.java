package ujian.ujiankelima.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class StringToNumericTest {
	StringToNumeric strnmr=new StringToNumeric();
//  @Test(expectedExceptions = {NumberFormatException.class})
	@Test
  public void StringToDoubleTest() {
    String strToDb = "10";
    Double actualVal = 0.0;
    Double expectedVal = null;
    try {
    	actualVal = strnmr.StringToDouble(strToDb);
    	expectedVal = Double.parseDouble(strToDb);
	} catch (Exception e) {
		actualVal = 0.0;
		expectedVal=1.0;
		System.out.println("input yang dimasukkan harus angka double");
	}
    System.out.println("Actual = "+actualVal+" ========= Expected = "+expectedVal);
    assertEquals(actualVal, expectedVal);    
  }

  @Test
  public void StringToIntegerTest() {
	  String strToInt = "10.6";
	  /*
	   * bedakan antara actualVal dan expectVal agar jika 
	   * konversi gagal, sewaktu assertion tidak dianggap passes
	   */
	    Integer actualVal = 0;
	    Integer expectedVal = null;
	    try {
	    	actualVal = strnmr.StringToInteger(strToInt);
	    	expectedVal = strnmr.StringToIntegerExpected(strToInt);
		} catch (Exception e) {
			System.err.println("input yang dimasukkan harus angka integer\n"+e);
		}
	    System.out.println("Actual = "+actualVal+" ========= Expected = "+expectedVal);
	    assertEquals(actualVal, expectedVal);
  }
}

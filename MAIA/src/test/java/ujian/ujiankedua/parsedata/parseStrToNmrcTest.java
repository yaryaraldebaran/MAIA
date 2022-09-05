package ujian.ujiankedua.parsedata;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class parseStrToNmrcTest {
	parseStrToNmrc psn;
	
	@BeforeTest
	public void befTest() {
		psn = new parseStrToNmrc();
	}
	
  @Test
  public void strToDblTest() {
    assertEquals(psn.strToDbl("9"),Double.parseDouble("9"));
  }
  
  
  @Test
  public void strToIntTest() {
	  try {
		  assertEquals(psn.strToInt("9.0"),Integer.parseInt("9"));
	} catch (AssertionError e) {
		System.out.println("errornya pada class test adalah "+e);
	}
	  
  }
}

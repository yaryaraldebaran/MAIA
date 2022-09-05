package ujian.ujiankedua.geometri;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GeometriTest {
	Geometri gmt;
	double doPanjang;
	double doLebar;
	double doTinggi;
	double doAlas;
	double doSisiA;
	double doSisiB;
	
	@BeforeTest
	public void befTest() {
		System.out.println("Test dimulai");
		gmt = new Geometri();
	}
	
	
  @Test
  public void luasPersegiTest() {
    System.out.println("ini adalah test luasPersegi()");
    assertEquals(gmt.luasPersegi(9.01, 7.08), (9.01*7.08));
  }

  @Test
  public void luasSegitigaTest() {
	  System.out.println("Ini adalah test luasSegitiga()");
//	  gmt.luasSegitigaSatu(9.01, 9.8);
//	  gmt.luasSegitigaDua(9.01, 9.8);
	  assertEquals(gmt.luasSegitigaSatu(9.01, 9.8),(double)1/2*9.01*9.8 );
  }

  @Test
  public void luasTrapesiumTest() {
	  System.out.println("Ini adalah test luasTrapesium()");
	  assertEquals(gmt.luasTrapesium(12.0, 13.0, 5.0), (12.0+13.0)/2*5.0);
  }
}

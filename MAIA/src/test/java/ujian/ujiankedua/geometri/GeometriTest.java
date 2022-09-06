package ujian.ujiankedua.geometri;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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
	@BeforeClass
	public void befC() {
		System.out.println("=================INI BEFORE TEST CLASS GEOMETRI=================");
	}
	@AfterClass
	public void aftC() {
		System.out.println("=================INI AFTER TEST CLASS GEOMETRI=================\n\n");
	}
	
	@BeforeTest
	public void befTest() {
		System.out.println("Test dimulai");
		gmt = new Geometri();
	}
	@BeforeMethod
	public void befMethod() {
		System.out.println("===============TES GEOMETRI DIMULAI===============");
	}
	@AfterMethod
	public void aftMethod() {
		System.out.println("===============TEST GEOMETRI SELESAI===============\n");
	}
	
	
  @Test
  public void luasPersegiTest() {
    System.out.println("ini adalah test luasPersegi()");
    AssertJUnit.assertEquals(gmt.luasPersegi(9.01, 7.08), (9.01*7.08));
  }

  @Test
  public void luasSegitigaTest() {
	  System.out.println("Ini adalah test luasSegitiga()");
	  AssertJUnit.assertEquals(gmt.luasSegitigaSatu(9.01, 9.8),(double)1/2*9.01*9.8 );
  }

  @Test
  public void luasTrapesiumTest() {
	  System.out.println("Ini adalah test luasTrapesium()");
	  AssertJUnit.assertEquals(gmt.luasTrapesium(12.0, 13.0, 5.0), (12.0+13.0)/2*5.0);
  }
}

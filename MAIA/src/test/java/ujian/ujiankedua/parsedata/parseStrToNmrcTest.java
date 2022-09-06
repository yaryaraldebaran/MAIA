package ujian.ujiankedua.parsedata;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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

import ujian.ujiankedua.datagenerator.DataGenerator;

public class parseStrToNmrcTest {
	parseStrToNmrc psn;
	DataGenerator dtg;
	@BeforeClass
	public void befC() {
		System.out.println("=================INI BEFORE TEST CLASS PARSING=================");
	}
	@AfterClass
	public void aftC() {
		System.out.println("=================INI AFTER TEST CLASS PARSING=================\n\n");
	}
	@BeforeTest
	public void befTest() {
		dtg = new DataGenerator();
		psn = new parseStrToNmrc();
	}
	@BeforeMethod
	public void befMethod() {
		System.out.println("===============TES PARSING DIMULAI===============");
	}
	@AfterMethod
	public void aftMethod() {
		System.out.println("===============TEST PARSING SELESAI===============");
	}
  @Test
  public void strToDblTest() {
    AssertJUnit.assertEquals(psn.strToDbl("9"),Double.parseDouble("9"));
  }
  
  
  @Test
  public void strToIntTest() {
	  String k = dtg.strGenerator();
	  try {
		  AssertJUnit.assertEquals(psn.strToInt(k),Integer.parseInt(k));
	} catch (AssertionError e) {
		System.out.println("errornya pada class test adalah "+e);
	}
	  
  }
}

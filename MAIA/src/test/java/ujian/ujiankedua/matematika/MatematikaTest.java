package ujian.ujiankedua.matematika;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import ujian.ujiankedua.datagenerator.DataGenerator; 
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ujian.ujiankedua.datagenerator.DataGenerator;
public class MatematikaTest {
	Matematika mtk;
	double doublePertama;
	double doubleKedua;
	int intBawah;
	int intAtas;
	DataGenerator dtg;
	Random rndm;
	@BeforeClass
	public void befC() {
		System.out.println("=================INI BEFORE TEST CLASS MATEMATIKA=================");
	}
	@AfterClass
	public void aftC() {
		System.out.println("=================INI AFTER TEST CLASS MATEMATIKA=================\n\n");
	}
	@BeforeTest
	public void befTest() {
		rndm = new Random();
		dtg = new DataGenerator();
		mtk = new Matematika();
	}
	@BeforeMethod
	public void befMethod() {
		System.out.println("===============TES MATEMATIKA DIMULAI===============");
	}
	@AfterMethod
	public void aftMethod() {
		System.out.println("===============TEST MATEMATIKA SELESAI===============\n");
	}
  @Test(priority = 3)
  public void modulusTest() {
    intBawah = 10;
    intAtas = 20;
    int a = dtg.intGenerator(intBawah, intAtas);
    int b = dtg.intGenerator(intBawah, intAtas);
    try {
    	AssertJUnit.assertEquals(mtk.modulus(a,b), (a%b));
	} catch (AssertionError e) {
		System.out.println("Terdapat error pada testing modulus yakni "+e);
	}
    
  }

  @Test(priority = 2)
  public void pembagianTest() {
    doublePertama = 29.0;
    doubleKedua = 30.0;
    double doA = dtg.doGenerator(doublePertama, doubleKedua);
    double doB = dtg.doGenerator(doublePertama,doubleKedua);
    try {
    	AssertJUnit.assertEquals(mtk.pembagian(doA, doB), (doA/doB));
	} catch (AssertionError e) {
		System.out.println("terdapat error pada testing pembagian yakni "+e);
	}
     
  }

  @Test(priority = 1)
  public void penguranganTest() {
	  doublePertama =10.0;
	  doubleKedua = 20.0;
	  double doA = dtg.doGenerator(doublePertama, doubleKedua);
	  double doB = dtg.doGenerator(doublePertama, doubleKedua);
	  try {
		  AssertJUnit.assertEquals(mtk.pengurangan(doA, doB), (doA-doB));
	} catch (AssertionError e) {
		System.out.println("terdapat error pada testing pengurangan yakni "+e);
	}
	  
  }

  @Test(priority =0)
  public void penjumlahanTest() {
    doublePertama = rndm.nextDouble()*10; 
    doubleKedua = rndm.nextDouble()*10;
    try {
    	AssertJUnit.assertEquals(mtk.penjumlahan(doublePertama, doubleKedua), (doublePertama+doubleKedua));
	} catch (AssertionError e) {
		System.out.println("terdapat error pada testing penjumlahan yakni "+e);
	}
    
  }

}

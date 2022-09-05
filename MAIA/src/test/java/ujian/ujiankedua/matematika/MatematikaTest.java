package ujian.ujiankedua.matematika;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MatematikaTest {
	Matematika mtk;
	double doublePertama;
	double doubleKedua;
	int intPertama;
	int intKedua;
	@BeforeTest
	public void befTest() {
		mtk = new Matematika();
	}
  @Test(priority = 3)
  public void modulusTest() {
    intPertama = 80/3;
    intKedua = 20;
    try {
    	assertEquals(mtk.modulus(intPertama, intKedua), (80 % 20));
	} catch (AssertionError e) {
		System.out.println("Terdapat error pada testing modulus yakni "+e);
	}
    
  }

  @Test(priority = 2)
  public void pembagianTest() {
    doublePertama = 29.0;
    doubleKedua = 30.0;
    try {
    	assertEquals(mtk.pembagian(doublePertama, doubleKedua), (27.0/30.0));
	} catch (AssertionError e) {
		System.out.println("terdapat error pada testing pembagian yakni "+e);
	}
     
  }

  @Test(priority = 1)
  public void penguranganTest() {
	  doublePertama =10.0;
	  doubleKedua = 20.0;
	  try {
		  assertEquals(mtk.pengurangan(doublePertama, doubleKedua), (doublePertama-doubleKedua));
	} catch (AssertionError e) {
		System.out.println("terdapat error pada testing pengurangan yakni "+e);
	}
	  
  }

  @Test(priority =0)
  public void penjumlahanTest() {
    doublePertama = 9.0; 
    doubleKedua = 10.0;
    try {
    	assertEquals(mtk.penjumlahan(doublePertama, doubleKedua), (doublePertama+doubleKedua));
	} catch (AssertionError e) {//assertionerror tidak bisa dihandling oleh exception
		System.out.println("terdapat error pada testing penjumlahan yakni "+e);
	}
    
  }

}


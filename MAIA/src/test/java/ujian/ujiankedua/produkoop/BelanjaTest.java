package ujian.ujiankedua.produkoop;

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


public class BelanjaTest {
	Belanja blj;
	int intLoopBef;
	int intLoopAft;
	@BeforeClass
	public void befC() {
		System.out.println("=================INI BEFOR TEST CLASS BELANJA=================\n");
	}
	@AfterClass
	public void aftC() {
		System.out.println("=================INI AFTER TEST CLASS BELANJA=================\n");
	}
    @BeforeTest
    public void befTest(){
    	intLoopBef = 1;
    	intLoopAft =1;
    	blj = new Belanja();
    	System.out.println("ini adalah before test");
    }
	@Test(priority = 0)
	public void cekStokProdTest()
	{
		AssertJUnit.assertEquals(blj.cekStok(), 12);
		System.out.println("cek stok test selesai");
	}
	@Test(priority =1)
	public void tambahStokProdTest() {
		AssertJUnit.assertEquals(blj.tambahStok(34), 46);
	}
	@Test(priority=2)
	public void kurangStokProdTest() {
		//ini dieksekusi kedua
		AssertJUnit.assertEquals(blj.kurangStok(8),38);
	}
	@Test(priority=3)
	public void kalkulasiDiskonTest() {
		AssertJUnit.assertEquals(blj.kalkulasiDiskon(),4000.0);
	}
	@Test(priority=4)
	public void kalkulasiDiskonTestDua() {
		//mengubah nilai diskon menggunakan method overloading
		double diskonBaru = 50.0;
		AssertJUnit.assertEquals(blj.kalkulasiDiskon(diskonBaru),2500.0);
	}
	@AfterMethod
	public void aftMethod() {
		System.out.printf("===Method test ke %d selesai===\n\n",intLoopAft);
		intLoopAft++;
	}
	@BeforeMethod
	public void befMethod() {
		System.out.printf("===Method test ke %d dimulai===\n",intLoopBef);
		intLoopBef++;
	}
}
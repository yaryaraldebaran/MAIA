package ujian.ujiankeempat.openweather;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import latihan.utils.ExcelReader;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ByLatLonLang {
	private ExcelReader excelReader;
	private Object[][] dDriven;
	private int intColumnNums;
	private int intRowNums;
	private JSONObject req ;
	
	@BeforeTest
	public void befTest() {
		req = new JSONObject();
		baseURI = "https://api.openweathermap.org";
		String excelPath = "C:\\Users\\NEXSOFT\\Documents\\lmsJuaraKoding\\Ujian\\Ujian_Keempat\\ByLatLonLang.xlsx";
		String sheetName = "Sheet1";
		excelReader = new ExcelReader(excelPath, sheetName);
		intRowNums = excelReader.getRowCount();
		intColumnNums = excelReader.getColCount();
	}
	
	@DataProvider(name="DataLonLat")
	public Object[][] dataGetLonLat() {
		dDriven = new Object[intRowNums][intColumnNums];
		
		Iterator<Row> r = excelReader.getIter();
		int a=0;
		while(r.hasNext())
		{
			Row rows = r.next();
			for(int j=0;j<intColumnNums;j++)
			{
				dDriven[a][j] = excelReader.getCellData(a, j);
				System.out.println(dDriven[a][j]);
			}
			a++;
		}
		
		return dDriven;
	}
	
	@Test(dataProvider = "DataLonLat")
	public void testGet(String lat, String lon,String lang) {
		req.put("lat", lat);
		req.put("lon",lon);
		req.put("lang", lang);
		
		String apiKey = "169188bdd54dec8d21ed024fdac327ce";
		given().
			param("lat", req.get(lat))
			.and().param("lon",req.get(lon))
			.and().param("lang", req.get(lang))
			.and().param("appid", apiKey).
			get("/data/2.5/weather").then().
			statusCode(200).log().all();
	}
}

package latihan.latihanrstassured;
import org.json.simple.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class SampleRestAssured {
	JSONObject req;
	@BeforeTest
	public void befTest() {
		baseURI = "http://localhost:3000";
		req = new JSONObject();
	}
	@SuppressWarnings("unchecked")
	@Test(priority =0)
	public void testPost() {
		req.put("first_name", "Kurnia");
		req.put("last_name", "Ucup");
		req.put("subject_id", 5);
		given().
			header("Content-Type", "application/json").
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
			body(req.toJSONString()).when().
			post("/users").
			then().
			statusCode(200).
			log().
			all();
	}
	@Test(priority = 1)
	public void testGet() {
		given().get("/users").then().statusCode(200).log().all();
	}
	@Test(priority=2)
	public void testGetDua() {
		String params = "1";
		// test menggunakan param 
		given().param("first_name", "Karfe").get("/users/").then().statusCode(200).log().all();
	}
	@Test(priority=5)
	public void testGetParam() {
		String params = "1";
		// test menggunakan dua param 
		given().param("first_name", "Kurnia").and().param("last_name", "Ucup").when().get("/users/").then().statusCode(200).log().all();
	}
	
	@Test(priority = 3)
	public void testPut() {//semua field di object id 1 akan diubah menjadi 1,Bono
		String id = "1";
		JSONObject ja = new JSONObject();
		ja.put("first_name", "Bono");
		 given().header("Content-type", "application/json").body(ja.toJSONString()).
		 when().
		 put("/users/"+id).
		 then().
		 log().
		 all();

	}
	@Test(priority = 3)
	public void testPatch() {
		String id = "3";
		JSONObject ja = new JSONObject();
		ja.put("first_name", "The edge");
		ja.put("last_name", "U2");
		ja.put("subject_id", 5);
		 given().header("Content-type", "application/json").body(ja.toJSONString()).
		 when().//patch digunakan untuk sebagian aja
		 patch("/users/"+id).
		 then().
		 log().
		 all();

	}
	@Test (priority =4)
	public void testDelete() {
		int id=1;
		given().delete("users/"+id).then().statusCode(200).log().all();
	}
	
	@DataProvider(name="DataProviderFirst")//fungsi untuk return data generator
	public Object[][]dataDrivenPost(){
		Object[][] dDriven = new Object[2][3];
		dDriven[0][0]="Lampard";
		dDriven[0][1]="Nunez";
		dDriven[0][2]=5;
		
		dDriven[1][0]="Bono";
		dDriven[1][1]="Lordo";
		dDriven[1][2]=6;
		return dDriven;
		
	}
	@Test(priority=6, dataProvider = "DataProviderFirst")
	public void dataProvTest(String fName, String lName,int subId) {
		req.put("first_name", fName);
		req.put("last_name", lName);
		req.put("subject_id", subId);
		given().
			header("Content-Type", "application/json").
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
			body(req.toJSONString()).when().
			post("/users").
			then().
			statusCode(201).
			log().
			all();
	}
	@Test()
	public void testJson() {
		req.put("first_name", "Liam");
		req.put("last_name", "Jobs");
		req.put("subject_id", 10);
		/*
		 * befTest->Test tiap test punya data berbeda, ini karena
		 * framework testng 
		 */
		System.out.println(req.toJSONString());
	}
}

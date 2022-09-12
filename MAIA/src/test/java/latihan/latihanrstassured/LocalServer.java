package latihan.latihanrstassured;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class LocalServer {
	
	JSONObject req ;
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "http://localhost:3000/";
		req = new JSONObject();
	}
	
	@Test(priority = 0)
	public void testGet()
	{
		given().
		param("first_name","Andhika").
		get("/users").then().statusCode(200).log().all();
	}
	
	@Test(priority = 1)
	public void testPost()
	{		
		req.put("first_name","Nico");
		req.put("last_name","Hermawan");
		req.put("subject_id",1);
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(req.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).log().all();
	}
	
//	@Test(priority = 2)
//	public void testPatch()
//	{
//		
//		req.put("first_name","Alamanda");
//		req.put("last_name","Florencia");
//		
//		given().
//			contentType(ContentType.JSON).
//			accept(ContentType.JSON).
//			header("Content-Type","application/json").
//			body(req.toJSONString()).
//		when().
//			patch("/users/6").
//		then().
//			statusCode(200).log().all();
//	}
	
	@Test(priority = 3)
	public void testPut()
	{
		req.put("first_name","Alamanda");
		req.put("last_name","Florencia");
		req.put("subject_id",2);
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(req.toJSONString()).
		when().
			put("/users/6").
		then().
			statusCode(200).log().all();
	}
	@Test(priority = 4)
	public void testDelete()
	{
		when().
			delete("/users/10").
		then().
			statusCode(200).log().all();
	}
}
package latihan.latihanrstassured;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequestTest {

	@Test(priority = 0)
	public void testPost()
	{
		JSONObject request = new JSONObject();
		request.put("name", "Paul");
		request.put("job", "IT Engineer");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201);
	}
	
	@Test(priority = 1)
	public void testPut()
	{
		JSONObject request = new JSONObject();
		request.put("name", "Paul");
		request.put("job", "IT Engineer");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200).log().all();
	}
	
	@Test(priority = 2)
	public void testPatch()
	{	
//		String strX[] = "1,2,3,4,5".split(",");
//		for(int i=0;i<strX.length;i++)
//		{
//			System.out.println(strX[i]);
//		}
		
		JSONObject request = new JSONObject();
		request.put("name", "Paul");
		request.put("job", "IT Engineer");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		patch("https://reqres.in/api/users/2").
		then().
		statusCode(200).log().all();
	}
	
	@Test (priority = 3)
	public void testDelete()
	{
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(204).log().all();
	}
}
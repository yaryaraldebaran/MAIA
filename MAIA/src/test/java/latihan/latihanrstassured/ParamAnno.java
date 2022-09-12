package latihan.latihanrstassured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParamAnno {

JSONObject req ;
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "http://localhost:3000/";
		req = new JSONObject();
	}
	
	@Parameters({"uId"})
	@Test(priority =0)
	public void testForDelete(int uId)
	{
		System.out.println("User ID From XML Param : "+uId);
		when().
			delete("/users/"+uId).
		then().
			statusCode(200).log().all();
	}
}
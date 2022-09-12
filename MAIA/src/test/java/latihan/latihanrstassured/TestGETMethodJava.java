package latihan.latihanrstassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestGETMethodJava {
	String endpoint = "https://reqres.in/api/user?page=1";
	@Test
	public void testFirst() {
		Response response = RestAssured.get(endpoint);
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
	}
	
}

package ujian.ujiankeempat.RestAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class restAssuredNopCommerce {
	@BeforeTest
	public void befTest() {
		baseURI = "https://api.openweathermap.org";
	}
	@Test
	public void Tests() {
		String apiKey = "169188bdd54dec8d21ed024fdac327ce";
		given().
			param("zip",13031,"US").and().param("appid", apiKey).
			get("/data/2.5/weather").then().
			statusCode(200).log().all();
	}
}

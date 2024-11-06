package practiceAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExchangeRateAPI 
{
	@Test
	public void exchangerate()
	{
		RestAssured.baseURI="https://v6.exchangerate-api.com/v6/4ee631bf296375968b750e54/latest/USD";
		
		Response response = RestAssured.given().log().all().when().get();
		
		JsonPath resp = response.jsonPath();
		
		float rate = resp.get("conversion_rates.AUD");
		
		System.out.println("Conversion Rate is "+rate);
		
	}

}

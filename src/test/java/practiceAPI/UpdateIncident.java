package practiceAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncident 
{

	@Test
	public void updateIncident()
	{
		RestAssured.baseURI = "https://dev222622.service-now.com/api/now/table";
		RestAssured.authentication = RestAssured.basic("admin", "Ip0X4dMd+$lK");
		
		RequestSpecification inputRequest = RestAssured.given().log().all().contentType("application/json")
		.when().body("{\r\n"
				+ "\"short_description\" : \"updating using RestAssured\",\r\n"
				+ "\"description\" : \"updating the record\"\r\n"
				+ "}");
		
		Response response = inputRequest.put("incident/85ae244283d11210f3a678c6feaad3d1");
		
		response.prettyPrint();
		
	}
}

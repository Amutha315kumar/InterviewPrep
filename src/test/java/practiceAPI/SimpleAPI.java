package practiceAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleAPI 
{
@Test
	public void createIncident()
	{
		RestAssured.baseURI = "https://dev222622.service-now.com/api/now/table/";
		RestAssured.authentication= RestAssured.basic("admin", "Ip0X4dMd+$lK");
		
		RequestSpecification inputResquest = RestAssured.given().log().all().contentType("application/json").when()
		.body("{\r\n"
				+ "\"short_description\" : \"Creating using RestAssured\",\r\n"
				+ "\"description\" : \"Record inserting\"\r\n"
				+ "}");
		
		Response response = inputResquest.post("incident");
		
		response.prettyPrint();
		
	}
}

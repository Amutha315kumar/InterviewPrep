package chaining;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncident  extends BaseClass
{
@Test
	public void createIncident()
	{
		
		RequestSpecification inputResquest = RestAssured.given().log().all().contentType("application/json").when()
		.body("{\r\n"
				+ "\"short_description\" : \"Creating using RestAssured\",\r\n"
				+ "\"description\" : \"Record inserting\"\r\n"
				+ "}");
		
		Response response = inputResquest.post();
		
		JsonPath repo = response.jsonPath();
		sysID = repo.get("result.sys_id");
		INCNumber = repo.get("result.number");
		
		System.out.println("System ID :"+sysID);
		System.out.println("Request ID :"+INCNumber);
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 201);
		
		
		
	}
}

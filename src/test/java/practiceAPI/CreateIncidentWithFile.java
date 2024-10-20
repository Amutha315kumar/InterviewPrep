package practiceAPI;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentWithFile 
{
@Test
	public void createIncidentFile()
	{
		RestAssured.baseURI = "https://dev222622.service-now.com/api/now/table/";
		
		RestAssured.authentication = RestAssured.basic("admin", "Ip0X4dMd+$lK");
		
		File fileName = new File("./src/test/resources/CreateIncident.json");
		
		RequestSpecification inputRequest = RestAssured.given().log().all().contentType("application/json")
				.when().body(fileName);
		
		Response response = inputRequest.post("incident");
		
		response.prettyPrint();
		
		int statusCode = response.getStatusCode();
		
		System.out.println("Status Code is "+statusCode);
	}
}

package practiceAPI;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetIncidentNumber 
{

	@Test
	public void getNumber()
	{
		RestAssured.baseURI = "https://dev222622.service-now.com/api/now/table";
		RestAssured.authentication = RestAssured.basic("admin", "Ip0X4dMd+$lK");
		
		File filename = new File ("./src/test/resources/CreateIncident.json");
		
		RequestSpecification inputRequest = RestAssured.given().log().all().contentType("application/json").when()
		.body(filename).queryParam("sysparm_fields", "number,sys_id,short_description,description");
		
		Response response = inputRequest.post("incident");
		
		int statusCode = response.getStatusCode();
		
		JsonPath resp = response.jsonPath();
		
		String INCNumber = resp.get("result.number");
		response.prettyPrint();
		System.out.println("Incident Number is "+INCNumber);
		System.out.println("Status code is "+statusCode);
		
		
		
		
	}
	
}

package chaining;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncident extends BaseClass
{

	@Test(dependsOnMethods = "chaining.GetIncident.getIncident")
	public void updateIncident()
	{
		File updatefile = new File ("./src/test/resources/UpdateIncident.json");
		RequestSpecification inputRequest = RestAssured.given().contentType("application/json").when()
		.body(updatefile);
		
		Response response = inputRequest.put("/"+sysID);
		
		JsonPath repo = response.jsonPath();
		sysID = repo.get("result.sys_id");
		String number = repo.get("result.number");
		String shortDesc = repo.get("result.short_description");
		String desc = repo.get("result.description");
		
		System.out.println("System ID :"+sysID);
		System.out.println("Request ID :"+number);
		System.out.println("Short Description :"+shortDesc);
		System.out.println("Description :"+desc);
		
	}
}

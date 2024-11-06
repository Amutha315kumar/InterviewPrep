package chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetIncident extends BaseClass 
{

	@Test(dependsOnMethods = "chaining.CreateIncident.createIncident")
	public void getIncident()
	{
		
		Response response = RestAssured.given().when()
				.queryParam("sysparm_fields", "sys_id,number,short_description,description")
				//.get("/"+sysID);
		.get();
		response.prettyPrint();
		
		
	}
}

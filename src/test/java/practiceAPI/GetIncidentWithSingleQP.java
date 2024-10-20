package practiceAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetIncidentWithSingleQP 
{

	@Test
	public void singleQP()
	{
		RestAssured.baseURI = "https://dev222622.service-now.com/api/now/table/";
		RestAssured.authentication = RestAssured.basic("admin", "Ip0X4dMd+$lK");
		
		RequestSpecification inputRequest = RestAssured.given().queryParam("sysparm_fields", "sys_id,short_description");
		
		Response response = inputRequest.get("incident");
		response.prettyPrint();
	}
}

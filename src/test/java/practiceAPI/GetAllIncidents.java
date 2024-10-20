package practiceAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllIncidents 
{
@Test
	public void getAllIncidents()
	{
		RestAssured.baseURI = "https://dev222622.service-now.com/api/now/table";
		RestAssured.authentication = RestAssured.basic("admin", "Ip0X4dMd+$lK");
		
		Response response = RestAssured.get("incident");
		int statusCode = response.getStatusCode();
		System.out.println("Status code is "+statusCode);
		response.prettyPrint();
		
	}
}

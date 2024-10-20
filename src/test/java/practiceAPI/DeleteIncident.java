package practiceAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteIncident 
{
@Test
	public void deleteIncident()
	{
		
		RestAssured.baseURI="https://dev222622.service-now.com/api/now/table/";
		RestAssured.authentication=RestAssured.basic("admin", "Ip0X4dMd+$lK");
		
		Response response = RestAssured.delete("incident/ff69f40e83d11210f3a678c6feaad332");
		
		int statusCode = response.getStatusCode();
		System.out.println("Status code is "+statusCode);
	}
}

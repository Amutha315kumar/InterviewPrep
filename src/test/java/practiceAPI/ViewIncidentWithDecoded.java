package practiceAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ViewIncidentWithDecoded 
{
	@Test
	public void ViewIncidentDecoded()
	{
		RestAssured.baseURI = "https://dev222622.service-now.com/api/now/table/";

		RequestSpecification inputRequest = RestAssured.given().log().all()
				.header("Authorization","Basic YWRtaW46SXAwWDRkTWQrJGxL");
		

		Response response = inputRequest.get("incident");
		response.prettyPrint();
		
	}

}

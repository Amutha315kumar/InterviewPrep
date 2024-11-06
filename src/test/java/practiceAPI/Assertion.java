package practiceAPI;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import chaining.BaseClass;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assertion extends BaseClass

{
@Test(dependsOnMethods = "chaining.CreateIncident.createIncident")
	public void assertion()
	{
	
		//RestAssured.baseURI = "https://dev229700.service-now.com/api/now/table/incident";
		//RestAssured.authentication= RestAssured.basic("admin", "IP8EF+pj9@dn");
		
//		RequestSpecification inputResquest = RestAssured.given().log().all().contentType("application/json").when()
//				.body("{\r\n"
//						+ "\"short_description\" : \"Creating using RestAssured\",\r\n"
//						+ "\"description\" : \"Record inserting\"\r\n"
//						+ "}");
//				
//				Response response = inputResquest.post();
		
		//**************************************
		//int statusCode = response.getStatusCode();
		//Assert.assertEquals(statusCode, 200);
		//**************************************
		
		//**********************************************
		// response.then().assertThat().statusCode(200);
		//**********************************************
		
				
		//Equal To Assertion*****************************		
		//response.then().assertThat().body("result.short_description",Matchers.equalTo("Creating using RestAssured"));
		//***********************************************
				
		//Partial Assertion*****************************		
		//response.then().assertThat().body("result.short_description",Matchers.containsString("RestAssured"));
		//***********************************************		
	
		 RestAssured.given().log().all().when().get();
		
		//verifying the created incident is present in GetIncident*********************
		//response.then().assertThat().body("result.number", Matchers.hasItem(INCNumber));
		//*****************************************************************************
	
	
	}
}

package practiceAPI;

import org.testng.annotations.Test;

import chaining.BaseClass;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JsonSchemaValidation extends BaseClass 

{
@Test
	public void schemaValidator()
	{
		
	RequestSpecification inputResquest = RestAssured.given().log().all().contentType("application/json").when()
			.body("{\r\n"
					+ "\"short_description\" : \"Creating using RestAssured\",\r\n"
					+ "\"description\" : \"Record inserting\"\r\n"
					+ "}");
			
			Response response = inputResquest.post();
			
			//response.then().assertThat().body(Json, null)
			
	
	}
	
}

package practiceAPI;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetAllIncidentNumbers 
{

	@Test
	public void getAllNumbers()
	{
		
		RestAssured.baseURI = "https://dev222622.service-now.com/api/now/table";
		RestAssured.authentication = RestAssured.basic("admin", "Ip0X4dMd+$lK");
		
		Response response = RestAssured.given().log().all().when().get("incident");
		JsonPath jsonPath = response.jsonPath();
		
		List<String> list = jsonPath.getList("result.number");
		
		for (String eachNum : list)
		{
			System.out.println(eachNum);
		}
		
		
	}
	
}

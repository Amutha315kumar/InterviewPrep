package practiceAPI;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TotalCR 
{

	@Test
	public void changeRequest()
	{
		RestAssured.baseURI = "https://dev222622.service-now.com/api/now/table";
		RestAssured.authentication = RestAssured.basic("admin", "Ip0X4dMd+$lK");
		
		Response response = RestAssured.given().when()
				.get("change_request");
		
		JsonPath resp = response.jsonPath();
		List<String> number = resp.getList("result.number");
		List<String> state = resp.getList("result.state");
		
		int count =0;
		for (int i = 0; i<number.size();i++)
		{
			if(state.get(i).equals("-5"))
				count++;

		}
		
		System.out.println("Total new State is "+count);
		
	}
}

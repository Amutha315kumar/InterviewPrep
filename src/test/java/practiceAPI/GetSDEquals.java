package practiceAPI;

import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetSDEquals 

{
@Test
	public void getSDEquals()
	
	{
	RestAssured.baseURI = "https://dev222622.service-now.com/api/now/table";
	RestAssured.authentication = RestAssured.basic("admin", "Ip0X4dMd+$lK");
	
	Response response = RestAssured.given().when().get("incident");
	JsonPath resp = response.jsonPath();
	List<String> number = resp.getList("result.number");
	List<String> SDdesc = resp.getList("result.short_description");
	
	for (int i = 0; i < number.size(); i++) 
	{
		if (SDdesc.get(i).equals("Creating using RestAssured"))
				System.out.println(number.get(i));
	}
		
	}
	
	}


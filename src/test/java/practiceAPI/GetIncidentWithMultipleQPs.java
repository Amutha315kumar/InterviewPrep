package practiceAPI;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetIncidentWithMultipleQPs 
{

	@Test
	public void MultipleQPs()
	{
		RestAssured.baseURI = "https://dev229700.service-now.com/api/now/table/";
		RestAssured.authentication = RestAssured.basic("admin", "IP8EF+pj9@dn");
		
		Map<String,String> qp = new HashMap<String,String>();
		qp.put("sysparm_limit", "1");
		qp.put("sysparm_fields", "sys_id,short_description,description");

		
		RequestSpecification inputRequest = RestAssured.given().queryParams(qp);
		
		Response response = inputRequest.get("incident");
		response.prettyPrint();
	}
}

package chaining;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;


public class BaseClass 
{

	
	public static String sysID;
	public static String INCNumber;
	@BeforeMethod
	public void preCondition()
	{
	RestAssured.baseURI = "https://dev229700.service-now.com/api/now/table/incident";
	RestAssured.authentication= RestAssured.basic("admin", "IP8EF+pj9@dn");
	}
}

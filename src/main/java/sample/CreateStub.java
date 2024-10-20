package sample;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateStub 
{
 public void createMapping()
 {
	 stubFor(get(urlEqualTo("/api/now/table/incident"))
				.willReturn(aResponse().withStatus(200)
						.withBody("Sample Response")
						.withHeader("Content-Type", "application/json")
						));
 }

 @Test
 public void verifyStub()
 {
	 createMapping();
	 RestAssured.baseURI = "http://localhost:8080/";
	 RestAssured.given().log().all()
	 .when()
	 .get("/api/now/table/incident")
	 .then()
	 .assertThat().statusCode(200);
	 
 }
 
 
}

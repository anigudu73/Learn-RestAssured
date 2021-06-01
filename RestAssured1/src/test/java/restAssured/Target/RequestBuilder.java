package restAssured.Target;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class RequestBuilder {

	public static void main(String[] args) {
		
		// Build Request
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.log().all();
		requestSpecification.baseUri("https://restful-booker.herokuapp.com");
		requestSpecification.basePath("/booking");
		requestSpecification.body("{\r\n"
				+ "    \"firstname\" : \"Anish\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    }}");
		requestSpecification.contentType(ContentType.JSON);
		
		// Hit Request and Get Response
		Response response = requestSpecification.post();
		
		// Validate Response
		ValidatableResponse vResponse = response.then().log().all();
		vResponse.statusCode(200);
		
		

	}

}

package restAssured.Target;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class PathParams4 {

	public static void main(String[] args) {
		Map<String, Object> pathParams = new HashMap<>();
		pathParams.put("type", "booking");
		pathParams.put("id", 2);
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("{type}/{id}")
				.pathParams(pathParams)
			.when()
				.get()
			.then()
				.log()
				.all()
				.statusCode(200);
			
		
		

	}

}

package restAssured.Target;

import io.restassured.RestAssured;

public class GETRequest {

	public static void main(String[] args) {
		//Build Request
				RestAssured
				.given()
					.log()
					.all()
					.baseUri("https://restful-booker.herokuapp.com")
					.basePath("/booking/{id}")
					.pathParam("id", 17)
				
		//Hit Request and get Response
				.when()
					.get()
				
		//Validate Response
				.then()
					.log()
					.all()
					.statusCode(200);

			}

	}



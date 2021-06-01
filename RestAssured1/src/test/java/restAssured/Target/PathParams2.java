package restAssured.Target;

import io.restassured.RestAssured;

public class PathParams2 {

	public static void main(String[] args) {
		RestAssured
			.given()
				.log()
				.all()
				
			.when()
				.get("https://restful-booker.herokuapp.com/{type}/{id}","booking",2)
			.then()
				.log()
				.all()
				.statusCode(200);

	}

}

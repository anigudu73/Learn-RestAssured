package restAssured.Target;

import io.restassured.RestAssured;

public class PathParams3 {

	public static void main(String[] args) {
		RestAssured
			.given()
				.log()
				.all()
				.pathParam("type", "booking")
				
			.when()
				.get("https://restful-booker.herokuapp.com/{type}/{id}",3)
			.then()
				.log()
				.all()
				.statusCode(200);

	}

}

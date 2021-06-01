package restAssured.Target;

import io.restassured.RestAssured;

public class PathParams1 {

	public static void main(String[] args) {
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("{type}/{id}")
				.pathParam("type", "booking")
				.pathParam("id", 2)
			.when()
				.get()
			.then()
				.log()
				.all()
				.statusCode(200);

	}

}

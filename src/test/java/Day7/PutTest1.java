package Day7;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

public class PutTest1 {
    @Test
    public void test1(){
        String requestBody="{\n" +
                "  \"id\": 10,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "}";
        RestAssured.given().accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .patch("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200)
                .contentType("application/JSON");
    }
}

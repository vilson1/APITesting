package day8;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;


public class BasicAuth {
    @Test
    public void test1(){
        RestAssured.given()
                .auth().basic("username","pass")
                .and()
                .accept(ContentType.JSON)
                .when()
                .get("https://automationexercise.com/api/productsList")
                .then()
                .statusCode(200)
                .contentType("application/Json");
    }
}

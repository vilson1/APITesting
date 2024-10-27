package day3;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Test3 {
    @Test
    public void test3(){
     /* Response response= RestAssured.given().contentType(ContentType.JSON)
                .pathParams("petId",10)
                .get("https://petstore.swagger.io/v2/pet/{petId}");

        Assertions.assertEquals(200,response.statusCode());
        Assertions.assertEquals("application/json",response.contentType());

        JsonPath jsonPath=response.jsonPath();
        int id=jsonPath.getInt("tags[0].id");
        Assertions.assertEquals(10,id);*/

        given().accept(ContentType.JSON)
                .and().pathParams("petId",10)
                .when().get("https://petstore.swagger.io/v2/pet/{petId}")
                .then()
                .statusCode(200)
                .and()
                .contentType("application/json")
                .and()
                .body("id", Matchers.is(10))
                .body("category.id", Matchers.is(10));
    }
}

package day4;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void test1(){
     RestAssured.given()
                .accept(ContentType.JSON)
                .and()
                .pathParams("petId",10)
                .when()
                .get("https://petstore.swagger.io/v2/pet/{petId}")
             .then()
             .statusCode(200)
             .and()
             .contentType("application/json")
             .and()
             .header("Date", Matchers.notNullValue())
             .and().assertThat()
             .body("id",Matchers.is(10),"category.name",Matchers.is("string"),"tags[0].id",Matchers.is(10));


    }
}

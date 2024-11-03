package day6;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class PetTest {
    @Test
    public void test2(){
        Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/10")
                .then()
                .statusCode(200)
                .extract().response();

        Pet pet=response.as(Pet.class);
    }

    @Test
    public void test3(){
        Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/10")
                .then()
                .statusCode(200)
                .extract().response();

        PetStore petStore=response.as(PetStore.class);
    }
}

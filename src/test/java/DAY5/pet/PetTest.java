package DAY5.pet;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class PetTest {
    @Test
    public void test1(){
       Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/10")
                .then()
                .statusCode(200)
                .extract().response();

       Pet pet=response.as(Pet.class);
        List<String> list= pet.photoUrls;
        System.out.println(pet.status);
        System.out.println(pet.tags.get(0).id);
        System.out.println(pet);
    }
}

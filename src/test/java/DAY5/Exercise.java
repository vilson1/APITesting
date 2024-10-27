package DAY5;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class Exercise {
    @Test
    public void Test1(){
       Response response= RestAssured.get("https://fakerestapi.azurewebsites.net/api/v1/Authors/1")
                .then()
                .statusCode(200)
               .extract().response();

        Map<String,Object> book=response.as(Map.class);
        System.out.println(book.get("id").toString());
        System.out.println(book.get("idBook").toString());
        System.out.println(book.get("firstName").toString());
        System.out.println(book.get("lastName").toString());

    }
}

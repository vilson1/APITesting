package day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class Test1 {

  /*  @BeforeAll
    public static void init(){
        RestAssured.baseURI="https://petstore.swagger.io/v2";
    }*/

    @Test
    public void test1(){

      Response response= RestAssured
              .given()
              .accept(ContentType.JSON)
              .and()
              .pathParams("orderId","5")
              .when()
              .get("https://petstore.swagger.io/v2/store/order/{orderId}");

      assertEquals(200,response.statusCode());
       //Assertions.assertTrue(response.body().toString().contains("Gary"));
        System.out.println(response.body().prettyPrint());
        //System.out.println(response.path("category[0].id").toString());
       // assertEquals("female dogs",response.path("category.name").toString());



    }


}

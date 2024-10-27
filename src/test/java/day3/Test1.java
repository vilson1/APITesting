package day3;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void test1(){
        Response response= RestAssured.get("https://automationexercise.com/api/productsList");

        Assertions.assertEquals(200,response.statusCode());
        JsonPath jsonPath=response.jsonPath();
        String brand=jsonPath.getString("products[0].brand");
        Assertions.assertEquals("Polo",brand);
        System.out.println(brand);
        System.out.println(response.path("products[0].brand").toString());
    }
}

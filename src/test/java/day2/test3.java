package day2;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class test3 {
    @Test
    public void test3(){
       Response response= RestAssured.get("https://automationexercise.com/api/productsList");

        JsonPath jsonPath=response.jsonPath();
        System.out.println(jsonPath.getString("products.findAll {it.id==2}.brand"));
    }
}

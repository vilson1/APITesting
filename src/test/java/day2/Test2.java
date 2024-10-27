package day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
    @Test
    public void test2(){
        Map<String,Object> params=new HashMap<>();
        params.put("status","sold");
        Response response= RestAssured
                .given()
                .accept(ContentType.JSON)
                .and()
                .queryParams(params)
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus");

        Assertions.assertEquals(200,response.statusCode());
        Assertions.assertEquals("application/json",response.header("Content-Type"));
        List<String> statusList=response.path("status");
        System.out.println(statusList);
        for (String eachStatus : statusList) {
            Assertions.assertEquals(eachStatus,"sold");
        }

    }
}

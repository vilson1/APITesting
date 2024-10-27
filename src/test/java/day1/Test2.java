package day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test2 {
    @BeforeAll
    public static void init(){
        RestAssured.baseURI="https://petstore.swagger.io/v2";
    }
    @DisplayName("testojme base uri")
    @Test
    public void test2(){
        Response response=RestAssured.get("/store/inventory");
        System.out.println(response.statusCode());
    }

    @DisplayName("logout")
    @Test
    public void test3(){
        Response response=RestAssured.get("/user/logout");
        System.out.println(response.statusCode());
    }
}

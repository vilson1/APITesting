package day3;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;

public class Test2 {
    @Test
    public void Test2() {
        Response response = RestAssured.get("https://automationexercise.com/api/productsList");
        Assertions.assertEquals(200,response.statusCode());
        JsonPath jsonPath=response.jsonPath();
        String brand=jsonPath.getString("products.findAll {it.id==11}.category.usertype.usertype");
        System.out.println("brand = " + brand);
        MatcherAssert.assertThat(2+2, Matchers.is(4));
    }
}

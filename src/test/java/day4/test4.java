package day4;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class test4 {
    @Test
    public void test4(){
        Response response= RestAssured.given()
                .accept(ContentType.JSON)
                .and()
                .pathParams("petId",10)
                .when()
                .get("https://petstore.swagger.io/v2/pet/{petId}");

        Map<String,Object> jsonMap=response.as(Map.class);
        MatcherAssert.assertThat(jsonMap.get("id").toString(), Matchers.is("10"));
        MatcherAssert.assertThat(jsonMap.get("name").toString(), Matchers.is("doggie"));
        for (String keys : jsonMap.keySet()) {

        }
        System.out.println(jsonMap.toString());
    }
}

package day8;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class BearerToken {

    public String getToken(String username,String password){
       String token=given()
               .auth().basic(username,password)
               .when()
               .get("URL+Endpoint")
               .path("accessToken").toString();
       return token;
    }
    @Test
    public void test1(){
        String token=getToken("vilson","pass");
        given().header("Authorization",token)
                .and().accept(ContentType.JSON)
                .when()
                .get("https://automationexercise.com/api/productsList");
    }
}

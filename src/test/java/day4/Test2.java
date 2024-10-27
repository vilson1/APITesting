package day4;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Test2 {
    @Test
    public void test2(){
        RestAssured.given().accept(ContentType.JSON)
                .and()
                .get("https://automationexercise.com/api/productsList")
                .then()
                .statusCode(200)
                .and()
                .contentType("text/html; charset=utf-8")
                .and()
                .header("allow", Matchers.equalTo("DELETE, GET, OPTIONS, POST, PUT"))
                .and().assertThat()
                .body("products.id",Matchers.equalTo(1),"products[1].name", Matchers.equalTo("Blue Top"));
    }

    @Test
    public void test3(){
     String firstNameList= RestAssured.given().accept(ContentType.JSON)
                .and()
                .get("https://fakerestapi.azurewebsites.net/api/v1/Authors")
                .then()
                .statusCode(200)
                .contentType("application/json; charset=utf-8; v=1.0")
                //.header("Content-Type",Matchers.contains("application/json; charset=utf-8; v=1.0"))
                .header("Server",Matchers.is(Matchers.equalTo("Kestrel")))
                .and()
                .body("id[0]",Matchers.equalTo(1))
             .extract().response().jsonPath().get("firstName[0]");
        System.out.println(firstNameList);
        //System.out.println(firstNameList);
        //System.out.println(firstNameList.size());
    }

}

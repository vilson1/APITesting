package DAY5.book;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;


public class Test1 {
    @Test
            public void test1() {
        Response response = RestAssured.get("https://fakerestapi.azurewebsites.net/api/v1/Authors/1")
                .then()
                .statusCode(200)
                .extract().response();

        Book book = response.as(Book.class);
        System.out.println(book);
    }

    @Test
    public void test12() {
        Response response = RestAssured.get("https://fakerestapi.azurewebsites.net/api/v1/Authors/1")
                .then()
                .statusCode(200)
                .extract().response();

        JsonPath jsonPath=response.jsonPath();
        Book book = jsonPath.getObject("",Book.class);
        System.out.println(book);


    }
}

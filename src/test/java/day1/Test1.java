package day1;

import com.github.dockerjava.transport.DockerHttpClient;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void test1(){
        String url="https://petstore.swagger.io/v2/store/inventory";

       Response response= RestAssured.given().accept(ContentType.JSON).when().get(url); //request


        //kontrollon status kodin
        Assertions.assertEquals(200,response.statusCode());
        //kontrollon kontent type
        Assertions.assertEquals("application/json",response.contentType());
        Assertions.assertEquals("application/json",response.header("Content-Type"));
        //kontrollon nese data ekziston ne response header
        Assertions.assertTrue(response.headers().hasHeaderWithName("Date"));
        Assertions.assertEquals("GET, POST, DELETE, PUT",response.header("Access-Control-Allow-Methods"));


        System.out.println("statusCode = " + response.statusCode());
        System.out.println("contentType = " + response.contentType());
        System.out.println(response.prettyPrint());
        System.out.println(response.path("sold").toString());
    }
}

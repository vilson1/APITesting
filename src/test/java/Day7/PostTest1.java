package Day7;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PostTest1 {
    @Test
    public void test1(){
        String jsonRequestBody="{\n" +
                "  \"id\": 110,\n" +
                "  \"petId\": 100,\n" +
                "  \"quantity\": 10,\n" +
                "  \"shipDate\": \"2024-11-05T18:27:58.450Z\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true\n" +
                "}";
        Response ressponse=given().accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(jsonRequestBody).log().all()
                .when()
                .post("https://petstore.swagger.io/v2/store/order");
       Assertions.assertEquals(200,ressponse.statusCode());


    }

    @Test
    public void test2(){
        Map<String,Object> requestJsonMap=new HashMap<>();

        requestJsonMap.put("id",100);
        requestJsonMap.put("petId",100);
        requestJsonMap.put("quantity",10);
        requestJsonMap.put("shipDate","2024-11-05T18:27:58.450Z");
        requestJsonMap.put("status","placed");
        requestJsonMap.put("complete",true);

        for (String s : requestJsonMap.keySet()) {

        }

        Response ressponse=given().accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(requestJsonMap).log().all()
                .when()
                .post("https://petstore.swagger.io/v2/store/order");
        Assertions.assertEquals(200,ressponse.statusCode());

        Map<String,Object> responseMap=ressponse.as(Map.class);

        for (String eachKey : requestJsonMap.keySet()) {
            Assertions.assertEquals(requestJsonMap.get(eachKey),responseMap.get(eachKey));
        }

    }

    @Test
    public void test3(){
        PostTestClass requestJsonObject=new PostTestClass();
        requestJsonObject.setId(100);
        requestJsonObject.setPetId(100);
        requestJsonObject.setQuantity(10);
        requestJsonObject.setShipDate("2024-11-05T18:27:58.450Z");
        requestJsonObject.setStatus("placed");
        requestJsonObject.setComplete(true);


        Response ressponse=given().accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(requestJsonObject).log().all()
                .when()
                .post("https://petstore.swagger.io/v2/store/order");
        Assertions.assertEquals(requestJsonObject.getId(),Integer.parseInt(ressponse.path("id").toString()));

        System.out.println(ressponse.prettyPrint());


    }
}

package DAY5.pet;
import DAY5.brands.BrandList;
import DAY5.brands.Brands;
import DAY5.pet.Pet;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void test1(){
     Response response = RestAssured.get("https://automationexercise.com/api/brandsList")
                .then()
                .statusCode(200)
                .extract().response();

      BrandList brands=response.as(BrandList.class);
        System.out.println(brands);

        Brands brands1=response.jsonPath().getObject("brands[0]",Brands.class);

    }

    @Test
    public void test2(){
       Response response= RestAssured.given().accept(ContentType.JSON)
                .and()
                .queryParams("status","available")
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .extract().response();

        Pet pet=response.jsonPath().getObject("[0]",Pet.class);
        System.out.println(pet);

        PetCategory category=response.jsonPath().getObject("[0].category",PetCategory.class);
        System.out.println(category);


    }
}

package Day7;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class DeleteTest1 {
    @Test
    public void test1(){
        RestAssured.delete("https://fakerestapi.azurewebsites.net/api/v1/Activities/10")
                .then()
                .statusCode(200);

    }
}

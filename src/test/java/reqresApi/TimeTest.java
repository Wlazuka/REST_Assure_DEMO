package reqresApi;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TimeTest extends BaseTest {

    @Test
    public void getResponseTime() {


        RequestSpecification requestSpec = new RequestSpecBuilder().build();

        requestSpec.baseUri("https://reqres.in/api");
        requestSpec.basePath("/users");

        Response response = given()
                .spec(requestSpec)
                .get("/2");

        Response delayedResponse = given()
                .spec(requestSpec)
                .param("delay", 3)
                .get("/2");

        Assert.assertTrue(response.getTime() < 1000);
        Assert.assertTrue(delayedResponse.getTime() > 3000);
    }
}

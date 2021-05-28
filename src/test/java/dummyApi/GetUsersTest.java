package dummyApi;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GetUsersTest{

    public static String  getUsersSuccess() {
        return given()
                .header("app-id", "60ae340cd2a1b09642816222")
                .when()
                .get("https://dummyapi.io/data/api/user")
                .then()
                .log()
                .body()
                .toString();
    }

    @Test
    public static void firstTest() {
        System.out.println(getUsersSuccess());
    }


//    @Test
//    public void GetUsersFailNoApiID()
//    {
//        RequestSpecification httpRequest = RestAssured.given();
//
//        Response response = httpRequest.request(Method.GET, "/user");
//
//        String responseBody = response.getBody().asString();
//        System.out.println("Response Body is =>  " + responseBody);
//    }

}

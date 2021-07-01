package dummyApi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetUsersTest extends BaseTest {

    public static String getUsersSuccess() {
        return
                given()
                        .header(APP_ID, ID_VALUE)
                        .when()
                        .get(usersURL)
                        .then()
                        .log()
                        .body()
                        .toString();
    }

    public static void main(String[] args) {
        System.out.println(getUsersSuccess());
    }

    @Test
    public static void GETUsersStatus200() {
        given()
                .header(APP_ID, ID_VALUE)
                .get(usersURL)
                .then()
                .statusCode(200);
    }
    @Test
    public static void GETUsersStatus403() {
        given()
                .get(usersURL)
                .then()
                .statusCode(403);
    }

}

package reqresApi;

import reqresApi.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUsersTest extends BaseTest {

    public static String getUsersSuccess() {
        return
                given()
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
                .get(usersURL)
                .then()
                .statusCode(200);
    }

}

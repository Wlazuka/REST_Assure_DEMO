package reqresApi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUsersTest {

    @Test
    public static void GetUsers_Params() {
        given()
                .param("id", 1)
                .get("/users")
                .then()
                .log().all();
    }
}

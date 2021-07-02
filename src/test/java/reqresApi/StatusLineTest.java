package reqresApi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class StatusLineTest {

    @Test
    public static void StatusLine() {
        given()
                .get("/users")
                .then()
                .assertThat()
                .statusLine("HTTP/1.1 200 OK");
    }
}

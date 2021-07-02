package reqresApi;

import io.restassured.http.ContentType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;

public class CodeStatusTest extends BaseTest {

    @DataProvider(name = "endpointProvider")
    public Object[][] endpointProvide() {
        return new String[][]{{"/users"}, {"/register"}, {"/login"}, {"/unknown"}};
    }

    @Test(dataProvider = "endpointProvider")
    public static void GetShouldHaveStatus200(String endpoint) {
        given()
                .get(endpoint)
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public static void PostShouldHaveStatus201() {

        JSONObject request = new JSONObject();

        request.put("name", "Morpheus");
        request.put("job", "leader");

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .post("/users")
                .then()
                .assertThat()
                .statusCode(201);
    }

    @Test
    public static void PutShouldHaveStatus200() {

        JSONObject request = new JSONObject();

        request.put("name", "Morpheus");
        request.put("job", "zion resident");

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .put("/users")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public static void PatchShouldHaveStatus200() {

        JSONObject request = new JSONObject();

        request.put("name", "Morpheus");
        request.put("job", "zion resident");

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .patch("/users")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public static void DeleteShouldHaveStatus204() {

        when()
                .delete("/users/2")
                .then()
                .assertThat()
                .statusCode(204);
    }
}


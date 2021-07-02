package dummyApi;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CodeStatusTestDummy extends DummyBaseTest {

    @DataProvider(name = "dataProvider")
    public Object[][] dataProvider() {
        return new Object[][]{{"/user"}, {"/post"}, {"/tag"}};
    }

    @Test(dataProvider = "dataProvider")
    public static void GetShouldHaveStatus200(String endpoint) {
        given()
                .header(APP_ID, ID_VALUE)
                .get(endpoint)
                .then()
                .statusCode(200);
    }

    @Test(dataProvider = "dataProvider")
    public static void GetShouldHaveStatus403(String endpoint) {
        given()
                .get(endpoint)
                .then()
                .statusCode(403);
    }
}


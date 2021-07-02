package reqresApi;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HeadersTest extends BaseTest {

    @DataProvider(name = "headers")
    public Object[][] headers() {
        return new String[][]{
                {"Content-Type", "application/json; charset=utf-8"},
                {"Server", "cloudflare"},
                {"Content-Encoding", "gzip"}};
    }

    @Test(dataProvider = "headers")
    public static void HeadersTest(String key, String value) {

        Response response = given()
                .get("/users");

        Assert.assertEquals(response.getHeader(key), value);
    }
}

package reqresApi;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.*;

public class BaseTest {


    @BeforeClass
    public void setup() {
        baseURI  = "https://reqres.in/api";
    }

    @AfterClass
    public void cleanUp() {
    }
}

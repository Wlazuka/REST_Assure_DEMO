package dummyApi;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.baseURI;

public class DummyBaseTest {

    protected static final String APP_ID = "app-id";
    protected static final String ID_VALUE = "60ae340cd2a1b09642816222";

    @BeforeClass
    public void setup() {
        baseURI  = "https://dummyapi.io/data/api";
    }

    @AfterClass
    public void cleanUp() {
    }
}

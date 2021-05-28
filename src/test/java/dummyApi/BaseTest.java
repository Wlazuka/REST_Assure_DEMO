package dummyApi;

import apiservice.DummyApiEndpoint;
import io.restassured.RestAssured;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.PropertyManager;

public class BaseTest {

    protected static final String APP_ID = PropertyManager.getProperty("app-id");
    protected String baseUrl = DummyApiEndpoint.BASE_URL;

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = baseUrl;
    }


    @AfterClass
    public void cleanUp() {
    }
}

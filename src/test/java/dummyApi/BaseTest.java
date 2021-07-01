package dummyApi;

import dummyApi.apiService.DummyApiEndpoint;

public class BaseTest {

    protected static final String APP_ID = "app-id";
    protected static final String ID_VALUE = "60ae340cd2a1b09642816222";

    protected static String baseURL = DummyApiEndpoint.BASE_URL;
    protected static String usersURL = baseURL + DummyApiEndpoint.userEndpoint;
    protected static String postURL = baseURL + DummyApiEndpoint.postEndpoint;
    protected static String tagURL = baseURL + DummyApiEndpoint.tagEndpoint;

//    @BeforeClass
//    public void setup() {
//    }
//
//    @AfterClass
//    public void cleanUp() {
//    }
}

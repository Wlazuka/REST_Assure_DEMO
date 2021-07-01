package reqresApi;

import reqresApi.apiService.ReqresApiEndpoint;

public class BaseTest {

    protected static String baseURL = ReqresApiEndpoint.BASE_URL;
    protected static String usersURL = baseURL + ReqresApiEndpoint.usersEndpoint;

    public static void main(String[] args) {
        System.out.println(baseURL + " " + usersURL);
    }

//    @BeforeClass
//    public void setup() {
//    }
//
//    @AfterClass
//    public void cleanUp() {
//    }
}

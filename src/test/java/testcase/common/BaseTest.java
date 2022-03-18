package testcase.common;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected Response response;

    @BeforeTest
    public void init(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }


}

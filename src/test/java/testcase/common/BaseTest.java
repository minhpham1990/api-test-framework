package testcase.common;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest
    public void init(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }


}
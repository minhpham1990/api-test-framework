package apis;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;

import static io.restassured.RestAssured.given;


public class BaseApi {

    public static Response get(String path){
        Response res = given()
                .when()
                .get(path);
        return res;
    }

    public static Response post(String path, Object body, ContentType contentType){
        Response res = given()
                .contentType(contentType)
                .when()
                .body(body)
                .post();
        return res;
    }
}

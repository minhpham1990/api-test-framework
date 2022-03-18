package testcase.user;


import apis.UserApi;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import testcase.common.BaseTest;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


public class TC_GetUser extends BaseTest {

    @Test
    public void getAllUsers(){
        RestAssured.basePath="/users";
        Response res = UserApi.getAllUsers();
        res.then().statusCode(200);
    }

    @Test
    public void getUserByIdUser(){
        RestAssured.basePath="/users";
        Response res = UserApi.getUserById(1);
        res.prettyPrint();
        res.then().statusCode(200).body("name",equalTo("Leanne Graham"));
    }

}

package testcase.user;


import apis.UserApi;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import testcase.common.BaseTest;

import static org.hamcrest.Matchers.equalTo;


public class TC_GetUser extends BaseTest {

    @Test
    public void getAllUsers(){
        response = UserApi.getAllUsers();
        response.then().statusCode(200);
    }

    @Test
    public void getUserByIdUser(){
        response = UserApi.getUserById(1);
        response.then().statusCode(200).body("name",equalTo("Leanne Graham"));
    }

}

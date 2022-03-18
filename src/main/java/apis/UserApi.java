package apis;

import io.restassured.response.Response;
import utils.MyLogger;

public class UserApi extends BaseApi {

    public static Response getAllUsers(){
        MyLogger.info("Get all users");
        Response res = get("");
        return res;
    }

    public static Response getUserById(int id){
        MyLogger.info("Get user with id: "+id);
        Response res = get("/"+id);
        return res;
    }





}

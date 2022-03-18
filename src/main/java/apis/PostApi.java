package apis;


import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostApi extends BaseApi{
    public static Response createNewPost(String path, Object body, ContentType contentType){
        Response res = post("",body, contentType);
        return res;
    }
}

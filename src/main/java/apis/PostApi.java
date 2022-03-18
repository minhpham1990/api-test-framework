package apis;


import constant.Paths;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostApi extends BaseApi{
    public static Response createNewPost(Object body, ContentType contentType){
        Response res = post(Paths.POST_NEW_POSTS,body, contentType);
        return res;
    }
}

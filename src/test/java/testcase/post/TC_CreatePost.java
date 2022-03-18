package testcase.post;

import apis.PostApi;
import entity.Post;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import testcase.common.BaseTest;

import static org.hamcrest.Matchers.equalTo;

public class TC_CreatePost extends BaseTest {

    @Test
    public void createPost(){
        Post newPost = new Post();
        newPost.setTitlePost("minh post title");
        newPost.setBodyPost("minh post title");
        newPost.setUserId(1);
        Response res = PostApi.createNewPost(newPost, ContentType.JSON);
        res.then().statusCode(201).body("titlePost", equalTo("minh post title"));
    }
}

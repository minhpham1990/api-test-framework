package testcase.post;

import apis.BaseApi;
import entity.Post;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TC_CreatePost extends BaseApi {
    @Test
    public void createPost(){
        RestAssured.basePath="/posts";
        Post newPost = new Post();
        newPost.setTitlePost("minh post title");
        newPost.setBodyPost("minh post title");
        newPost.setUserId(1);

        Response res = given()
                .contentType(ContentType.JSON)
                .when()
                .body(newPost)
                .post();
        res.prettyPrint();
        res.then().statusCode(201).body("titlePost", equalTo("minh post title"));
    }
}

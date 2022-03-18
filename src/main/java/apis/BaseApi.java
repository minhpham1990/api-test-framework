package apis;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;


public abstract class BaseApi {
    protected String BaseURI;
    protected RequestSpecBuilder requestSpecBuilder;
    protected RequestSpecification requestSpecification;
    protected Response apiResponse;
    protected int expectStatusCode;

    public BaseApi(String baseURI){
        this.BaseURI=baseURI;
        requestSpecBuilder = new RequestSpecBuilder();
    }

    protected Response getApiResponse(){
        return apiResponse;
    }
    public String getApiResponseAsString(){
        return apiResponse.asString();
    }

    public <T> T getApiResponseAsPOJO(Class<T> type){
        return apiResponse.getBody().as(type);
    }

    public int getExpectStatusCode() {
        return expectStatusCode;
    }

    public void setExpectStatusCode(int expectStatusCode) {
        this.expectStatusCode = expectStatusCode;
    }

    //    public static Response get(String path){
//        Response res = given()
//                .when()
//                .get(path);
//        RestAssured.filters(RequestLoggingFilter.with(LogDetail.URI));
//        return res;
//    }
//
//    public static Response post(String path, Object body, ContentType contentType){
//        Response res = given()
//                .contentType(contentType)
//                .when()
//                .body(body)
//                .post(path);
//        RestAssured.filters(RequestLoggingFilter.with(LogDetail.URI,LogDetail.BODY));
//        return res;
//    }
//
//    public static Response put(String path, Object body, ContentType contentType){
//        Response res = given()
//                .contentType(contentType)
//                .when()
//                .body(body)
//                .post(path);
//        RestAssured.filters(RequestLoggingFilter.with(LogDetail.URI,LogDetail.BODY));
//        return res;
//    }
//
//    public static Response delete(String path, Object body, ContentType contentType){
//        Response res = given()
//                .contentType(contentType)
//                .when()
//                .body(body)
//                .post(path);
//        RestAssured.filters(RequestLoggingFilter.with(LogDetail.URI,LogDetail.BODY));
//        return res;
//    }


}

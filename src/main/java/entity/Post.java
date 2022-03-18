package entity;

public class Post {
    private String titlePost;
    private String bodyPost;
    private int userId;

    public String getTitlePost() {
        return titlePost;
    }

    public void setTitlePost(String titlePost) {
        this.titlePost = titlePost;
    }

    public String getBodyPost() {
        return bodyPost;
    }

    public void setBodyPost(String bodyPost) {
        this.bodyPost = bodyPost;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

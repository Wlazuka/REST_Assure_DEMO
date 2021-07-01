package dummyApi.apiService;

import dummyApi.models.*;
import reqresApi.apiService.BaseEndpoint;

import java.util.Collections;
import java.util.List;

public class DummyApiEndpoint extends BaseEndpoint {

    private DummyApiEndpoint(){}

    public static final String BASE_URL = "https://dummyapi.io/data/api";
    public static final String userEndpoint = "/user";
    public static final String postEndpoint = "/post";
    public static final String tagEndpoint = "/tag";

    public static User getUserById(){
        return null;
    }

    public static List<User> getUsersList(){
        return Collections.emptyList();
    }

    public static Post getPostById(){
        return null;
    }

    public static List<Post> getPostsList(){
        return Collections.emptyList();
    }

    public static List<Post> getPostsListByUserId(){
        return Collections.emptyList();
    }

    public static List<Post> getPostsListByTagTitle(){
        return Collections.emptyList();
    }

    public static List<Comment> getPostComment(){
        return Collections.emptyList();
    }

    public static List<Tag> getTagList(){
        return Collections.emptyList();
    }

}

import db.models.Post;
import db.models.User;
import services.PostService;
import services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        User user = new User("Tested User");
        userService.saveUser(user);
        Post post = new Post("Hello World!");
        post.setUser(user);
        user.addPost(post);
        Post post1 = new Post("Second Time!");
        post1.setUser(user);
        user.addPost(post1);
        userService.updateUser(user);
    }
}
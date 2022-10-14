package db.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany
    private List<Post> posts;


    public User(){}
    public User(String name){
        this.name = name;
    }

    public void addPost(Post p){
        p.setUser(this);
        posts.add(p);
    }



}

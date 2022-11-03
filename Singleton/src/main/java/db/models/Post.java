package db.models;

import javax.persistence.*;

@Entity
@Table(name ="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "text")
    private String text;
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    public Post(){}
    public Post(String text){
        this.text = text;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

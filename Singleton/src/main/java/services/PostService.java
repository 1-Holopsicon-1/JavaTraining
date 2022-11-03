package services;

import db.dao.impl.PostDAOImpl;
import db.models.Post;

import java.util.List;
import java.util.Optional;

public class PostService {
    public Optional<Post> get(int id){
        return PostDAOImpl.getInstance().get(id);
    }

    public List<Post> getAll(){ return  PostDAOImpl.getInstance().getAll(); }
    public void savePost(Post u){
        PostDAOImpl.getInstance().save(u);
    }

    public void deletePost(Post u){
        PostDAOImpl.getInstance().delete(u);
    }

    public void updatePost(Post u){
        PostDAOImpl.getInstance().update(u);
    }
}

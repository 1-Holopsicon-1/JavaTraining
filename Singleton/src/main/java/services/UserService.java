package services;

import db.dao.impl.UserDAOImpl;
import db.models.User;

import java.util.List;
import java.util.Optional;

public class UserService {
    public Optional<User> get(int id){
        return UserDAOImpl.getInstance().get(id);
    }

    public List<User> getAll(){ return  UserDAOImpl.getInstance().getAll(); }
    public void saveUser(User u){
        UserDAOImpl.getInstance().save(u);
    }

    public void deleteUser(User u){
        UserDAOImpl.getInstance().delete(u);
    }

    public void updateUser(User u){
        UserDAOImpl.getInstance().update(u);
    }

}

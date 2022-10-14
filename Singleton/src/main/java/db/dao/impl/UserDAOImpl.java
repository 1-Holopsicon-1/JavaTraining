package db.dao.impl;

import db.Db;
import db.dao.DAO;
import db.models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.JpaCriteriaQuery;

import java.util.List;
import java.util.Optional;

public class UserDAOImpl implements DAO<User> {

    private static UserDAOImpl INSTANCE;

    private UserDAOImpl() {}

    public static UserDAOImpl getInstance(){
        if (INSTANCE == null){
            INSTANCE = new UserDAOImpl();
        }
        return INSTANCE;
    }

    @Override
    public Optional<User> get(long id) {
        return Optional.of(Db.getSf().openSession().get(User.class, id));
    }

    @Override
    public List<User> getAll() {

        Session session = Db
                .getSf()
                .openSession();

        JpaCriteriaQuery<User> query = session
                .getCriteriaBuilder()
                .createQuery(User.class);

        query.from(User.class);

        List<User> users = session
                .createQuery(query)
                .getResultList();

        session.close();
        return users;
    }

    @Override
    public void save(User u) {
        Session session = Db.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.persist(u);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(User u) {
        Session session = Db.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.remove(u);
        tx1.commit();
        session.close();
    }

    @Override
    @SuppressWarnings(value="deprecation") // CheatCode ))
    public void update(User u) {
        Session session = Db.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(u);
        tx1.commit();
        session.close();
    }
}

package db.dao.impl;

import db.Db;
import db.dao.DAO;
import db.models.Post;
import db.models.Post;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.JpaCriteriaQuery;

import java.util.List;
import java.util.Optional;

public class PostDAOImpl implements DAO<Post> {

    private static PostDAOImpl INSTANCE;

    private PostDAOImpl() {}

    public static PostDAOImpl getInstance(){
        if (INSTANCE == null){
            INSTANCE = new PostDAOImpl();
        }
        return INSTANCE;
    }

    @Override
    public Optional<Post> get(long id) {
        return Optional.of(Db.getSf().openSession().get(Post.class, id));
    }

    @Override
    public List<Post> getAll() {

        Session session = Db
                .getSf()
                .openSession();

        JpaCriteriaQuery<Post> query = session
                .getCriteriaBuilder()
                .createQuery(Post.class);

        query.from(Post.class);

        List<Post> Posts = session
                .createQuery(query)
                .getResultList();

        session.close();
        return Posts;
    }

    @Override
    public void save(Post u) {
        Session session = Db.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.persist(u);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Post u) {
        Session session = Db.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.remove(u);
        tx1.commit();
        session.close();
    }

    @Override
    @SuppressWarnings(value="deprecation")
    public void update(Post u) {
        Session session = Db.getSf().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(u);
        tx1.commit();
        session.close();
    }
}

package db;

import db.models.Post;
import db.models.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Db {
    private static SessionFactory sf;

    private Db(){}

    public static SessionFactory getSf(){
        if (sf == null){
            try {
                Configuration conf = new Configuration().configure();
                conf.addAnnotatedClass(User.class);
                conf.addAnnotatedClass(Post.class);
                StandardServiceRegistryBuilder builder =
                        new StandardServiceRegistryBuilder()
                                .applySettings(conf.getProperties());

                sf = conf.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Nope\n" + e);
            }
        }
        return sf;
    }

}

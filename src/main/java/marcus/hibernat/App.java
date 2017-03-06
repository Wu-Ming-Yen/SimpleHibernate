package marcus.hibernat;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setName("Marcus");
        user.setAge(25);

        session.save(user);
        session.getTransaction().commit();
    }
}

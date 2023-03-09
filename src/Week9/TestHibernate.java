package Week9;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;
public class TestHibernate {

    SessionFactory factory = null;
    Session session = null;

    private static TestHibernate single_instance = null;

    private TestHibernate()
    {
        factory = HibernateUtils.getSessionFactory();
    }

    public static TestHibernate getInstance()
    {
        if (single_instance == null) {
            single_instance = new TestHibernate();
        }
        return single_instance;
    }

    public List<Customer> getCustomers() {
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Week9.Customer";
            List<Customer> cs = (List<Customer>) session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return cs;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    public Customer getCustomer(int id) {
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from Week9.Customer where id=" + Integer.toString(id);
            Customer c = (Customer) session.createQuery(sql).uniqueResult();
            session.getTransaction().commit();
            return c;

        }catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return null;
        }finally {
            session.close();
        }
    }

    public void setCustomer(String name, String address, String phone) {

        Customer c = new Customer();
        c.setName(name);
        c.setAddress(address);
        c.setPhone(phone);

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            session.save(c);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }
    public void updateCustomer(int id, String name, String address, String phone) {

        Customer c = new Customer();
        c.setId(id);
        c.setName(name);
        c.setAddress(address);
        c.setPhone(phone);

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            session.save(c);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

}
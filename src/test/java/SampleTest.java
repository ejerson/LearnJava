import com.edgedevelop.hibernate.YearGoals;

import java.time.Year;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SampleTest {
    // Create an EntityManagerFactory when you start the application
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("YearlyGoals");

    public static void main(String[] args) {
        addCustomer("I really like candy", "I really like candy");
//        getCustomer(1);
//        getCustomers();
//        changeFName(4, "Mark");
//        deleteCustomer(3);
        ENTITY_MANAGER_FACTORY.close();
    }

    public static void addCustomer(String firstGoal, String secondGoal) {
        // The EntityManager class allows operations such as create, read, update, delete
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        // Used to issue transactions on the EntityManager
        EntityTransaction et = null;

        try {
            // Get transaction and start
            et = em.getTransaction();
            et.begin();

            // Create and set values for new customer
            YearGoals yearGoals = new YearGoals();
            yearGoals.setFirstGoal(firstGoal);
            yearGoals.setSecondGoal(secondGoal);

            // Save the customer object
            em.persist(yearGoals);
            et.commit();
        } catch (Exception ex) {
            // If there is an exception rollback changes
            if (et != null) {
                et.rollback();
            }
            ex.printStackTrace();
        } finally {
            // Close EntityManager
            em.close();
        }
    }

//    public static void getCustomer(int id) {
//        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
//
//        // the lowercase c refers to the object
//        // :custID is a parameterized query thats value is set below
//        String query = "SELECT c FROM YearGoals c WHERE c.id = :yearGoal:id";
//
//        // Issue the query and get a matching Customer
//        TypedQuery<YearGoals> tq = em.createQuery(query, YearGoals.class);
//        tq.setParameter("ID", id);
//
//        YearGoals goalsForTheYear = null;
//        try {
//            // Get matching customer object and output
//            goalsForTheYear = tq.getSingleResult();
//            System.out.println(goalsForTheYear.getFirstGoal() + " " + goalsForTheYear.getSecondGoal());
//        }
//        catch(NoResultException ex) {
//            ex.printStackTrace();
//        }
//        finally {
//            em.close();
//        }
//    }
//
//    public static void getCustomers() {
//        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
//
//        // the lowercase c refers to the object
//        // :custID is a parameterized query thats value is set below
//        String strQuery = "SELECT c FROM Customer c WHERE c.id IS NOT NULL";
//
//        // Issue the query and get a matching Customer
//        TypedQuery<Customer> tq = em.createQuery(strQuery, Customer.class);
//        List<Customer> custs;
//        try {
//            // Get matching customer object and output
//            custs = tq.getResultList();
//            custs.forEach(cust->System.out.println(cust.getFName() + " " + cust.getLName()));
//        }
//        catch(NoResultException ex) {
//            ex.printStackTrace();
//        }
//        finally {
//            em.close();
//        }
//    }
//
//    public static void changeFName(int id, String firstGoal) {
//        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
//        EntityTransaction et = null;
//
//        YearGoals cust = null;
//
//        try {
//            // Get transaction and start
//            et = em.getTransaction();
//            et.begin();
//
//            // Find customer and make changes
//            cust = em.find(YearGoals.class, id);
//            cust.setFirstGoal(firstGoal);
//
//            // Save the customer object
//            em.persist(cust);
//            et.commit();
//        } catch (Exception ex) {
//            // If there is an exception rollback changes
//            if (et != null) {
//                et.rollback();
//            }
//            ex.printStackTrace();
//        } finally {
//            // Close EntityManager
//            em.close();
//        }
//    }
//
//    public static void deleteCustomer(int id) {
//        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
//        EntityTransaction et = null;
//        YearGoals yearGoals = null;
//
//        try {
//            et = em.getTransaction();
//            et.begin();
//            yearGoals = em.find(YearGoals.class, id);
//            em.remove(yearGoals);
//            et.commit();
//        } catch (Exception ex) {
//            // If there is an exception rollback changes
//            if (et != null) {
//                et.rollback();
//            }
//            ex.printStackTrace();
//        } finally {
//            // Close EntityManager
//            em.close();
//        }
//    }
}

package com.edgedevelop;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SampleTest {
    // Create an EntityManagerFactory when you start the application
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("YearlyGoals");

    public static void main(String[] args) {


        addYearGoals("GoalOne", "GoalTwo", "GoalThree", "GoalFour", "GoalFive");
//        getCustomer(1)
//        getCustomers();
//        changeFName(4, "Mark");
//        deleteCustomer(3);
        ENTITY_MANAGER_FACTORY.close();
    }

    public static void addYearGoals(String firstGoal, String secondGoal, String thirdGoal, String fourthGoal, String fifthGoal) {
        // The EntityManager class allows operations such as create, read, update, delete
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        // Used to issue transactions on the EntityManager
        EntityTransaction et = null;

        try {

            // TODO create a singleton to prevent the creation of another yearly goal instance unless the year is different than the current one
            // TODO create thread pools (10) to use when querying the database
            // TODO put these methods inside the database package

            // Get transaction and start
            et = em.getTransaction();
            et.begin();

//            // Create and set values for new customer
//            YearGoalsEntity yearGoals = new YearGoalsEntity();
//            yearGoals.setFirstGoal(firstGoal);
//            yearGoals.setSecondGoal(secondGoal);
//            yearGoals.setThirdGoal(thirdGoal);
//            yearGoals.setFourthGoal(fourthGoal);
//            yearGoals.setFifthGoal(fifthGoal);

//            // Save the customer object
//            em.persist(yearGoals);
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

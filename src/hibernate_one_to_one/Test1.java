package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();
        try {
/*            Session session = factory.getCurrentSession();
            Employee employee = new Employee ("Graf Monte","Kristo","Shuris madiebeli",520202550);
            Detail detail = new Detail ("Berlin","+49176809090","Graf_Monte_Kristo@gmail.com");

            employee.setEmpDetail(detail);
            session.beginTransaction();

            session.save(employee);
            session.getTransaction().commit();
            System.out.println(" ##--  Done!!!   -## ");*/
            Session session = factory.getCurrentSession();

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 1);
            session.delete(emp);
            session.getTransaction().commit();
            System.out.println(" ##--  Done!!!   -## ");


        }
        finally {
            factory.close();
        }
    }

}

package hibernate_Test_2;


import hibernate_Test_2.entity.Detail;
import hibernate_Test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            Employee employee = new Employee("Mishi", "gamanadgurebeli", "IT", 150000);
            Detail detail = new Detail("Berlin", "+90055588888", "Mishi_gamanadgur@gmail.com");

            employee.setEmpDetail(detail);
            detail.setEmployee(employee);
            session.beginTransaction();

            session.save(detail);
            session.getTransaction().commit();
            System.out.println("    Done!!!!  ----- Done!!!!  -----    Done!!!!   ------   Done!!!!  -----  Done!!!!  ---- ");


        } finally {
            session.close();
            factory.close();
        }
    }

}

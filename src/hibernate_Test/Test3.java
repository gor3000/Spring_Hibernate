package hibernate_Test;

import hibernate_Test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).buildSessionFactory();
try {
        Session session = factory.getCurrentSession();

//   Employee emp = new Employee ("MIki","Rurk","IT-Prog",5000);

        session.beginTransaction();
//        session.save(emp);
    List<Employee> emps = session.createQuery( "from Employee"
             ) .getResultList();

    for (Employee e: emps)
        System.out.println(e);
        session.getTransaction().commit();

    System.out.println(" ##--  Done!!!   -## ");
//    System.out.println(emp1);
}
finally {
    factory.close();
}
    }

}

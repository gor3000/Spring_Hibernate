package hibernate_Test;

import hibernate_Test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).buildSessionFactory();
try {
      Session session = factory.getCurrentSession();
       session.beginTransaction();
// Employee emp=session.get(Employee.class,1);
// emp.setSalary(30000);
session.createQuery("update Employee  set salary=1000"+
        "where name='MIki' ").executeUpdate();



session.getTransaction().commit();
System.out.println(" ##--  Done!!!   -## ");
}
finally {
    factory.close();
}
    }

}

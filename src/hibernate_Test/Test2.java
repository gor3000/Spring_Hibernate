package hibernate_Test;

import hibernate_Test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).buildSessionFactory();
try {
        Session session = factory.getCurrentSession();
  Employee emp = new Employee ("Elena","Petrova","IT",1850);
    //     Employee emp = new Employee ("MIki","Rurk","IT-Prog",5000);

        session.beginTransaction();
       session.save(emp);
//         session.save(emp1);
//        session.getTransaction().commit();
//    int myId = emp1.getId();

    //   session = factory.getCurrentSession();
    // session.beginTransaction();
    Employee employee = session.get(Employee.class, 4);
    session.getTransaction().commit();

    System.out.println(employee);


    System.out.println(" ##--  Done!!!   -## ");

}
finally {
    factory.close();
}
    }

}

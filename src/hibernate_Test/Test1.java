package hibernate_Test;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import hibernate_Test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).buildSessionFactory();
try {
        Session session = factory.getCurrentSession();
  // Employee emp = new Employee ("Zviadi","Koluchev","IT",550);
  Employee emp = new Employee ("MIki","Rurk","IT-Prog",5000);

        session.beginTransaction();
//        session.save(emp);
         session.save(emp);
        session.getTransaction().commit();

    System.out.println(" ##--  Done!!!   -## ");
    System.out.println(emp);
}
finally {
    factory.close();
}
    }

}

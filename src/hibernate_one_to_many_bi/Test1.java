package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            Department dep = new Department("IT ", 300, 1200);
            Employee emp1 = new Employee("Molodi", "Smit", 700);
            Employee emp2 = new Employee("Givi", "tunus", 500);
            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);
            session.beginTransaction();
            session.save(dep);
            session.getTransaction().commit();

//           session = factory.getCurrentSession();
//
//            session.beginTransaction();
// Department department=session.get(Department.class,1);
//
//            Employee emp1 = new Employee( "Julia","mashinka",600);
//            Employee emp2 = new Employee( "Anna","Gorodenka",800);
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//
//             session.getTransaction().commit();


            System.out.println("    Done!!!!  ----- Done!!!!  -----    Done!!!!   ------   Done!!!!  -----  Done!!!!  ---- ");


        } finally {
            session.close();
            factory.close();
        }
    }

}

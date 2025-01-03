package hibernate_Test.entity;

import javax.persistence.*;

@Entity
 @Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String userame;
    @Column(name="department")
    private String department;
    @Column(name="salary")
    private int salary ;


    public Employee() {
    }

    public Employee(String name, String userame, String department, int salary) {
        this.name = name;
        this.userame = userame;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserame() {
        return userame;
    }

    public void setUserame(String userame) {
        this.userame = userame;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userame='" + userame + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

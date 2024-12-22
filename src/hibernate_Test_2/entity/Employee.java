package hibernate_Test_2.entity;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
 private int id;
    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String username;

    @Column(name="department")
    private String department;

    @Column(name="salary")
    private int salary;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="details_id")
    private Detail empDetail;


    public Employee() {
    }

    public Employee(String name, String username, String department, int salary) {
        this.name = name;
        this.username = username;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Detail getEmpDetail() {
        return empDetail;
    }

    public void setEmpDetail(Detail empDetail) {
        this.empDetail = empDetail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", department='" + department + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}

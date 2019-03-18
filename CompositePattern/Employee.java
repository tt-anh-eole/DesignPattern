import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        this.subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        this.subordinates.add(e);
    }

    public void remove(Employee e) {
        this.subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return this.subordinates;
    }

    public String toString() {
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary : " + salary + " ]");
    }
}

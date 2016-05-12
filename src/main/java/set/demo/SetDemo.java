package set.demo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Employee> smokersEmployees = new HashSet<>();

        final Employee e1 = new Employee("John Doe");
        final Employee e2 = new Employee("John Doe Jr.");
        smokersEmployees.add(e1);
        smokersEmployees.add(e2);
        smokersEmployees.stream().forEach(System.out::print);

        System.out.println();
        e2.setName("John Doe");
        smokersEmployees.stream().forEach(System.out::print);
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        return name != null ? name.equals(employee.name) : employee.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            '}';
    }
}

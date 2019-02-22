package design.pattern.visitor;

import java.util.List;

public class EmployeeList {

    private List<Employee> employees;
    
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
    
    public void accept(Department department) {
        for(Employee employee : employees) {
            employee.accept(department);
        }
    }
    
}

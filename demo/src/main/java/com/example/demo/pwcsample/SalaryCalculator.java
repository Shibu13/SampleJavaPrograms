package com.example.demo.pwcsample;


/*
 * Calculate Total Salary by Department
 * Filter employees by department name (case-insensitive).
 * Extract their salary.
 * Sum it using mapToDouble().sum().
 */
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int employeeId;
    private String employeeName;
    private String departmentName;
    private LocalDate joiningDate;
    private double salaryAmount;

    public Employee(int employeeId, String employeeName, String departmentName, LocalDate joiningDate, double salaryAmount) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.departmentName = departmentName;
        this.joiningDate = joiningDate;
        this.salaryAmount = salaryAmount;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    @Override
    public String toString() {
        return employeeId + " - " + employeeName + " - " + departmentName + " - " + salaryAmount;
    }
}

public class SalaryCalculator {

//    public static double getTotalSalaryByDepartment(List<Employee> employees, String departmentName) {
//        return employees.stream()
//                .filter(e -> e.getDepartmentName().equalsIgnoreCase(departmentName))
//                .mapToDouble(Employee::getSalaryAmount)
//                .sum();
//    }
	
	public static double getTotalSalaryByDepartment(List<Employee> employees, String departmentName) {
	    double total = 0.0;
	    for (Employee e : employees) {
	        if (e.getDepartmentName().equalsIgnoreCase(departmentName)) {
	            total += e.getSalaryAmount();
	        }
	    }
	    return total;
	}

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "Alice", "HR", LocalDate.of(2020, 1, 10), 50000),
                new Employee(102, "Bob", "IT", LocalDate.of(2019, 5, 15), 70000),
                new Employee(103, "Charlie", "HR", LocalDate.of(2021, 3, 22), 55000),
                new Employee(104, "David", "Finance", LocalDate.of(2018, 7, 30), 60000),
                new Employee(105, "Eva", "IT", LocalDate.of(2022, 8, 5), 72000)
        );

        String department = "IT";
        double totalSalary = getTotalSalaryByDepartment(employeeList, department);

        System.out.println("Total salary for department " + department + ": " + totalSalary);
    }
}

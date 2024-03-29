public class Employee {
    private int employeeID;
    private String name;
    private double salary;

    public Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "ID: " + employeeID + " Name: " + name + " Salary: " + salary;
    }

    public static double totalSalary(Employee[] employees) {
        double total = 0.0;
        for (Employee e : employees) {
            total += e.getSalary();
        }
        return total;
    }

}

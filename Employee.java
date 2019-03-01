package pkg120171248;

public class Employee {

    private String name;
    private String department;
    private double salary;
    private double bouns;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Employee(String name, String department, double salary, double bouns) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.bouns = bouns;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary * (bouns / 100);
    }

    public void setSalary(double salary, double bouns) {
        this.salary = salary * (bouns / 100);
    }

}

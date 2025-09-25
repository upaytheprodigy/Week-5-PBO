public class Employee extends Sortable {
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;

    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    public void print() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Hire Year: " + hireYear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int hireYear() {
        return hireyear;
    }
    
    public double getSalary() {
        return salary;
    }

    // Implementasi metode abstrak dari Sortable
    @Override
    public int compare(Sortable b) {
        Employee eb = (Employee) b; // Downcasting
        if (this.salary < eb.salary) return -1;
        if (this.salary > eb.salary) return 1;
        return 0;
    }
}
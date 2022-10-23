package lab8_1_exta_exercises.composition_example;

public class Employee {

    private String name;
    private double salary;
    private Address address;

    public Employee(String name, double salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public String getEmployeeInfo() {
        return name + " makes " + salary + " dollars"
                + " and lives at " + address.getAddressInfo();
    }

    public double getSalary() {
        return salary;
    }
}

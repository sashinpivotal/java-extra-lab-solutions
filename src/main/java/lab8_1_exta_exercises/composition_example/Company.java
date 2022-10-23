package lab8_1_exta_exercises.composition_example;

public class Company {

    private String companyName;
    private Employee[] employees = new Employee[100];
    private int currentIndex = 0;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void addEmployee(Employee employee) {
        employees[currentIndex++] = employee;
    }

    public double computeTotalSalaryOfAllEmployees() {
        double totalSalaryOfAllEmployees = 0.0;

        for (int i = 0; i < currentIndex; i++) {
            totalSalaryOfAllEmployees
                    += employees[i].getSalary();
        }
        return totalSalaryOfAllEmployees;
    }
}

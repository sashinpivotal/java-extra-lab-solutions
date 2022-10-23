package lab8_1_exta_exercises.composition_example;

public class CompanyClient {

    public static void main(String[] args) {
        Address address = new Address("Boston", "U.S.A.");
        Employee sang = new Employee("Sang", 1000.0, address);
        String employeeInfo1 = sang.getEmployeeInfo();

        Address seattle = new Address("Seattle", "U.S.A.");
        Employee david = new Employee("David", 2000.0, seattle);
        String employeeInfo2 = david.getEmployeeInfo();

        Company amazon = new Company("Amazon");
        amazon.addEmployee(sang);
        amazon.addEmployee(david);
        double totalSalaryOfAllEmployees
                = amazon.computeTotalSalaryOfAllEmployees();

        System.out.println("Total salary of all employees = "
                + totalSalaryOfAllEmployees);

    }
}

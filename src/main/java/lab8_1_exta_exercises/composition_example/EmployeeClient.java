package lab8_1_exta_exercises.composition_example;

public class EmployeeClient {

    public static void main(String[] args) {

        Address address = new Address("Boston", "U.S.A.");
        Employee sang = new Employee("Sang", 1000.0, address);
        String employeeInfo1 = sang.getEmployeeInfo();
        System.out.println(employeeInfo1);

        Address seattle = new Address("Seattle", "U.S.A.");
        Employee david = new Employee("David", 2000.0, seattle);
        String employeeInfo2 = david.getEmployeeInfo();
        System.out.println(employeeInfo2);

    }
}

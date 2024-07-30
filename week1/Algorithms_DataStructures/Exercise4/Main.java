package Exercise4;

public class Main {
        public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(3);

        Employee e1 = new Employee("E001", "Alice", "Manager", 50000);
        Employee e2 = new Employee("E002", "Bob", "Assistant Manager", 40000);
        Employee e3 = new Employee("E003", "Charlie", "Supervisor", 30000);
        Employee e4 = new Employee("E004", "David", "Supervisor", 30000);

        system.addEmployee(e1);
        system.addEmployee(e2);
        system.addEmployee(e3);
        system.addEmployee(e4);

        System.out.println(system.searchEmployee("E002"));
        System.out.println(system.searchEmployee("E004"));

        system.traverseEmployees();

        system.deleteEmployee("E002");
        system.deleteEmployee("E003");

        system.traverseEmployees();
    }
}

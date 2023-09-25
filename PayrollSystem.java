import java.util.*;

public class PayrollSystem {
    public static void main(String[] args) {
        System.out.println("___________________________________________");
        System.out.println("**\tWelcome to EMPLOYEE PAYROLL SYSTEM\t**");
        System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");

        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Menu : ");
            System.out.println("----");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Remove Employee by ID");
            System.out.println("4. Print List of Employees");
            System.out.println("5. Exit\t❌");
            System.out.println();
            System.out.println("_________________\t⤵️");
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Full-Time Employee Name: ");
                    String fullName = scanner.next();
                    System.out.print("Enter Full-Time Employee ID: ");
                    int fullTimeEmployeeId = scanner.nextInt();
                    System.out.print("Enter Full-Time Employee Monthly Salary: ");
                    double fullTimeMonthlySalary = scanner.nextDouble();
                    employees.add(new FullTimeEmployee(fullName, fullTimeEmployeeId, fullTimeMonthlySalary));
                    System.out.println("Full-Time Employee added.");
                    break;
                case 2:
                    System.out.print("Enter Part-Time Employee Name: ");
                    String partTimeName = scanner.next();
                    System.out.print("Enter Part-Time Employee ID: ");
                    int partTimeEmployeeId = scanner.nextInt();
                    System.out.print("Enter Part-Time Employee Total Working Hours: ");
                    int totalWorkingHours = scanner.nextInt();
                    System.out.print("Enter Part-Time Employee Hourly Rate: ");
                    double hourlyRate = scanner.nextDouble();
                    employees.add(new PartTimeEmployee(partTimeName, partTimeEmployeeId, totalWorkingHours, hourlyRate));
                    System.out.println("Part-Time Employee added.");
                    break;
                case 3:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeEmployeeId = scanner.nextInt();
                    employees.removeIf(employee -> employee.getEmployeeId() == removeEmployeeId);
                    System.out.println("Employee removed.");
                    break;
                case 4:
                    System.out.println("List of Employees:");
                    for (Employee employee : employees) {
                        System.out.println("Name: " + employee.getName());
                        System.out.println("ID: " + employee.getEmployeeId());
                        System.out.println("Monthly Salary: " + employee.calculateMonthlySalary());
                        System.out.println("--------------------------");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

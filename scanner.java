import java.util.Scanner;

public class EmployeeProcessor {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java EmployeeProcessor <Department> <Salary Increase %>");
            return;
        }

        String department = args[0];
        double incrementPercentage = Double.parseDouble(args[1]);

        Scanner scanner = new Scanner(System.in);

        // Read employee data
        System.out.print("Enter Full Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // clear newline

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        // Apply salary increment
        double newSalary = salary + (salary * incrementPercentage / 100);

        // Display output
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Original Salary: " + salary);
        System.out.println("Increased Salary: " + newSalary);

        scanner.close();
    }
}

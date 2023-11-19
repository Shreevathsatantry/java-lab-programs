import java.util.Scanner;

class Student {
    private String usn;
    private String name;
    private String branch;
    private String phone;

    // Constructor to initialize the Student object
    public Student(String usn, String name, String branch, String phone) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    // Getter methods to access the private instance variables
    public String getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getPhone() {
        return phone;
    }
}

public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Create an array to store n Student objects
        Student[] students = new Student[n];

        // Input information for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.println("USN: ");
            String usn = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Branch: ");
            String branch = scanner.next();
            System.out.print("Phone: ");
            String phone = scanner.next();

            // Create a new Student object and store it in the array
            students[i] = new Student(usn, name, branch, phone);
        }

        // Print information for each student
        System.out.println("\nStudent Details:");
        System.out.printf("%-10s %-20s %-15s %-15s\n", "USN", "Name", "Branch", "Phone");
        for (Student student : students) {
            System.out.printf("%-10s %-20s %-15s %-15s\n", student.getUsn(), student.getName(), student.getBranch(), student.getPhone());
        }

        // Close the scanner
        scanner.close();
    }
}

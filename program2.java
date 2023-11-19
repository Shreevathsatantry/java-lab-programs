
    
import java.util.Scanner;

class Staff {
    private int staffId;
    private String name;
    private String phone;
    private double salary;

    public Staff(int staffId, String name, String phone, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
    }
}

class Teaching extends Staff {
    private String domain;
    private String publications;

    public Teaching(int staffId, String name, String phone, double salary, String domain, String publications) {
        super(staffId, name, phone, salary);
        this.domain = domain;
        this.publications = publications;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Domain: " + domain);
        System.out.println("Publications: " + publications);
    }
}

class Technical extends Staff {
    private String skills;

    public Technical(int staffId, String name, String phone, double salary, String skills) {
        super(staffId, name, phone, salary);
        this.skills = skills;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Skills: " + skills);
    }
}

class Contract extends Staff {
    private int period;

    public Contract(int staffId, String name, String phone, double salary, int period) {
        super(staffId, name, phone, salary);
        this.period = period;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Contract Period: " + period + " months");
    }
}

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading and displaying details for Teaching staff
        System.out.println("Enter details for Teaching Staff:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for Teaching Staff #" + i);
            System.out.print("Staff ID: ");
            int staffId = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Phone: ");
            String phone = scanner.next();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Domain: ");
            String domain = scanner.next();
            System.out.print("Publications: ");
            String publications = scanner.next();

            Teaching teachingStaff = new Teaching(staffId, name, phone, salary, domain, publications);
            System.out.println("\nTeaching Staff Details:");
            teachingStaff.displayDetails();
            System.out.println("------------------------");
        }

        // Reading and displaying details for Technical staff
        System.out.println("\nEnter details for Technical Staff:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for Technical Staff #" + i);
            System.out.print("Staff ID: ");
            int staffId = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Phone: ");
            String phone = scanner.next();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Skills: ");
            String skills = scanner.next();

            Technical technicalStaff = new Technical(staffId, name, phone, salary, skills);
            System.out.println("\nTechnical Staff Details:");
            technicalStaff.displayDetails();
            System.out.println("------------------------");
        }

        // Reading and displaying details for Contract staff
        System.out.println("\nEnter details for Contract Staff:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for Contract Staff #" + i);
            System.out.print("Staff ID: ");
            int staffId = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Phone: ");
            String phone = scanner.next();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Contract Period (months): ");
            int period = scanner.nextInt();

            Contract contractStaff = new Contract(staffId, name, phone, salary, period);
            System.out.println("\nContract Staff Details:");
            contractStaff.displayDetails();
            System.out.println("------------------------");
        }

        // Close the scanner
        scanner.close();
    }
}


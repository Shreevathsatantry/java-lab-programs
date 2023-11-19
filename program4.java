import java.util.Scanner;

// Define the Resume interface
interface Resume {
    void biodata();
}

// Teacher class implementing the Resume interface
class Teacher implements Resume {
    private String personalInfo;
    private String qualification;
    private String experience;
    private String achievements;

    // Parameterized constructor to initialize the Teacher object
    public Teacher(String personalInfo, String qualification, String experience, String achievements) {
        this.personalInfo = personalInfo;
        this.qualification = qualification;
        this.experience = experience;
        this.achievements = achievements;
    }

    // Implement the biodata method from the Resume interface
    @Override
    public void biodata() {
        System.out.println("Teacher's Resume:");
        System.out.println("Personal Information: " + personalInfo);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience);
        System.out.println("Achievements: " + achievements);
        System.out.println();
    }
}

// Student class implementing the Resume interface
class Student implements Resume {
    private String personalInfo;
    private String result;
    private String discipline;

    // Parameterized constructor to initialize the Student object
    public Student(String personalInfo, String result, String discipline) {
        this.personalInfo = personalInfo;
        this.result = result;
        this.discipline = discipline;
    }

    // Implement the biodata method from the Resume interface
    @Override
    public void biodata() {
        System.out.println("Student's Resume:");
        System.out.println("Personal Information: " + personalInfo);
        System.out.println("Result: " + result);
        System.out.println("Discipline: " + discipline);
        System.out.println();
    }
}

// Main class to test the program
public class program4 {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for Teacher's resume
        System.out.println("Enter Teacher's Information:");
        System.out.print("Personal Information: ");
        String teacherPersonalInfo = scanner.nextLine();
        System.out.print("Qualification: ");
        String teacherQualification = scanner.nextLine();
        System.out.print("Experience: ");
        String teacherExperience = scanner.nextLine();
        System.out.print("Achievements: ");
        String teacherAchievements = scanner.nextLine();

        // Create Teacher object with user input
        Teacher teacher = new Teacher(teacherPersonalInfo, teacherQualification, teacherExperience, teacherAchievements);

        // Get user input for Student's resume
        System.out.println("\nEnter Student's Information:");
        System.out.print("Personal Information: ");
        String studentPersonalInfo = scanner.nextLine();
        System.out.print("Result: ");
        String studentResult = scanner.nextLine();
        System.out.print("Discipline: ");
        String studentDiscipline = scanner.nextLine();

        // Create Student object with user input
        Student student = new Student(studentPersonalInfo, studentResult, studentDiscipline);

        // Generate and display resumes
        teacher.biodata();
        student.biodata();

        // Close the scanner
        scanner.close();
    }
}

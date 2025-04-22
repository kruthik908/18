import java.util.Scanner;

class Student {

    String name;
    String id;
    String contactNumber;
    String email;

    public Student(String name, String id, String contactNumber, String email) {
        this.name = name;
        this.id = id;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Student ID: ");
        String id = scanner.nextLine();

        System.out.println("Enter Student Contact Number: ");
        String contactNumber = scanner.nextLine();

        System.out.println("Enter Student Email: ");
        String email = scanner.nextLine();
        Student student = new Student(name, id, contactNumber, email);

        System.out.println("\nStudent Details:");
        student.displayDetails();
        scanner.close();
    }
}

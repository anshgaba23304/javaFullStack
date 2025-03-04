package mypackage;
import java.util.*;

public class StudentMenu {
    private Scanner sc;
    private Student[] studentArr;
    private int numOfStudents;

    public StudentMenu() {
        sc = new Scanner(System.in);
        System.out.print("Enter number of students you want to have: ");
        numOfStudents = sc.nextInt();
        sc.nextLine();
        studentArr = new Student[numOfStudents];
    }

    public void insert() {
        for (int i = 0; i < numOfStudents; i++) {
            studentArr[i] = new Student();
            System.out.print("Enter student ID: ");
            studentArr[i].setStudentId(sc.nextInt());
            sc.nextLine();

            System.out.print("Enter student name: ");
            studentArr[i].setStudentName(sc.nextLine());

            System.out.print("Enter student score: ");
            studentArr[i].setScore(sc.nextInt());
            sc.nextLine();

            System.out.print("Enter student address: ");
            studentArr[i].setAddress(sc.nextLine());
        }
    }

    public void display() {
        for (Student student : studentArr) {
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Student Score: " + student.getScore());
            System.out.println("Student Address: " + student.getAddress());
        }
    }

    public void update() {
        System.out.print("Enter Student ID to update: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for (Student student : studentArr) {
            if (student.getStudentId() == studentId) {
                System.out.print("Enter new Score: ");
                student.setScore(sc.nextInt());
                sc.nextLine();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void delete() {
        System.out.print("Enter Student ID to delete: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i] != null && studentArr[i].getStudentId() == studentId) {
                studentArr[i] = null;
                found = true;
                System.out.println("Student deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insert();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        StudentMenu smenu = new StudentMenu();
        smenu.menu();
    }
}

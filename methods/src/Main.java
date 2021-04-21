import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student student1 = new Student();

        System.out.print("Enter your first name: ");
        String firstName = scan.nextLine();
        student1.setFirstName(firstName);

        System.out.print("Enter your last name: ");
        String lastName = scan.nextLine();
        student1.setLastName(lastName);

        student1.printFullName();
    }
}

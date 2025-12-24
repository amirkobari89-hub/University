import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        System.out.print("نام کامل: ");
        String fullName = scanner.nextLine();

        System.out.print("نام کاربری: ");
        String username = scanner.nextLine();

        System.out.print("رمز عبور: ");
        String password = scanner.nextLine();

        System.out.print("معدل: ");
        double gpa = scanner.nextDouble();

        System.out.print("سال ورود: ");
        int entryYear = scanner.nextInt();

        Student student = new Student(
                fullName,
                username,
                password,
                gpa,
                entryYear
        );

        users.add(student);

        System.out.println("دانشجو با موفقیت ثبت شد");
        System.out.println(student.getFullName() + " - " + student.getUsername());
    }
}

public class Student extends User {

    private double gpa;
    private int entryYear;

    public Student(String fullName,
                   String username,
                   String password,
                   double gpa,
                   int entryYear) {

        super(fullName, username, password);
        this.gpa = gpa;
        this.entryYear = entryYear;
    }

    public double getGpa() {
        return gpa;
    }

    public int getEntryYear() {
        return entryYear;
    }
}

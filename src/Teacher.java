public class Teacher extends User {

    private String teacherCode;
    private String specialization;

    public Teacher(String fullName, String username, String password, String teacherCode, String specialization) {

        super(fullName, username, password);
        this.teacherCode = teacherCode;
        this.specialization = specialization;

    }
}

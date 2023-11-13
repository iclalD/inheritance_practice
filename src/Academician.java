public class Academician extends Employee {
    private String department;
    private String title;

    public Academician(String fullName, String phone, String mail, String department, String title) {
        super(fullName, phone, mail);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void lectureTime(String fullName) {
        System.out.println(this.getFullName() + " has a class now.");
    }
}

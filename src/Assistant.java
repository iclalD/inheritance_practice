public class Assistant extends Academician {

    private String officeHours;

    public Assistant(String fullName, String phone, String mail, String department, String title, String officeHours) {
        super(fullName, phone, mail, department, title);
        this.officeHours = officeHours;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void quiz(String fullName) {
        System.out.println(this.getFullName() + " is making an unexpected quiz!");
    }
}

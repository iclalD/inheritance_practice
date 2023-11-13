public class LabAssistant extends Assistant {

    public LabAssistant(String fullName, String phone, String mail, String department, String title, String officeHours) {
        super(fullName, phone, mail, department, title, officeHours);
    }

    public void labTime(String fullName) {
        System.out.println("Lab time for the Lab Assistant, " + this.getFullName());
    }
}

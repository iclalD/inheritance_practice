public class Officer extends Employee {
    private String squad;
    private String workHours;

    public Officer(String fullName, String phone, String mail, String squad) {
        super(fullName, phone, mail);
        this.squad = squad;
        this.workHours = workHours;
    }

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public void work(String fullName) {
        System.out.println("Shift starts now for " + this.getFullName());
    }
}

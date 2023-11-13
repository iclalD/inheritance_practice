public class Lecturer extends Academician {
    private int doorNo;

    public Lecturer(String fullName, String phone, String mail, String department, String title, int doorNo) {
        super(fullName, phone, mail, department, title);
        this.doorNo = doorNo;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public void senateMeeting(String fullName) {
        System.out.println(this.getFullName() + " is being called for an urgent senate meeting in 5 minutes!");
    }

    public void exam(String fullName) {
        System.out.println(this.getFullName() + " is making an exam, warning for those who are taking this class.");
    }
}

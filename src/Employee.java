public class Employee {
    private String fullName;
    private String phone;
    private String mail;

    public Employee(String fullName, String phone, String mail) {
        this.fullName = fullName;
        this.phone = phone;
        this.mail = mail;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void enter() {
        System.out.println(this.getFullName() + " has entered the building.");
    }

    public void left() {
        System.out.println(this.getFullName() + " has left the building.");
    }

    public void cafeteria() {
        System.out.println(this.getFullName() + " has eaten sneaks.");
    }
}


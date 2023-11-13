public class IT extends Officer {
    private String position;

    public IT(String fullName, String phone, String mail, String squad, String position) {
        super(fullName, phone, mail, squad);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void networkSetup() {
        System.out.println("IT team is required for network setup duty.");
    }
}

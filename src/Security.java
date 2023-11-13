public class Security extends Officer {

    private String document;

    public Security(String fullName, String phone, String mail, String squad, String document) {
        super(fullName, phone, mail, squad);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void shift(String fullName) {
        System.out.println(this.getFullName() + "'s shift starts in 5.");
    }
}

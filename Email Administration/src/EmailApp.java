
public class EmailApp {
    public static void main(String[] args) throws Exception {
        Email email1 = new Email("Mohian", "Dipta");

        System.out.println("--------------------------------------------");
        email1.setAlternateEmail("js@gmail.com");
        System.out.println("Your new email is: " + email1.getAlternateEmail());
        email1.changePassword("157921157921mM");
        System.out.println("Your new password is: " + email1.getPassword());
        System.out.println("___________________________________________");
        System.out.println(email1.showInfo());
        System.out.println("___________________________________________");
    }
}

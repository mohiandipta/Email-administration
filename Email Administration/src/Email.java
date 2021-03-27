import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "gmail.com";

    // construstor
    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        // System.out.println("---------------------------------");
        // System.out.println("Email created for: " + firstName + " " + lastName + "
        // |");
        // System.out.println("---------------------------------");

        // call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // call a method that return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("--------------------------------------------");
        System.out.println("Your password is: " + this.password);

        // combine element to crate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
        System.out.println("--------------------------------------------");
    }

    // ask for the department
    private String setDepartment() {
        System.out.println(
                "Department Code: \n1 for Sales \n2 for Development \n3 for Account \n0 for None \nEnter department code:");

        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "account";
        } else {
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // set the mailBox capacity
    public void setMailboxcapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    // set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "Display Name: " + firstName + " " + lastName + "\n" + "Company Email: " + email + "\n"
                + "Mailbox Capacity: " + mailBoxCapacity + "mb";
    }
}

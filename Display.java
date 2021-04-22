package JAVA;

public class Display {
    private String firstName, lastName, password;

    public Display(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // call a method for password
        this.password = pass();
    }

    String pass ( ) {
        return  password = "2345HEllo";
    }
    String show () {
        return "Name : " + firstName + " " + lastName+ "\n" + "Password : " + password;
    }

}

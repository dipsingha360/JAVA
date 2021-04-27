package JAVA;

public class Display extends Person {
    private String password;


    public Display(String name) {
        this.name = name;

        // call a method for password
        this.password = pass();
        // this info extends from person class , name also
        this.dateOfBirth = "02 may 1999";
        this.profession = "Student";
        this.PhoneNumber = "+880 1720166868";
    }

    String pass ( ) {
        return  password = "2345HEllo";
    }

    String show () {
        return "Name : " + name + "\n" + "Password : " + password + "\nDate of Birth : " + dateOfBirth + "\nProfession : " + profession + "\nPhone : " + PhoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

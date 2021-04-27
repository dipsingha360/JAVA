package JAVA;

public class Index {
    public static void main(String[] args) {

        Display d1 = new Display("Dip Singha");
        System.out.println(d1.show());

        d1.setPassword("123456@Dip");
        System.out.printf("New Password is : %s",d1.getPassword());
    }

}

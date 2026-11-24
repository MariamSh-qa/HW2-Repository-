package Task2;

public class Main {

    public static void main(String[] args) {

        Admin admin1 = new Admin("Mariami", "Mariamsh");

        admin1.displayUserInfo();
        admin1.deleteUser("Niniko");
        admin1.deleteUser("");
    }
}
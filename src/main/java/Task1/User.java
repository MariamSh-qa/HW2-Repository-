package Task1;

public class User {

    private String username;
    private String password;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void validateUser() {
        if (username == null || username.isEmpty()) {
            System.out.println("User validation failed");
            return;
        }

        if (password == null || password.length() < 8) {
            System.out.println("User validation failed");
            return;
        }

        if (age < 18) {
            System.out.println("User validation failed");
            return;
        }

        System.out.println("User validation passed");
    }
}
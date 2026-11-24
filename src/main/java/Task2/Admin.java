package Task2;

public class Admin extends User{

    public Admin (String username, String email){
        this.username = username;
        this.email = email;

    }
    public void deleteUser(String username) {
        if (username == null || username.isEmpty()) {
            System.out.println("Invalid username");
            return;
        }

        System.out.println("User deleted:  " + username);

    }
}

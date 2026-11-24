package Task1;

public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        user1.setUsername("Mariami");
        user1.setPassword("Househouse");
        user1.setAge(18);
        user1.validateUser();

        User user2 = new User();
        user2.setUsername("Niniko");
        user2.setPassword("Book");
        user2.setAge(15);
        user2.validateUser();
    }
}




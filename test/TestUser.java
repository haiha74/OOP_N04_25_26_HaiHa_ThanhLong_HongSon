//packet test;

//import User;

public class TestUser {
    public static void test() {
        // Tao User
        User u1 = new User("haiha12345", "12345678");
        System.out.println(u1);

        // Thay doi thong tin
        u1.setUsername("haiha123");
        u1.setPassword("1234567");

        // In ra thong tin moi
        System.out.println("Username: " + u1.getUsername());
        System.out.println("Password: " + u1.getPassword());
    }
}
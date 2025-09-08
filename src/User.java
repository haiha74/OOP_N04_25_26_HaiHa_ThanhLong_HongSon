public class User {
    private String username; // Ten dang nhap
    private String password; // Mat khau

    // Ham khoi tao
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter/Setter cho usename
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter/Setter cho password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // In thoong tin
    @Override
    public String toString() {
        return "User{username='" + username + "', password='" + password + "'}";
    }

    public void forgotPasswordOrUsername(){

        
        //return new User();
    }
}
package Questions;
public class User {
    private String username;
    private String password;
    private String email;
    public User(String username, String password, String email) {
        this.username = username;
        setPassword(password);
        setEmail(email);      
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        if (username != null && !username.isEmpty()) {
            this.username = username;
        } else {
            System.out.println("Invalid username. It cannot be empty.");
        }
    }

    public String getPassword() {
        return "********";
    }
    public void setPassword(String password) {
        if (password != null && password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Invalid password. It must be at least 8 characters long.");
        }
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email address.");
        }
    }

    public void displayUserInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
       
    }

    public static void main(String[] args) {
      
        User user = new User("john_doe", "securePass123", "john.doe@example.com");
        user.displayUserInfo();
        user.setPassword("123");
        user.setEmail("john.doeexample.com"); 
    }
}

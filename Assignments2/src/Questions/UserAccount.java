package Questions;
public class UserAccount {
    private String username;
    private String password;
    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean authenticate(String inputUsername, String inputPassword) {
        Authenticator auth = new Authenticator();
        return auth.validate(inputUsername, inputPassword);
    }
    private class Authenticator {
        public boolean validate(String inputUsername, String inputPassword) {
            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        UserAccount user = new UserAccount("john_doe", "securePassword123");
        if (user.authenticate("john_doe", "securePassword123")) {
            System.out.println("Authentication successful.");
        } else {
            System.out.println("Authentication failed.");
        }
        if (user.authenticate("john_doe", "wrongPassword")) {
            System.out.println("Authentication successful.");
        } else {
            System.out.println("Authentication failed.");
        }
    }
}

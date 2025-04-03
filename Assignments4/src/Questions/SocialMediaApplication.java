package Questions;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

class User implements Comparable<User> {
    private final String userId;
    private final String userName;
    private final Set<User> following;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.following = new HashSet<>();
    }

    public String getUserId() { return userId; }
    public String getUserName() { return userName; }
    public boolean follow(User user) {
        if (user == null || this.equals(user)) {
            System.out.println("Cannot follow user.");
            return false;
        }
        return following.add(user);
    }

    public boolean unfollow(User user) {
        if (following.remove(user)) {
            System.out.println("Unfollowed " + user.getUserName());
            return true;
        } else {
            System.out.println(user.getUserName() + " is not in your following list.");
            return false;
        }
    }

    public void displayFollowing() {
        System.out.println(userName + " is following:");
        if (following.isEmpty()) {
            System.out.println("No users.");
        } else {
            for (User user : following) {
                System.out.println("- " + user.getUserName());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return userId.equals(user.userId);
    }

    @Override
    public int hashCode() {
        return userId.hashCode();
    }

    @Override
    public int compareTo(User other) {
        return this.userId.compareTo(other.userId);
    }
}

class SocialMediaPlatform {
    private final Set<User> users;

    public SocialMediaPlatform() {
        this.users = new TreeSet<>();
    }
    public boolean addUser(User user) {
        if (users.add(user)) {
            System.out.println("User " + user.getUserName() + " added.");
            return true;
        } else {
            System.out.println("User ID " + user.getUserId() + " already exists.");
            return false;
        }
    }
    public void displayUsers() {
        System.out.println("Users on the platform:");
        if (users.isEmpty()) {
            System.out.println("No users available.");
        } else {
            for (User user : users) {
                System.out.println("- " + user.getUserName() + " (ID: " + user.getUserId() + ")");
            }
        }
    }
}
public class SocialMediaApplication {
    public static void main(String[] args) {
       
        SocialMediaPlatform platform = new SocialMediaPlatform();
        User alice = new User("001", "Alice");
        User bob = new User("002", "Bob");
        User charlie = new User("003", "Charlie");
        platform.addUser(alice);
        platform.addUser(bob);
        platform.addUser(charlie);
        platform.displayUsers();
        System.out.println();
        alice.follow(bob);
        alice.follow(charlie);
        bob.follow(charlie);
        alice.displayFollowing();
        System.out.println();
        bob.displayFollowing();
        System.out.println();

        alice.unfollow(charlie);
        System.out.println();
        alice.displayFollowing();
    }
}

import java.util.HashMap;
import java.util.Map;
public class UserRepository {
    private Map<Integer, User> users = new HashMap<>(); 
    public void saveUser(User user) {
        if (getUserByUsername(user.getUsername()) != null) {
            System.out.println("Username already exists. Registration failed.");
            return;
        }
        users.put(user.getUserID(), user);
    }

    public User getUserById(int userID) {
        return users.get(userID);
    }
    public User getUserByUsername(String username) {
        for (User user : users.values()) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    public int getUserCount() {
    return users.size();
    }
    public void updateUser(User user) {
        users.put(user.getUserID(), user);
    }
    public void deleteUser(int userID) {
        users.remove(userID);
    }
}

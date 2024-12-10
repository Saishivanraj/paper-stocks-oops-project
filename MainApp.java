import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();        SwingUtilities.invokeLater(() -> new LoginFrame(userRepository));    }
}

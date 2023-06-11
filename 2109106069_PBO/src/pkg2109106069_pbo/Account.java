package pkg2109106069_pbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Account {

    final private String fullName;
    final private String username;
    final private String password;

    public Account(String fullName, String username, String password) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
    }

    public void createAccountDB() {
        try {
            Connection conn = Connect.getConnection();
            PreparedStatement stat = conn.prepareStatement("INSERT INTO tbuser (fullName, username, password) VALUES (?, ?, ?)");
            stat.setString(1, this.fullName);
            stat.setString(2, this.username);
            stat.setString(3, this.password);
            stat.executeUpdate();
            stat.close();
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean isValid(String username, String password) {
        boolean isValid = false;
        try {
            Connection conn = Connect.getConnection();
            PreparedStatement stat = conn.prepareStatement("SELECT * FROM tbuser WHERE username = ? AND password = ?");
            stat.setString(1, username);
            stat.setString(2, password);
            ResultSet resultSet = stat.executeQuery();
            if (resultSet.next()) {
                isValid = true;
            }
            stat.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isValid;
    }
    
        public static boolean isExists(String username) {
        boolean exists = false;
        try {
            Connection conn = Connect.getConnection();
            PreparedStatement stat = conn.prepareStatement("SELECT * FROM tbuser WHERE username = ?");
            stat.setString(1, username);
            ResultSet resultSet = stat.executeQuery();
            if (resultSet.next()) {
                exists = true;
            }
            stat.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exists;
    }
}

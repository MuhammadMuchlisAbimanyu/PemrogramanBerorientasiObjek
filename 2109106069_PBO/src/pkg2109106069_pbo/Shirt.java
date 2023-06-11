/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2109106069_pbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS-GK
 */
public class Shirt {

    private String id, name, type, merk, color, size, price;

    public Shirt(String id, String name, String type, String merk, String color, String size, String price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.merk = merk;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getMerk() {
        return merk;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void createDB() {
        Connection conn = null;
        PreparedStatement stat = null;
        String query = "INSERT INTO tbitems (name, type, merk, color, size, price) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            conn = Connect.getConnection();
            stat = conn.prepareStatement(query);
            stat.setString(1, name);
            stat.setString(2, type);
            stat.setString(3, merk);
            stat.setString(4, color);
            stat.setString(5, size);
            stat.setString(6, price);
            stat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stat != null) {
                    stat.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateDB() {
        Connection conn = null;
        PreparedStatement stat = null;
        String query = "UPDATE tbitems set name=?, type=?, merk=?, color=?, size=?, price=? WHERE id=?";
        try {
            conn = Connect.getConnection();
            stat = conn.prepareStatement(query);
            stat.setString(1, name);
            stat.setString(2, type);
            stat.setString(3, merk);
            stat.setString(4, color);
            stat.setString(5, size);
            stat.setString(6, price);
            stat.setString(7, id);
            stat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stat != null) {
                    stat.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteDB(String valueId) {
        Connection conn = null;
        PreparedStatement stat = null;
        String query = "DELETE FROM tbitems WHERE id=?";
        try {
            conn = Connect.getConnection();
            stat = conn.prepareStatement(query);
            stat.setString(1, valueId);
            stat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stat != null) {
                    stat.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

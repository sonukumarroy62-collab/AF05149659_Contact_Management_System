package com.app;

import java.sql.*;

public class ContactDAO {

    // Add Contact
    public void addContact(Contact c) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO contacts(name, phone, email) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, c.getName());
            ps.setString(2, c.getPhone());
            ps.setString(3, c.getEmail());

            ps.executeUpdate();
            System.out.println("✅ Contact Added!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // View Contacts
    public void viewContacts() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM contacts";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n--- Contact List ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("phone") + " | " +
                        rs.getString("email")
                );
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Delete Contact
    public void deleteContact(int id) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM contacts WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("✅ Contact Deleted!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Update Contact
    public void updateContact(int id, String phone) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "UPDATE contacts SET phone=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, phone);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("✅ Contact Updated!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
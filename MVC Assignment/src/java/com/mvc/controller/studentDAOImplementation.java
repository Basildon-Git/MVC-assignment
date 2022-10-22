package com.mvc.controller;

import com.mvc.db.DbConnection;
import com.mvc.model.student;
import java.sql.*;
import javax.swing.JOptionPane;

public class studentDAOImplementation implements studentDAO {

    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;

    @Override
    public void createStudent(student st) {
        try {
            con = DbConnection.sqlConnection();
            String query = "INSERT INTO `student`(`firstname`, `surname`, `program`, `dob`, `username`, `password`) VALUES(?,?,?,?,?,?)";
            pst = con.prepareStatement(query);

            pst.setString(1, st.getFirstName());
            pst.setString(2, st.getSurname());
            pst.setString(3, st.getProgram());
            pst.setString(4, st.getDateOfBirth());
            pst.setString(5, st.getUsername());
            pst.setString(6, st.getPassword());
            pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void updateStudent(student st) {
        try {
            con = DbConnection.sqlConnection();

            String query = "UPDATE `student` SET `firstname`=?,`surname`=?,`program`=?,`dob`=?,`password`=? WHERE `username` = ? ";
            pst = con.prepareStatement(query);

            pst.setString(1, st.getFirstName());
            pst.setString(2, st.getSurname());
            pst.setString(3, st.getProgram());
            pst.setString(4, st.getDateOfBirth());
            pst.setString(5, st.getPassword());
            pst.setString(6, st.getUsername());
            pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(String username) {
        try {
            con = DbConnection.sqlConnection();
            String query = "DELETE FROM `student` WHERE `username` = '" + username + "'";
            pst = con.prepareStatement(query);
            pst.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean isStudentExisting(String fname, String sname, String uname) {
        try {
            con = DbConnection.sqlConnection();
            String query = "SELECT * FROM `student` WHERE `firstname` = '" + fname + "' AND `surname`= '" + sname + "' AND `username`= '" + uname + "' ";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean loginStudent(String fname, String sname) {
        try {
            con = DbConnection.sqlConnection();

            String query = "SELECT * FROM `student` WHERE `username` = '" + fname + "' AND `password`= '" + sname + "' ";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public student getStudent(String uname) {
        student std = new student();

        try {
            con = DbConnection.sqlConnection();
            String query = "SELECT * FROM `student` WHERE `username` = '" + uname + "' ";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                std.setFirstName(rs.getString("firstname"));
                std.setSurname(rs.getString("surname"));
                std.setDateOfBirth(rs.getString("dob"));
                std.setProgram(rs.getString("program"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return std;

    }

}

package com.frontinterfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Menu  {
    private JButton addMemberButton;
    private JButton existingMemberButton;
    private JButton accountsButton;
    private JButton trainersAndEquipmentsButton;




    public Menu() {


        Connection conn = null;
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception ex) {
            // handle the error
        }
        try {
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","project2327");



        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




            }
        };
        addMemberButton.addActionListener(listener);
        existingMemberButton.addActionListener(listener);
        accountsButton.addActionListener(listener);
        trainersAndEquipmentsButton.addActionListener(listener);
    }
}

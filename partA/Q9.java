package com.company.partA;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Validate implements ActionListener {


    JLabel l2 = new JLabel("Username ");
    JLabel l3 = new JLabel("Password");

    JTextField t2 = new JTextField(10);
    JTextField t3 = new JTextField(10);

    JButton b1 = new JButton("Submit");

    Validate()
    {
        JFrame mainFrame = new JFrame("Validation");
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);

        mainFrame.add(l2);
        mainFrame.add(t2);

        mainFrame.add(l3);
        mainFrame.add(t3);

        mainFrame.add(b1);
        b1.addActionListener(this);

        mainFrame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String username = t2.getText();
        String password = t3.getText();

        if (e.getActionCommand().equals("Submit"))
        {
            if (username.equals("chinthan") && password.equals("chin"))
            {
                JOptionPane.showMessageDialog(null,"Welcome "+username);
            }
            else
                JOptionPane.showMessageDialog(null,"Invalid credentials");

        }

    }


}

public class Q9
{
    public static void main(String[] args)
    {
        Validate obj = new Validate();

    }
}

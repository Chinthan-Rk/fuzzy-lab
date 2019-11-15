package com.company.partB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class testm implements ActionListener
{

    JLabel l1 = new JLabel("Name");
    JLabel l2 = new JLabel("Phone Number");

    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);

    JRadioButton r1 = new JRadioButton("Male");
    JRadioButton r2 = new JRadioButton("Female");
    ButtonGroup bg = new ButtonGroup();

    JCheckBox c1 = new JCheckBox("Singing");
    JCheckBox c2 = new JCheckBox("Dancing");

    String cities[] = {"Udupi","manglore","Udupi","manglore","Udupi","manglore","Udupi","manglore","Udupi","manglore"};
    JList<String> cityList = new JList<String>(cities);

    JButton b1 = new JButton("Submit");





    testm()
    {
        JFrame mainFrame = new JFrame("Test");

        mainFrame.setLayout(new FlowLayout());
        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);



        mainFrame.add(l1);
        mainFrame.add(t1);
        mainFrame.add(l2);
        mainFrame.add(t2);

        bg.add(r1);
        bg.add(r2);
        mainFrame.add(r1);
        mainFrame.add(r2);
       JPanel pan = new JPanel(new BorderLayout());
       JScrollPane sp = new JScrollPane();
       sp.setViewportView(cityList);
        pan.add(sp);

        mainFrame.add(pan);

        mainFrame.add(c1);
        mainFrame.add(c2);
        mainFrame.add(b1);
        b1.addActionListener(this);

        mainFrame.setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e)
    {
        String name = t1.getText();
        String num = t2.getText();
        String city = cityList.getSelectedValue();
        String hobby=null;
        String gender = "Female";

        if(r1.isSelected())
            gender="Male";

        if(c1.isSelected())
        {
            hobby = "Singing ";
            if(c2.isSelected())
            {
                hobby+= "Dancing";
            }
        }

        else if(c2.isSelected())
            hobby = "Dancing";

        String print = "Name : "+name+" \nPhone Number : "+num+" City : "+city+"Gender : "+gender+" Hobby : "+hobby;

        JOptionPane.showMessageDialog(null,print);

    }
}

public class Q10
{
    public static void main(String[] args)
    {
        testm obj = new testm();
    }

}

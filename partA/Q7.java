package com.company.partA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class calculate implements ActionListener
{
    JLabel l1 = new JLabel("Number 1");
    JLabel l2 = new JLabel("Number 2");
    JLabel l3 = new JLabel("Number 3");

    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
    JTextField t3 = new JTextField(10);

    JButton b1 = new JButton("Sum");
    JButton b2 = new JButton("Average");
    JButton b3 = new JButton("Largest");

    calculate()
    {
        JFrame mainFram = new JFrame("Calculate");
        mainFram.setLayout(new FlowLayout());

        mainFram.setDefaultCloseOperation(mainFram.EXIT_ON_CLOSE);

        mainFram.add(l1);
        mainFram.add(t1);

        mainFram.add(l2);
        mainFram.add(t2);

        mainFram.add(l3);
        mainFram.add(t3);

        mainFram.add(b1);
        mainFram.add(b2);
        mainFram.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        mainFram.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        float num1 = Float.parseFloat(t1.getText());
        float num2 = Float.parseFloat(t2.getText());
        float num3 = Float.parseFloat(t3.getText());

        if(e.getActionCommand().equals("Sum"))
        {
            float sum = num1 + num2 + num3;
            JOptionPane.showMessageDialog(null,"Sum = "+sum);
        }
        else if(e.getActionCommand().equals("Average"))
        {
            float average = (num1 + num2 + num3)/3;
            JOptionPane.showMessageDialog(null,"Average = "+average);
        }
        else if(e.getActionCommand().equals("Largest"))
        {
            float largest = Math.max(Math.max(num1,num2),num3);
            JOptionPane.showMessageDialog(null,"Largest = "+largest);
        }
    }
}

public class Q7
{
    public static void main(String[] args)
    {
        calculate obj = new calculate();
    }

}

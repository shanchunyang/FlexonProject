package com.flexon.project;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.*;


public class App 
{
    private static int rand_num;
    private static ArrayList<String> roster_arraylist;

    public static void main( String[] args )
    {
        //String Array
        String[] roster = {"Abby Troung", "Ahmed Mujtaba", "Azeez Temitope Olanrewaju","Deep",
                "Diming chu", "Dongshuo Li", "Honorinicy", "Jason", "Junyu liu", "Kelly Liu",
                "Kinjan", "Kun Li", "Muhammed Umar", "Oaz", "PQ", "Prithviatani", "Richard", "Sahil Slngh Shandhu",
                "Samuel Yang", "Scott Jhou", "Shahbaz Mansahia", "Shahriar Kabir", "Shakur", "Shrina Patel", "Siyu Qiu",
                "Siyu Lei", "Sumid", "Tao", "Trivediakshay", "Yan Huang", "Zhaosaitong"};

        List<String> roster_list = Arrays.asList(roster);
        //ArrayList<String> roster_arraylist = new ArrayList<String>(roster_list);
        roster_arraylist = new ArrayList<String>(roster_list);

        final Random rand = new Random();

        //Buttons
        final JFrame f = new JFrame("Random Name Project");
        final JTextField tf = new JTextField();
        tf.setBounds(50, 50, 200, 20);
        JButton b = new JButton("Pick Random Student");
        b.setBounds(50, 100, 200, 30);
        //Exit
        JButton exit_b = new JButton("Exit");
        exit_b.setBounds(50, 150, 100, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (roster_arraylist.size() >= 1) {
                    rand_num = rand.nextInt(roster_arraylist.size());
                    tf.setText(roster_arraylist.get(rand_num));
                    roster_arraylist.remove(rand_num);
                }
                else{
                    tf.setText("Name list is empty now.");
                }
            }
        });

        exit_b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        f.add(b);
        f.add(tf);
        f.add(exit_b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

}

package GUI_Implementation;

import Console_Implementation.Doctor;
import Console_Implementation.WestminsterSkinConsultationManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class FrontPage extends JFrame{

    public static FrontPage mInstance;
    private JFrame frame;
    private JLabel title;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;

    public FrontPage(){

        JFrame frame = new JFrame("Skin Care Application");
        frame.setSize(900, 750);
        Container container = frame.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.black);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //image
        ImageIcon imageIcon=new ImageIcon("E:\\IIT\\Lectures\\2 Year\\1 SEM\\OOP\\CW\\w1870512_Chanuga Jayarathne\\Project\\src\\Images\\Front_Page.jpg");
        JLabel Image=new JLabel(imageIcon);
        Image.setBounds(70,85,750,450);
        frame.add(Image);

        title = new JLabel("Westminster Skin Consultation Center");
        title.setFont(new Font("Times New Roman", Font.BOLD, 35));
        title.setForeground(Color.white);
        title.setBounds(165, 40, 600, 30);
        container.add(title);

        btn1 = new JButton("View Doctors");
        btn1.setBounds(60, 550, 230, 80);
        btn1.setBackground(Color.darkGray);
        btn1.setOpaque(true);
        btn1.setBorderPainted(true);
        btn1.setForeground(Color.white);
        btn1.setFont(new Font("Arial", Font.BOLD, 15));
        container.add(btn1);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                WestminsterSkinConsultationManager test1 = null;
                try {
                    test1 = new WestminsterSkinConsultationManager();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                ArrayList<Doctor> doctors = test1.getDoctors();
                DoctorTable table = new DoctorTable(doctors);
                table.setVisible(true);
            }
        });

        btn2 = new JButton("Add Consultation");
        btn2.setBounds(330, 550, 230, 80);
        btn2.setBackground(Color.darkGray);
        btn2.setOpaque(true);
        btn2.setBorderPainted(true);
        btn2.setForeground(Color.white);
        btn2.setFont(new Font("Arial", Font.BOLD, 15));
        container.add(btn2);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AddPatient();
                frame.dispose();
            }
        });

        btn3 = new JButton("View Consultation");
        btn3.setBounds(600, 550, 230, 80);
        btn3.setBackground(Color.darkGray);
        btn3.setOpaque(true);
        btn3.setBorderPainted(true);
        btn3.setForeground(Color.white);
        btn3.setFont(new Font("Arial", Font.BOLD, 15));
        container.add(btn3);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        frame.setVisible(true);
    }
}

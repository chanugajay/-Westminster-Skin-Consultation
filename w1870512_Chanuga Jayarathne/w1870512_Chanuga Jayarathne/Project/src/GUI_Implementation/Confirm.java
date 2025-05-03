package GUI_Implementation;

import Console_Implementation.Consultation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Confirm extends JFrame {
    JFrame frame =new JFrame();
    JLabel mainTitle=new JLabel("You're Booked!");
    JLabel cTitle = new JLabel("Booking Details");
    JLabel bDName = new JLabel();
    JLabel bDate = new JLabel();
    JLabel bTime = new JLabel();
    JLabel bCost = new JLabel();
    JButton doneButton=new JButton("Done");

    public Confirm (Consultation consultation){

        frame.setTitle("Westminster Skin Consultation Manager");
        frame.setSize(900,800);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setBackground(Color.white);
        frame.setResizable(false);//cant resize
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //close the code when it close

        mainTitle.setSize(800,120);
        mainTitle.setLocation(250,40);
        mainTitle.setFont(new Font("Times New Roman",Font.BOLD,45));
        frame.add(mainTitle);


        cTitle.setSize(800, 120);
        cTitle.setLocation(150, 150);
        cTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
        frame.add(cTitle);

        bDName.setSize(800, 120);
        bDName.setLocation(250, 250);
        bDName.setFont(new Font("Times New Roman", Font.BOLD, 25));
        bDName.setText("Doctor's Name : Dr."+consultation.getDoctor().getName()+" "+consultation.getDoctor().getSurname());
        frame.add(bDName);

        bDate.setSize(800, 120);
        bDate.setLocation(250, 320);
        bDate.setFont(new Font("Times New Roman", Font.BOLD, 25));
        bDate.setText("Appointment Date : "+consultation.getDate());
        frame.add(bDate);

        bTime.setSize(800, 120);
        bTime.setLocation(250, 390);
        bTime.setFont(new Font("Times New Roman", Font.BOLD, 25));
        bTime.setText("Appointment Time : "+consultation.getTimeSlot());
        frame.add(bTime);

        bCost.setSize(800, 120);
        bCost.setLocation(250, 460);
        bCost.setFont(new Font("Times New Roman", Font.BOLD, 25));
        bCost.setText("Total Cost : £"+consultation.getCost());
        frame.add(bCost);

        doneButton.setSize(200,60);
        doneButton.setLocation(350,650);
        doneButton.setFont(new Font("Times New Roman",Font.BOLD,25));
        doneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new FrontPage();
            }
        });
        frame.add(doneButton);
    }

}
package GUI_Implementation;

import Console_Implementation.Consultation;
import Console_Implementation.Doctor;
import Console_Implementation.WestminsterSkinConsultationManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddPatient extends JFrame {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JLabel mainTitle = new JLabel("Patient Registration & Add a Consultation Form");
    JLabel subTitle1 = new JLabel("Patient Details");
    JLabel patientFName = new JLabel("First Name        :");
    JTextField tFPatientFName = new JTextField();
    JLabel patientSurname = new JLabel("Surname           :");
    JTextField tFPatientSurname = new JTextField();
    JLabel dateOfBirth = new JLabel("Date Of Birth     :");
    JTextField tFDateOfBirth = new JTextField();
    JLabel mobileNumber = new JLabel("Mobile Number :");
    JTextField tFMobileNumber = new JTextField();
    JLabel patientId = new JLabel("Patient ID          :");
    JTextField tFPatientId = new JTextField();
    JLabel subTitle2 = new JLabel("Book a Consultation");
    JLabel doctorId = new JLabel("Enter a doctor ID :");
    JTextField tFDoctorId = new JTextField();
    JLabel consultationDate = new JLabel("Enter a date        :");
    JTextField tFConsultationDate = new JTextField();
    JLabel consultationTime = new JLabel("Enter a time        :");
    JTextField tFConsultationTime = new JTextField();
    JLabel consultationHours = new JLabel("Enter Hours         :");
    JTextField tFConsultationHours = new JTextField();
    JLabel label1 = new JLabel("Check Availability");
    JLabel doctorNameAv = new JLabel("Doctor Name    :");
    JLabel availableStatus = new JLabel("Available     :");
    JLabel allocateStatus = new JLabel("Allocated     :");
    JButton next = new JButton("Next");
    JButton back1 = new JButton("Back");
    Doctor finalDoctor;

    public AddPatient(){

        frame.setTitle("Westminster Skin Consultation");
        frame.setSize(900, 750);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel.setSize(900, 750);
        panel.setLayout(null);
        frame.add(panel);

        panel1.setSize(900, 750);
        panel1.setLayout(null);
        frame.add(panel1);

        mainTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
        mainTitle.setBounds(120, 20, 700, 60);
        panel.add(mainTitle);

        subTitle1.setFont(new Font("Arial", Font.BOLD, 20));
        subTitle1.setBounds(370, 110, 250, 20);
        panel.add(subTitle1);

        patientFName.setFont(new Font("Arial", Font.PLAIN, 20));
        patientFName.setBounds(250, 150, 250, 20);
        panel.add(patientFName);

        tFPatientFName.setFont(new Font("Arial", Font.PLAIN, 18));
        tFPatientFName.setBounds(430, 150, 190, 22);
        panel.add(tFPatientFName);

        patientSurname.setFont(new Font("Arial", Font.PLAIN, 20));
        patientSurname.setBounds(250, 200, 250, 20);
        panel.add(patientSurname);

        tFPatientSurname.setFont(new Font("Arial", Font.PLAIN, 18));
        tFPatientSurname.setBounds(430, 200, 190, 22);
        panel.add(tFPatientSurname);

        dateOfBirth.setFont(new Font("Arial", Font.PLAIN, 20));
        dateOfBirth.setBounds(250, 250, 250, 20);
        panel.add(dateOfBirth);

        tFDateOfBirth.setFont(new Font("Arial", Font.PLAIN, 18));
        tFDateOfBirth.setBounds(430, 250, 190, 22);
        tFDateOfBirth.setText("31/01/2000");
        panel.add(tFDateOfBirth);

        mobileNumber.setFont(new Font("Arial", Font.PLAIN, 20));
        mobileNumber.setBounds(250, 300, 250, 20);
        panel.add(mobileNumber);

        tFMobileNumber.setFont(new Font("Arial", Font.PLAIN, 18));
        tFMobileNumber.setBounds(430, 300, 190, 22);
        panel.add(tFMobileNumber);

        patientId.setFont(new Font("Arial", Font.PLAIN, 20));
        patientId.setBounds(250, 350, 250, 20);
        panel.add(patientId);

        tFPatientId.setFont(new Font("Arial", Font.PLAIN, 18));
        tFPatientId.setBounds(430, 350, 190, 22);
        panel.add(tFPatientId);

        subTitle2.setFont(new Font("Arial", Font.BOLD, 20));
        subTitle2.setBounds(350, 400, 250, 20);
        panel.add(subTitle2);

        doctorId.setFont(new Font("Arial", Font.PLAIN, 20));
        doctorId.setBounds(250, 450, 250, 20);
        panel.add(doctorId);

        tFDoctorId.setFont(new Font("Arial", Font.PLAIN, 18));
        tFDoctorId.setBounds(430, 450, 190, 22);
        panel.add(tFDoctorId);

        consultationDate.setFont(new Font("Arial", Font.PLAIN, 20));
        consultationDate.setBounds(250, 500, 250, 20);
        panel.add(consultationDate);

        tFConsultationDate.setFont(new Font("Arial", Font.PLAIN, 18));
        tFConsultationDate.setBounds(430, 500, 190, 22);
        tFConsultationDate.setText("31/01/2000");
        panel.add(tFConsultationDate);

        consultationTime.setFont(new Font("Arial", Font.PLAIN, 20));
        consultationTime.setBounds(250, 550, 250, 20);
        panel.add(consultationTime);

        tFConsultationTime.setFont(new Font("Arial", Font.PLAIN, 18));
        tFConsultationTime.setBounds(430, 550, 190, 22);
        tFConsultationTime.setText("01:59");
        panel.add(tFConsultationTime);

        consultationHours.setFont(new Font("Arial", Font.PLAIN, 20));
        consultationHours.setBounds(250, 600, 250, 20);
        panel.add(consultationHours);

        tFConsultationHours.setFont(new Font("Arial", Font.PLAIN, 18));
        tFConsultationHours.setBounds(430, 600, 190, 22);
        panel.add(tFConsultationHours);

        back1.setFont(new Font("Arial", Font.BOLD, 15));
        back1.setBounds(600, 660, 100, 25);
        panel.add(back1);
        back1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                new FrontPage();
            }
        });

        next.setFont(new Font("Arial", Font.BOLD, 15));
        next.setBounds(700, 650, 100, 25);
        panel.add(next);
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                IDValidate();

                if (IDValidate()) {
                    Doctor current_doctor = docFindCurrnt();

                    boolean check_flag_currentDoctor = false;

                    for (Consultation consultation : WestminsterSkinConsultationManager.returnConsultationArrayList()) {
                        if ((current_doctor.getMedicalLicenceNumber().equals(consultation.getDoctors().getMedicalLicenceNumber())) && (tFConsultationTime.getText().equals(consultation.getTimeSlot())) && (tFConsultationDate.getText().equals(consultation.getDate()))) {
                            check_flag_currentDoctor = true;
                            break;
                        }
                    }

                    System.out.println(check_flag_currentDoctor);
                    if (check_flag_currentDoctor) {
                        //current doctor booked
                        Random randomDr = new Random();
                        boolean nextDrCheck;
                        int docIndex;

                        while (true) {
                            nextDrCheck = false;
                            docIndex = randomDr.nextInt(0, WestminsterSkinConsultationManager.doctors.size());

                            if (!(current_doctor == WestminsterSkinConsultationManager.doctors.get(docIndex))) { //to check other dr s availability
                                for (Consultation consultation : WestminsterSkinConsultationManager.returnConsultationArrayList()) {
                                    if (WestminsterSkinConsultationManager.doctors.get(docIndex).getMedicalLicenceNumber().equals(consultation.getDoctors().getMedicalLicenceNumber())
                                            && (tFConsultationTime.getText().equals(consultation.getDate())) && ((tFConsultationTime.getText().equals(consultation.getTimeSlot())))) {
                                        nextDrCheck = true;
                                        break;
                                    }
                                }
                            } else {
                                nextDrCheck = true;
                            }

                            if (!nextDrCheck) {
                                break;
                            }
                        }
                        finalDoctor = WestminsterSkinConsultationManager.doctors.get(docIndex);
                        doctorNameAv.setText("Dr." + current_doctor.getName() + " " + current_doctor.getSurname());
                        doctorNameAv.setVisible(true);
                        availableStatus.setText("is not available at the time of your booking.");
                        availableStatus.setVisible(true);
                        allocateStatus.setText("Your allocated to" + " " + "Dr." + docFindCurrnt().getName() + " " + docFindCurrnt().getSurname() + ".");
                        allocateStatus.setVisible(true);

                    } else {
                        finalDoctor = current_doctor;
                        doctorNameAv.setText("Dr." + docFindCurrnt().getName() + " " + docFindCurrnt().getSurname());
                        doctorNameAv.setVisible(true);
                        availableStatus.setText("is available at the time of your booking");
                        availableStatus.setVisible(true);
                        allocateStatus.setVisible(false);
                    }
                }
                    panel.setVisible(false);
                    panel1.setVisible(true);
            }
        });
        setVisible(true);

        label1.setFont(new Font("Arial", Font.BOLD, 30));
        label1.setBounds(320, 120, 500, 35);
        panel1.add(label1);

        doctorNameAv.setFont(new Font("Arial", Font.PLAIN, 20));
        doctorNameAv.setBounds(150, 250, 500, 20);
        panel1.add(doctorNameAv);

        availableStatus.setFont(new Font("Arial", Font.PLAIN, 20));
        availableStatus.setBounds(150, 300, 500, 20);
        panel1.add(availableStatus);

        allocateStatus.setFont(new Font("Arial", Font.PLAIN, 20));
        allocateStatus.setBounds(150, 350, 500, 20);
        panel1.add(allocateStatus);

        back1.setFont(new Font("Arial", Font.BOLD, 15));
        back1.setBounds(550, 650, 100, 25);
        panel1.add(back1);
        back1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                panel.setVisible(true);
            }
        });
        setVisible(true);

    }

    private boolean IDValidate() {
        if ((tFDoctorId.getText().length() == 0)) {
            return false;
        } else {
            boolean checkForFalse = false;
            for (Doctor doctor : WestminsterSkinConsultationManager.doctors) {
                if (doctor.getMedicalLicenceNumber().equals(tFDoctorId.getText())) {
                    checkForFalse = true;
                    break;
                }
            }
            if (checkForFalse) {
                return true;
            } else {
                return false;
            }
        }
    }

    private Doctor docFindCurrnt() {
        Doctor doc=null;

        for (Doctor doctor:WestminsterSkinConsultationManager.doctors){
            if (tFDoctorId.getText().equals(doctor.getMedicalLicenceNumber())){
                doc=doctor;
                break;
            }
        }
        return doc;
    }
}

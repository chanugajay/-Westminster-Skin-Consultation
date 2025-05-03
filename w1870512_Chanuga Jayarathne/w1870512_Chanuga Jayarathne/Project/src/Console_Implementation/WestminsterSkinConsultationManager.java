package Console_Implementation;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class WestminsterSkinConsultationManager implements SkinConsultationManager{
    private static final int maxDoctors = 10;
    public static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    private final Scanner scanner = new Scanner(System.in);
    private int day;
    private int month;
    private int year;

    private static ArrayList<Consultation> consultations = new ArrayList<>();

    public static ArrayList<Consultation> returnConsultationArrayList() {
        return consultations;
    }

    public static File doc_file = new File("storingData.txt");
    public static File con_file = new File("consult.txt");

    public WestminsterSkinConsultationManager() throws IOException{

        doctors = loadDataFromfile(doctors, doc_file, "Doctor");
        consultations = loadDataFromfile(consultations,con_file,"Consultation");
        System.out.println(consultations.size());
        for (Object consultation: consultations){
            System.out.println(consultation);
        }
    }

    public void addDoctor(){
        if (doctors.size() < maxDoctors) {

            System.out.print("\nEnter doctor's name: ");
            String name = scanner.next();

            System.out.print("Enter doctor's surname: ");
            String surname = scanner.next();

            System.out.print("Enter your date of birth\n");

            while (true) {
                System.out.print("\tDate: ");
                int day = scanner.nextInt();
                if ((day > 0) && (day < 32)) {
                    this.day = day;
                    break;
                } else {
                    System.out.println("Not correct range");
                }
            }

            while (true) {
                System.out.print("\tMonth: ");
                int month = scanner.nextInt();
                if ((month > 0) && (month < 13)) {
                    this.month = month;
                    break;
                } else {
                    System.out.println("Not correct range");
                }
            }

            while (true) {
                System.out.print("\tYear: ");
                int year = scanner.nextInt();
                if ((year > 1939) && (year < 2099)) {
                    this.year = year;
                    break;
                } else {
                    System.out.println("Not correct range");
                }
            }

            Date dateOfBirth = new Date(day, month, year);

            String mobileNumber;
            while (true) {
                System.out.print("Enter doctor's mobile number: ");
                mobileNumber = scanner.next();
                String maxNumbers = "^\\d{10}$";    // https://www.geeksforgeeks.org/java-program-to-check-for-a-valid-mobile-number/
                boolean result = mobileNumber.matches(maxNumbers);
                if (result) {
                    System.out.println("Valid mobile number.");
                    break;
                } else {
                    System.out.println("Invalid mobile number. Please enter 10 digits and try again.");
                }
            }

            System.out.print("Enter doctor's medical licence number: ");
            String medicalLicenceNumber = scanner.next();

            System.out.print("Enter doctor's specialisation: ");
            String specialisation = scanner.next();

            Doctor doctor = new Doctor(name, surname, dateOfBirth, mobileNumber, medicalLicenceNumber, specialisation);
            doctors.add(doctor);

            System.out.println("Doctor added successfully.");
        } else {
            System.out.println("Cannot add more doctors. Maximum limit reached.\n");
        }
    }

    public void deleteDoctor() {
        System.out.print("\nEnter doctor's medical licence number to remove from the system: ");
        String medicalLicenceNumber = scanner.next();

        Doctor doctor = null;
        for(Doctor d : doctors){
            if(d.getMedicalLicenceNumber().equals(medicalLicenceNumber)){
                doctor = d;
                break;
            }
        }
        if(doctor == null){
            System.out.println("No doctor was found with the specified medical license number. Please try again...\n");
        }else{
            doctors.remove(doctor);
            System.out.println("The medical license number: " + doctor.getMedicalLicenceNumber() + " named doctor: " + doctor.getName() + " " +
                    doctor.getSurname() + " has been removed.");
            System.out.println("Now the centre has " + doctors.size() + " doctors.\n");
        }
    }

    public void printDoctors(){
        doctors.sort(new Comparator<Doctor>() {
            @Override
            public int compare(Doctor d1, Doctor d2) {
                return d1.getSurname().compareTo(d2.getSurname());

            }
        });

        // Print the information for each doctor
        if(doctors.size() == 0){
            System.out.println("Centre has no available doctors now.\n");
        }else {
            for (Doctor doctor : doctors) {
                System.out.println("Doctor's full name: " + doctor.getName() + " " + doctor.getSurname());
                System.out.println("Date of birth: " + doctor.getDateOfBirth());
                System.out.println("Mobile number: " + doctor.getMobileNumber());
                System.out.println("Medical license number: " + doctor.getMedicalLicenceNumber());
                System.out.println("Specialization: " + doctor.getSpecialisation());
                System.out.println(); // Extra line
            }
        }
    }

    public void saveFile() throws  IOException{
        String storeName = " ";
        ObjectOutputStream oos = null;
        File fileLoad = null;
        ArrayList listing = null;
        if (storeName.equals("Doctor")) {
            fileLoad = doc_file;
            listing = (ArrayList) getDoctors();
        }
        else {
            fileLoad=con_file;
            listing= consultations;
        }
        try {
            oos = new ObjectOutputStream(new FileOutputStream(fileLoad));
            oos.writeObject(listing);
            System.out.println("Data stored Successfully" + storeName);
        } catch (Exception e) {
            System.out.println(storeName);
        } finally {
            oos.close();
        }
    }

    public static <T> ArrayList<T> loadDataFromfile(ArrayList<T> listName,File filename,String storename) throws IOException {
        ObjectInputStream ois=null;
        Boolean checker=false;

        try {
            if (filename.isFile()){
                if ((filename).length()==0) {
                    System.out.println("store: "+storename);
                }else {
                    ois=new ObjectInputStream(new FileInputStream(filename));
                    listName= (ArrayList<T>) ois.readObject();
                    checker=true;
                }
            }else {
                System.out.println("no"+storename);
            }
        }catch (Exception e){
            System.out.println("Error"+storename);
        }finally {
            if (checker){
                ois.close();
            }
        }
        return listName;
    }

    @Override
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
}

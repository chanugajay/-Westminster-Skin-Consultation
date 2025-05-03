package GUI_Implementation;

import Console_Implementation.Doctor;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class DoctorTableModel extends AbstractTableModel {
    private ArrayList<Doctor> doctors;
    private String[] columnNames = {"First Name", "Surname", "Date of Birth", "Mobile Number", "Medical Licence Number", "Specialization"};

    public DoctorTableModel(ArrayList<Doctor> list){
        doctors = list;
    }

    @Override
    public int getRowCount() {
        return doctors.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp = null;
        if(columnIndex == 0){
            temp = doctors.get(rowIndex).getName();
        }
        else if(columnIndex == 1){
            temp = doctors.get(rowIndex).getSurname();

        }
        else if(columnIndex == 2){
            temp = doctors.get(rowIndex).getDateOfBirth();

        }
        else if(columnIndex == 3){
            temp = doctors.get(rowIndex).getMobileNumber();

        }
        else if(columnIndex == 4){
            temp = doctors.get(rowIndex).getMedicalLicenceNumber();

        }
        else if(columnIndex == 5){
            temp = doctors.get(rowIndex).getSpecialisation();

        }
        return temp;
    }

    public String getColumnName(int col){
        return columnNames[col];
    }

}

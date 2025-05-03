package Console_Implementation;

import java.io.IOException;
import java.util.ArrayList;

public interface SkinConsultationManager {

    public void addDoctor();

    public void deleteDoctor();

    public void printDoctors();

    public void saveFile() throws IOException;

    public ArrayList<Doctor> getDoctors();

}

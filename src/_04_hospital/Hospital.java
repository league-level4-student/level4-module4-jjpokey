package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital { // DONE -----------------------------------------
	
ArrayList<Doctor> dlist = new ArrayList<Doctor>();
ArrayList<Patient> plist = new ArrayList<Patient>();

	public void addDoctor(GeneralPractitioner generalPractitioner) {
		dlist.add(generalPractitioner);
	}

	public List<Doctor> getDoctors() {
		return dlist;
	}

	public void addPatient(Patient patient) {
				plist.add(patient);
	}

	public List<Patient> getPatients() {	
		return plist;
	}

	public void assignPatientsToDoctors() {
		for(int i = 0; i < plist.size(); i++) {
			
		}
		
	}

	public void addDoctor(Surgeon surgeon) {
		dlist.add(surgeon);
	}

}

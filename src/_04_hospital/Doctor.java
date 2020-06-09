package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Hospital{
	ArrayList<Patient> patientl = new ArrayList<Patient>();
	Doctor d = new Doctor();

	public Object performsSurgery() {

				return false;
	}

	public Object makesHouseCalls() {
		
		return false;
	}

	public void assignPatient(Patient patient) {
		if(patientl.size() < 3) {
		patientl.add(patient);
		}
	}


	public void doMedicine() {
		
		
	}

	public List<Patient> getPatients() {
		
		return patientl;
	}

	public Doctor() {
		
	}

}

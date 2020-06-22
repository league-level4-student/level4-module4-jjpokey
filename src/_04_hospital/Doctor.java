package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor{
	
	ArrayList<Patient> patientl = new ArrayList<Patient>();

	public Object performsSurgery() {
				return false;
	}

	public Object makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException{ //works
		
		if(patientl.size() < 3) {
		patientl.add(patient);
		}
		else {
			throw new DoctorFullException();
		}
	}


	public void doMedicine() {
		for(int i = 0; i < patientl.size(); i++) {
			patientl.get(i).medicine = true;
		}
		
	}

	public List<Patient> getPatients() {
		
		return patientl;
	}

	public Doctor() {
		
	}
	


}

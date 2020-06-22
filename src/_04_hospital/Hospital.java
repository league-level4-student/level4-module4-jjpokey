package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital { // DONE ----------------------------------------

	ArrayList<Doctor> dlist = new ArrayList<Doctor>();
	ArrayList<Patient> plist = new ArrayList<Patient>();

	public void addDoctor(Doctor d) {
		dlist.add(d);
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

	public void assignPatientsToDoctors() throws DoctorFullException {
		int patientsLeft = plist.size();
		

		for (int i = 0; i < dlist.size(); i++) {
System.out.println(patientsLeft);
			if (patientsLeft >= 3) {
				for (int j = 0; j < 3; j++) {

					dlist.get(i).assignPatient(plist.get(plist.size() - patientsLeft));
					patientsLeft -= 1;
				}
			}

			else if (patientsLeft == 2) {
				for (int a = 0; a < 2; a++) {
					dlist.get(i).assignPatient(plist.get(plist.size() - patientsLeft));
					patientsLeft -= 1;
				}
			}

			else if (patientsLeft == 1) {
				for (int b = 0; b < 1; b++) {
					dlist.get(i).assignPatient(plist.get(plist.size() - patientsLeft));
					patientsLeft -= 1;
				}
			} else {
				throw new DoctorFullException();
			}
		}
	}

}

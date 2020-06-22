package _04_hospital;

public class Patient {
	
Boolean caredFor = false;
Boolean medicine = false;

	public Object feelsCaredFor() {
		if(caredFor == true) {
			return true;
		}
		else if(medicine == true){
			return true;
		}
		else {
			return false;
		}
	}

	public void checkPulse() {
		caredFor = true;
		
	}



}

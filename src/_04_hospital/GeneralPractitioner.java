package _04_hospital;

public class GeneralPractitioner extends Doctor{ //done


	public GeneralPractitioner() {
		super();
	}
	
	public Object makesHouseCalls() {
		System.out.println("practitioner works");
		return true;
}
	public Object performsSurgery() {
		return false;
}

}

package _04_hospital;

public class Surgeon extends Doctor{ //DONE

	public Surgeon() {
		super();
	}
	
	public Object performsSurgery() {
		System.out.println("surgeons works");
		return true;
}
	
	public Object makesHouseCall() {
		return false;
}
}

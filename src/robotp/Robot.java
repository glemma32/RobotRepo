package robotp;

public class Robot {
	
	String robotName;
	Head robotHead;
	Body robotBody;
	Legs robotLegs;
	
	public Robot(String rName) {
		
		this.robotName = rName;
		this.robotHead = new Head();
		this.robotBody = new Body();
		this.robotLegs = new Legs();
	}

	@Override
	public String toString() {
		return "Robot [robotName=" + robotName + "]";
	}
	
	
}

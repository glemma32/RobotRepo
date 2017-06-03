package robotp;
import java.util.ArrayList;

public class JavaRobotApp {
	

	public static void main(String[] args) {
		ArrayList<String> xstrings = new ArrayList<String>();
				
		xstrings.add("one");
		xstrings.add("Two");
		xstrings.add("Three");
		
		// TODO Auto-generated method stub
		Robot myNewRobot = new Robot("myNewRobot");
		print(myNewRobot.robotHead.shake());
		print(myNewRobot.robotBody.move());
		print(myNewRobot.robotLegs.kick());
		print(myNewRobot.robotHead.blink());
		print(myNewRobot.robotBody.stop());
		print(myNewRobot.robotLegs.walk());
		
		Robot Fifi = new Robot("Fifi");
		Robot Dave = new Robot("Dave");
		
		ArrayList<Robot> myRobots = new ArrayList<Robot>();
		
		myRobots.add(Fifi);
		myRobots.add(Dave);
		myRobots.add(myNewRobot);
		print("myNewRobot is # "+(myRobots.indexOf(myNewRobot)+1)+" in the list");
		print("There are "+myRobots.size()+" robots in my Robots");
		
		print(myRobots.toString());
		
		print(xstrings.toString());
		

	}
private static void print(String s)
{
	 System.out.println(s);
}
}

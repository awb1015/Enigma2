import java.util.ArrayList;
import java.util.Scanner;
//import com.google.common.collect.BiMap;
//import com.google.common.collect.HashBiMap;

public class Enigma {
	
	ArrayList<Wheel> wheels;
		
	public Enigma(int numWheels){
		wheels = new ArrayList<Wheel>();
		wheels.add(new Wheel("JGDQOXUSCAMIFRVTPNEWKBLZYH".toLowerCase()));
		wheels.add(new Wheel("NTZPSFBOKMWRCJDIVLAEYUXHGQ".toLowerCase()));
		wheels.add(new Wheel("JVIUBHTCDYAKEQZPOSGXNRMWFL".toLowerCase()));
		
	}
	
	public void runEnigma(){
		Scanner scan = new Scanner(System.in);
		while(true){
			// get user input - one char at a time \n
			String in = scan.next().toLowerCase();
			char c = in.next().trim().charAt(0);
			// for each char input enrypt 
			char output = c;
			//Now run through our plug pairs
			int lastWheelIndex = 25; 
			for(int i=0; i<wheels.size(); i++){
				Wheel w = wheels.get(i);
				output = w.encrypt(output);
				// do we step?
				if(lastWheelIndex == 25){
					w.step();
					lastWheelIndex = w.getWheelPos();
				}
			}
			//Now reflect
			//Then back through the plugs
			System.out.println(output);
		}
	}
	
	public static void main(String[] args){
		Enigma e = new Enigma(3);
		e.runEnigma();
	}
}

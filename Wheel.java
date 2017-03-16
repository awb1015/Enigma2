
public class Wheel {
	private String charOrder;
	private int wheelPos;
	
	public Wheel(String charOrder){
		this.charOrder = charOrder;
		wheelPos = 0;
	}
	
	public char encrypt(char c){
		int index = ((c - 'a') + getWheelPos())%26;
		return charOrder.charAt(index);
	}
	
	public void step(){
		wheelPos = (wheelPos+1)%26;
	}
	
	public int getWheelPos(){
		return wheelPos;
	}
}

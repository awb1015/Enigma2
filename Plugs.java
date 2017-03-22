//This may be a good time to work with BiMap collection types from Google
//Should each plug be its own object or just one plug object with a bimap populated from a constructor

public class Plugs {
	
	BiMap <char, char> plugPairs = HashBiMap.create();
	
	public Plugs(){
		new BiMap = plugPairs;
	}
			
	public void addPlugPair(char a char b){
		plugPairs.put(a, b);		
	}
	
	public char forwardPlugPair(char a){
		if(plugPairs.get(a)!=null){
			return plugPairs.get(a);
		}
		else
			return a;
	}
	
	public char backwardsPlugPair(char a){
		if(plugPairs.inverse().get(a)!=null){
			return plugPairs.inverse().get(a);
		}
		else
			return a;
	}
	
	

}

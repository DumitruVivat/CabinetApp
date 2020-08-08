package CabinetPack;

import ThingsPack.Thing;

public class Cabinet {
	
	private Thing topShelf;
    private Thing middleShelf;
    private Thing bottomShelf;
    
    public Cabinet() {}
    
    public Thing whatIsOn( String shelfName ) {
    	if(shelfName.equals("topShelf")) {
    	return topShelf;
    	} else if(shelfName.equals("middleShelf")) {
    	return middleShelf;
    	} else if(shelfName.equals("bottomShelf")) {
    	return bottomShelf;
    	} else {
    	return null;
    	}
    }
    public void put( String shelfName, Thing thing ) {
    	
    	if(shelfName.equals("topShelf")) {
    	    this.topShelf = thing;
    	} else if(shelfName.equals("middleShelf")) {
    		this.middleShelf = thing;
    	} else if(shelfName.equals("bottomShelf")) {
    		this.bottomShelf = thing;
		} else {
			System.err.println("Warning, ERROR!!");
		}
    }
    public Thing take( String shelfName ) {
    	
    	Thing Thing = whatIsOn(shelfName);
    	if(Thing != null) 
    	shelfName = null;
    	return Thing;
		
    }
}

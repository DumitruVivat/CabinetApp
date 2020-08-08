package ThingsPack;

public class Tablet extends Thing {
	
	private String name;

    public Tablet(String name) {
    	setName(name);
    }
    
    public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

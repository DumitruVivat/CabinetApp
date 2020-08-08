package ThingsPack;

public class Phone extends Thing {

	private String name;

    public Phone(String name) {
    	setName(name);
    }
    
    public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

package Application;

import CabinetPack.Cabinet;
import ThingsPack.Book;
import ThingsPack.Phone;
import ThingsPack.Tablet;
import ThingsPack.Thing;

public class Main {

	public static void main(String[] args) {
		Cabinet cabinet = new Cabinet();

		cabinet.put( "topShelf", new Book("Programming in Java for beginners.") );
		cabinet.put( "middleShelf", new Tablet("Samsung") );
		cabinet.put( "bottomShelf", new Phone("iPhone") );

		Thing things = cabinet.whatIsOn("topShelf");
        System.out.println(things.getName());
        things = cabinet.whatIsOn("middleShelf");
        System.out.println(things.getName());
        things = cabinet.whatIsOn("bottomShelf");
        System.out.println(things.getName());
        
        
		
	}

}

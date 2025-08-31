package JavaHashSet; // project created in eclipse
import java.util.HashSet; // imported HashSet class
import java.util.Collection; // imported Collection class

public class MyHashSet { //created public class 'MyHashSet'

	public static void main(String[] args) {// reads, runs & executes code
	
	// created an object of imported class named 'myPlaces', set as <Strng>
	// HahSet<String>
		HashSet<String> myPlaces = new HashSet<String>();
		
	// object calls onto the '.add' function to add names of places inside the object
		myPlaces.add("Dublin");
		myPlaces.add("Milan");
		myPlaces.add("Amsterdam");
		myPlaces.add("Lagos");
		myPlaces.add("London");
		myPlaces.add("Milan");
	
		myPlaces.remove("London"); // got the object to call onto the '.remove' function to remove London from list in the object 
		
		System.out.println(myPlaces.contains("Instanbul")); // Displays true or false if it as Instanbul on the list of places put in the object
		
		System.out.println(myPlaces); // Display the places in the object 'myPlaces'
		

	}

}

// Result:
// false
// [Milan, Amsterdam, Dublin, Lagos]

// myPlaces.clear(); - this clears all data in the object
// System.out.println(myPlaces.size()); - this gets the amount of places in the object
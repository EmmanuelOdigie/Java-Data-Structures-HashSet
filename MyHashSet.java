// Java Data Structures: ArrayList //

package JavaDataStructures; // project made when setting up Java

import java.util.HashSet; // imported the HashSet class

public class MyHashSet {// created a public class called MyHashSet

	public static void main(String[] args) {// reads,run & executes code
		
	// created object of the HashSet imported class named 'cars' //
		HashSet<String> cars = new HashSet<String>();
		
// used the object 'cars' to call onto the add function and put the names in String (txt) values
		cars.add("Volvo"); // added name 'volvo' in brackets with quotations " "
		cars.add("Seat");// added name 'seat' in brackets with quotations " "
		cars.add("Volvo");// added name 'volvo' in brackets with quotations " "
		cars.add("Mazda");// added name 'Mazda' in brackets with quotations " "
		cars.add("Cetreon");//added name 'cetreon' in brackets with quotations " "
		System.out.println(cars); // display the names in the cars objects
	// with HashSet it'll display the names but if there are duplicates, it'll display it once
		

	}

}
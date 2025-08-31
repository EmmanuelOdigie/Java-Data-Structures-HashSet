package JavaHashSet; // project created in eclipse
import java.util.HashSet; // imported HashSet class
import java.util.Collections; // imported Collections class

public class JavaHashSetIntegerSet { // public class 'JavaHashSetIntegerSet' created

	public static void main(String[] args) {// Reads, runs & executes code
		
	// created an object of the imported HashSet class named 'mySetOfNumber' which carries integer
	// this is set up as HashSet<Integer>
		HashSet<Integer> mySetOfNumbers = new HashSet<Integer>();
	
	// object calls onto the '.add' function and adds the numbers 7,3 &5 into the object
		mySetOfNumbers.add(7);
		mySetOfNumbers.add(3);
		mySetOfNumbers.add(9);
		
	//for loop created, int variable r = 0; r is less than 10, increments by 1
	//the numbers in the object 'mySetNumbers' is it within 0 to less than 10 range
	// this is done by the '.contains' method that checks if the numbers added fit into the set
		for(int r = 0; r<10; r=r+1) {
			if(mySetOfNumbers.contains(r)) {
				System.out.println(r + " Number is within the set"); // if it does it'll display txt
			}else {
				System.out.println(r + " Number not in the set"); // if it doesn't it'll display txt
			}
		}

	}
	
	
	// Result:
	//6 Number not in the set
    //7 Number is within the set
    //8 Number not in the set
    //9 Number is within the set
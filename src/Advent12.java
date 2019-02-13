import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Advent12 {

	public static void main(String[] args) throws FileNotFoundException  {

		File f = new File(args[0]);
		
		Integer frequency = 0;
		HashSet<Integer> hset = new HashSet<Integer>();
		Boolean found = false;
		
		while (!found) { //while frequency has not repeated, loop through the input
			Scanner scan = new Scanner(f);
			while(scan.hasNext()) { //while file not empty, get next frequency change
				String line = scan.next();
				//System.out.println(line);
				Integer add = Integer.valueOf(line);
				frequency = frequency + add;
				
				if (hset.contains(frequency)) { //if the frequency has been seen before, done
					found = true;
					break;
				} else {	//frequency not seen yet, add to hash set
					hset.add(frequency);
				}
			}
			scan.close();
		}
		System.out.println("First repeat: " + frequency);
		
		
	}

}

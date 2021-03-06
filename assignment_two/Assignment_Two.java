import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Assignment_Two {	

	/*
	 * Static object streams so you don't cross the streams!
	 */
	private static ObjectInputStream myInput;
	private static ObjectOutputStream myOutput;
		
	public static void main(String[] args) {
		generateSER();
		readSER();
	}
		
	/*
	 * Opens the movies.txt file
	 * reads the movies.txt file with a BufferedReader one line at a time
	 * breaks the line into elements for a Movie
	 * adds Movie to an arraylist
	 * writes the array list of Movie Object to the movies.ser file
	 */
	static void generateSER() {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		try {
			File textFile = new File("movies.txt"); 			  
			BufferedReader chrisBR = new BufferedReader(new FileReader(textFile));
			String movieLine;
			while((movieLine = chrisBR.readLine()) != null) {
				String[] temp = movieLine.split(",");
				int year = Integer.parseInt(temp[1]);
				double runtime = Double.parseDouble(temp[2]);
				movies.add(new Movie(temp[0], year, runtime));
			}
			chrisBR.close();
			
		}
		catch(IOException e) {
			System.out.println("File IO error: " + e.getMessage());
			System.exit(-99);
		}
		try {
			myOutput = new ObjectOutputStream(Files.newOutputStream(Paths.get("movies.ser")));
			for(Movie it : movies) {
				myOutput.writeObject(it);
			}
			myOutput.close();
		}
		catch(IOException e) {
			System.out.println("File IO error: " + e.getMessage());
			System.exit(-99);
		}

	}
	
	/*
	 * opens the movies.ser file
	 * reads the movies object while adding them to an arraylist
	 * outputs the arraylist of movie objects with required formatting.
	 */
	static void readSER() {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		try {
			myInput = new ObjectInputStream(Files.newInputStream(Paths.get("movies.ser")));
			while(true) {
				movies.add((Movie) myInput.readObject());
			}	
		}
		catch(EOFException e){
			System.out.format("%-20s%-8s%10s%n", "Title", "Year", "Runtime");
			for(Movie it : movies) {
				System.out.format("%-20s%-8d%10.2f%n",  
			               it.getName(), it.getYear(), it.getRunTime());
			}
			System.out.println("\n\nNo more movies in list");
			System.exit(1);
		} 
		catch(IOException e) {
			System.out.println("IO Exception");
			System.exit(-99);
		}
		catch (ClassNotFoundException e){
			System.err.println("Invalid object type. Terminating.");
			System.exit(-99);
		} 
	}
}



import java.io.Serializable;

public class Movie implements Serializable{
	String Name;
	int Year;
	double runTime;
	
	public Movie(String name, int year, double runTime) {
		//super();
		Name = name;
		Year = year;
		this.runTime = runTime;
	}
	
	/*
	 * Accessor and Mutator functions
	 */
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public double getRunTime() {
		return runTime;
	}
	public void setRunTime(double runTime) {
		this.runTime = runTime;
	}
	/*
	 * custom toString function
	 * mostly used for troubleshooting, but it works
	 */
	@Override
	public String toString() {
		return "Movie: " + Name + ", Year: " + Year + ", runTime: " + runTime;
	}
	
	

}

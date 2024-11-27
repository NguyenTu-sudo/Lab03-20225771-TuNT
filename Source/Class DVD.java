// DVD.java
package DVD;

public class DVD {
  nbDigitalVideoDiscs++; 
    private String id;
    private String title;
    private String category;
    private double cost;
    private String director;
    private int length;


    public DVD(String id, String title, String category, double cost, String director, int length) {
    	nbDigitalVideoDiscs++; 
        this.id = "DVD" + nbDigitalVideoDiscs;

 

    public DVD(String oldTitle) {
        this.title = oldTitle;
        this.id = "Unknown";
        this.category = "Unknown"; 
        this.cost = 0.0; 
        this.director = "Unknown";
        this.length = 0;
    }

    
    public String toString() {
        return String.format("DVD - %s - %s - %s - %d: %.2f $", 
            title, category, director, length, cost);
    }


	public void play() {
        if (this.length > 0) {
            System.out.println("Playing DVD: " + this.title);
            System.out.println("DVD length: " + this.length);
        } else {
            System.out.println("DVD cannot be played");
        }
    }

    public boolean canPlay() {
        return this.length > 0;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title2) {
        this.title = title2;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }
}

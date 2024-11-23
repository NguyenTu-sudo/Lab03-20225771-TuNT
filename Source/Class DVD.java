// DVD.java
package DVD;

public class DVD {
    private String id;
    private String title;
    private String category;
    private double cost;
    private String director;
    private int length;

    public DVD(String id, String title, String category, double d, String director, int length) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = d;
        this.director = director;
        this.length = length;
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
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public double getCost() { return cost; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
}
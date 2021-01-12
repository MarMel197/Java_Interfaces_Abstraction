package attractions;

public abstract class Attraction {
    private String name;
    private int rating;
    private int visitCount;
    private double price;

    public Attraction(String name, int rating, double price) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public double defaultPrice(){
        return this.price;
    }
}


public class DigitalMedia {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    public DigitalMedia(String title, String category, String director, int length, float cost){
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public String gettitle(){
        return title;
    }
    public float getCost() {
        return cost;
    }
}


import java.util.ArrayList;

public class Cart {
    private int quantity = 0;
    private ArrayList<DigitalMedia> a = new ArrayList<>();
    public void add(DigitalMedia item){
        if(quantity < 20){
            a.add(item);
            quantity++;
        }
    }
    public void remove(DigitalMedia item){
        if(a.remove(item)){
            quantity--;
        }
    }
    public float totalcost(){
        float sum = 0f;
        for(DigitalMedia x : a){
            sum += x.getCost();
        }
        return sum;
    }
}

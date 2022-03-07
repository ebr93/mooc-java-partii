import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> list;

    public IOU() {
        this.list = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.list.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
    //  could've been solved this way
    //  return list.getOrDefault(toWhom, 0.0);
    //  if there is no debt to key (toWhom) then it returns a 0.0, instead of returning a null
        return this.list.getOrDefault(toWhom, 0.0);
    }
}

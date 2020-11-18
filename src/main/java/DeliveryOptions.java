import org.json.simple.JSONObject;

public class DeliveryOptions extends JSONObject {

    private String name;
    private String type;
    private long minDays;
    private long maxDays;
    private double cost;

    public DeliveryOptions(DeliveryOptions deliveryOptions) {
    }

    public DeliveryOptions(String name, String type, long minDays, long maxDays, double cost) {
        this.name = name;
        this.type = type;
        this.minDays = minDays;
        this.maxDays = maxDays;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getMinDays() {
        return minDays;
    }

    public void setMinDays(long minDays) {
        this.minDays = minDays;
    }

    public long getMaxDays() {
        return maxDays;
    }

    public void setMaxDays(long maxDays) {
        this.maxDays = maxDays;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "DeliveryOptions: " +
                "Название: " + name + "\n" +
                "Тип: " + type + "\n" +
                "Мин: " + minDays + "\n" +
                "Макс: " + maxDays + "\n" +
                "Цена: " + cost ;
    }
}

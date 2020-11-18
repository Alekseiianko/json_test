import java.util.List;

public class Seller {

    private long id;
    private String site;
    private String description;
    private List<Stores> storesList;
    private String name;
    private String img;
    private List<DeliveryOptions> deliveryOptions;

    public Seller() {
    }

    public Seller(long id, String site, String description, List<Stores> storesList,
                  String name, String img, List<DeliveryOptions> deliveryOptions) {
        this.id = id;
        this.site = site;
        this.description = description;
        this.storesList = storesList;
        this.name = name;
        this.img = img;
        this.deliveryOptions = deliveryOptions;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Stores> getStoresList() {
        return storesList;
    }

    public void setStoresList(List<Stores> storesList) {
        this.storesList = storesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<DeliveryOptions> getDeliveryOptions() {
        return deliveryOptions;
    }

    public void setDeliveryOptions(List<DeliveryOptions> deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
    }

    @Override
    public String toString() {
        return "Object: " + "\n" +
                "ID: " + id + "\n" +
                "Сайт: " + site + "\n" +
                "Описание: " + description + "\n" +
                "Магазины: " + storesList + "\n" +
                "Название: " + name + "\n" +
                "Изображение: " + img + "\n" +
                "Способ доставки" + deliveryOptions;
    }
}


import java.util.List;

public class Stores {

    private long id;
    private String city;
    private String street;
    private String building;
    private List<ShopMetroStation> shopMetroStation;

    public Stores() {
    }

    public Stores(long id, String city, String street, String building, List<ShopMetroStation> shopMetroStation) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.building = building;
        this.shopMetroStation = shopMetroStation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public List<ShopMetroStation> getShopMetroStation() {
        return shopMetroStation;
    }

    public void setShopMetroStation(List<ShopMetroStation> shopMetroStation) {
        this.shopMetroStation = shopMetroStation;
    }

    @Override
    public String toString() {
        return "Stores: " +
                "ID: " + id + "\n" +
                "Город: " + city + "\n" +
                "Улица: " + street + "\n" +
                "Дом: " + building + "\n" +
                "ШопМетроСТЭЙШН: " + shopMetroStation ;
    }
}

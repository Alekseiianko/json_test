public class ShopMetroStation {

    private String lineColor;
    private String lineName;
    private String station;

    public ShopMetroStation() {
    }

    public ShopMetroStation(String lineColor, String lineName, String station) {
        this.lineColor = lineColor;
        this.lineName = lineName;
        this.station = station;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "ShopMetroStation: "  + "\n" +
                "Цвет линии: " + lineColor + "\n" +
                "Название Линии: " + lineName + "\n" +
                "Станция: " + station ;
    }
}
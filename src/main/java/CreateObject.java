import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CreateObject {

    public static Seller createSeller(){
        JSONObject obj= (JSONObject) Parser.parse();
        Long id = (Long) obj.get("id");
        String site = (String) obj.get("site");
        String description = (String) obj.get("description");
        List<Stores> storesList = (List<Stores>) obj.get("stores");
        String name = (String) obj.get("name");
        String img = (String) obj.get("img");
        Seller seller = new Seller(id,site,description,storesList
                ,name,img,addToListDeliveryOptions());
        return seller;
    }

    public static List<DeliveryOptions> addToListDeliveryOptions(){
        JSONObject obj= (JSONObject) Parser.parse();
        List<DeliveryOptions> deliveryOptions = (List<DeliveryOptions>) obj.get("deliveryOptions");
        List<DeliveryOptions> list = new ArrayList<DeliveryOptions>();
        for (int i = 0; i < deliveryOptions.size(); i++) {
            JSONObject j = deliveryOptions.get(i);
            String name = (String) j.get("name");
            String type = (String) j.get("type");
            Long minDays = (Long) j.get("minDays");
            Long maxDays = (Long) j.get("maxDays");
            Double cost = (Double) j.get("cost");
            DeliveryOptions ddd = new DeliveryOptions(name, type, minDays, maxDays, cost);
            list.add(ddd);
        }
        return list;
    }
}

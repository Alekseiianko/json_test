import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Parser {

    public static JSONObject parse() {
        JSONParser parser = new JSONParser();
        Object resultObject = null;
        try {
            resultObject = parser.parse(HttpUtils.httpResponseToString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        JSONObject obj= (JSONObject) resultObject;
        return obj;
    }


}

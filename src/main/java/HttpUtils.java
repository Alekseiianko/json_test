import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpUtils {

    public static HttpResponse sendRequest(HttpGet httpGet) {
        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpResponse result = null;
        try {
            result = httpclient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static String httpResponseToString(){
        String json = null;
        try {
            json = EntityUtils.toString(
                    sendRequest(new HttpGet("http://80.78.255.182:8080/api/sellers/1"))
                            .getEntity(), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}

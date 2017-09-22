import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;

public class client {
    public static void main(String[] args) throws Exception {

        HttpClient httpClient = new HttpClient();
        httpClient.start();
        ContentResponse response = httpClient.GET("http://localhost:8888");
        System.out.println(response.getHeaders().get("port"));
        System.out.println(response.getContentAsString());
    }
}

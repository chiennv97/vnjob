import spark.Request;
import spark.Response;
import spark.Route;

public class sparkserver implements Route {
    int port;
    public sparkserver(int port){
        this.port = port;
    }
    public Object handle(Request request, Response response) throws Exception {
        response.header("port", String.valueOf(port));
        return response;
    }
}

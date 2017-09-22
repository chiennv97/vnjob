import static spark.Spark.*;

public class server1 {
    public static void main(String[] args) {
        port(9997);
        get("/hello/", new sparkserver(9997));
    }
}
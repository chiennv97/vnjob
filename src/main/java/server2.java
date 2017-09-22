import static spark.Spark.*;

public class server2 {
    public static void main(String[] args) {
        port(9998);
        get("/hello", new sparkserver(9998));
    }
}
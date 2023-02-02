package Week4;

import java.io.IOException;
import java.io.OutputStream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;




public class httpServer {

    public static class MyHttpHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange he) throws IOException {
            SunwellRaiders raider = new SunwellRaiders("cyto", "prot", "warrior");
            ObjectMapper mapper = new ObjectMapper();
            String json = "";
            try {
                json = mapper.writeValueAsString(raider);
            } catch (JsonProcessingException e) {
                System.err.println(e.toString());
            }

            he.sendResponseHeaders(200, json.length());
            OutputStream os = he.getResponseBody();
            os.write(json.getBytes());
            os.close();
        }
    }


    public static void main(String[] args) throws IOException {
        int port = 8001;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        System.out.println("Server started at port: " + port);
        server.createContext("/", new MyHttpHandler());
        server.setExecutor(null);
        server.start();
    }
}
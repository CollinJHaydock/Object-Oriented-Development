package Week4;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.*;
import java.io.*;

public class Server {

    public static String handler(String string) throws IOException {
        /*ServerSocket ss = new ServerSocket(9000);
        Socket s = ss.accept();*/
        URL url = new URL(string);
        HttpURLConnection http = (HttpURLConnection) url.openConnection();

        System.out.println("Client Connected");

        ObjectMapper om = new ObjectMapper();
        BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));

        StringBuilder sb = new StringBuilder();
        String line = null;

        while ((line = br.readLine()) != null) {
            sb.append(line + "\n");
        }
        return sb.toString();
    }
    public class MyServer {
        public static void main (String[] args) throws IOException {
            final int PORT = 9000;

            HttpServer httpServer = HttpServer.create(new InetSocketAddress(PORT), 0);
            httpServer.createContext("/raiders", new RaiderRequestHandler());
            System.out.println("Server_started! \nPORT: " + PORT);
            httpServer.setExecutor(null);
            httpServer.start();



        }
    }
}

package Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class HTTPExample {

    public static String getHttpContent(String string) {

        try {

            URL url = new URL(string);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();

            BufferedReader reader = new BufferedReader(new InputStreamReader(http.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();

            String line = null;
            while ((line = reader.readLine()) != null) {

                stringBuilder.append(line + "\n");
            }

            return stringBuilder.toString();

        } catch (IOException e) {
            System.err.println(e.toString());
        }

        return "Error";
    }

    public static Map getHttpHeaders(String string) {

        try {

            URL url = url = new URL(string);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();

            return http.getHeaderFields();

        } catch (IOException e) {
            System.err.println(e.toString());
        }
        return null;

    }
    public static void main(String[] args) {
        System.out.println(HTTPExample.getHttpContent("http://www.google.com"));

        Map<Integer, List<String>> m = HTTPExample.getHttpHeaders("http://www.google.com");

        for (Map.Entry<Integer, List<String>> entry : m.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}

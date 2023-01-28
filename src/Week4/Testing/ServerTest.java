package Week4.Testing;

import Week4.SunwellRaiders;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServerTest {

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

    public static String ObjectToJSON (SunwellRaiders object) {
        ObjectMapper om = new ObjectMapper();
        String json = "";

        try {
            json = om.writeValueAsString(object);
        } catch (JsonProcessingException exception) {
            System.err.println(exception.toString());
        }

        return json;
    }
}

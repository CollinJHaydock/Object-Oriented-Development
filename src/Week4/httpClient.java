package Week4;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;

public class httpClient {
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

    public static SunwellRaiders JSONToObject (String json) {

        ObjectMapper objectMapper = new ObjectMapper();
        SunwellRaiders raider = null;

        try {
            raider = objectMapper.readValue(json, SunwellRaiders.class);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }

        return raider;
    }

    public static void main(String[] args) {

        String raider = httpClient.getHttpContent("http://localhost:8001/");
        String object = String.valueOf(httpClient.JSONToObject(raider));
        System.out.println(object);

        }
    }
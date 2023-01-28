package Week4.Testing;

import Week4.SunwellRaiders;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClientTest {
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
        SunwellRaiders raider = new SunwellRaiders("Cytochrome", "Protection", "Warrior");

        String json = ServerTest.ObjectToJSON(raider);
        String object = String.valueOf(ClientTest.JSONToObject(json));
        System.out.println(object);
    }
}

package Week4.testing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Server {
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

    }

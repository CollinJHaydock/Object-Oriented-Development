package Examples;
import Week4.SunwellRaiders;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
public class JsonExample {

    public static String raiderToJson (SunwellRaiders sunwellRaiders) {

        ObjectMapper mapper = new ObjectMapper();
        String s = "";

        try {
            s = mapper.writeValueAsString(sunwellRaiders);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }
        return s;
    }

    public static SunwellRaiders JsonToRaider(String s) {

        ObjectMapper mapper = new ObjectMapper();
        SunwellRaiders raider = null;

        try {
            raider = mapper.readValue(s, SunwellRaiders.class);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }


        return raider;
    }

    public static void main(String[] args) {

        SunwellRaiders raider1 = new SunwellRaiders();
        raider1.setSpec("Protection");
        raider1.setToon("Cytochrome");
        raider1.setType("Warrior");
        String json = JsonExample.raiderToJson(raider1);
        System.out.println(json);

        SunwellRaiders raider2 = JsonExample.JsonToRaider(json);
        System.out.println(raider2);
    }
}

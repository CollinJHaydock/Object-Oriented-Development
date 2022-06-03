package Week4;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*public class RaidersHandler implements HttpHandler {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final List<SunwellRaiders> raiders = new ArrayList<>();
    public RaidersHandler() {
        SunwellRaiders cytochrome = new SunwellRaiders("Cytochrome", "Protection", "Warrior");
        SunwellRaiders shadii = new SunwellRaiders("Shadii", "Boomkin", "Druid");
        SunwellRaiders neqi = new SunwellRaiders("Neqi", "Enhancement", "Shaman");
        SunwellRaiders valjinator = new SunwellRaiders("Valjinator", "Destruction", "Warlock");
        SunwellRaiders sporkfinger = new SunwellRaiders("Sporkfinger", "Flex", "Warrior");
        SunwellRaiders cleoma = new SunwellRaiders("Cleoma", "Holy", "Priest");

        raiders.add(cytochrome);
        raiders.add(shadii);
        raiders.add(neqi);
        raiders.add(valjinator);
        raiders.add(sporkfinger);
        raiders.add(cleoma);
    }
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(
                httpExchange.getRequestBody(),
                StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String raiderToJson = bufferedReader.lines().collect(Collectors.joining());

        if (raiderToJson.isEmpty()) {
            raiderToJson = objectMapper.writeValueAsString(raiders);
        } else {
            try {
                RaiderRequest requestRaider = objectMapper.readValue(raiderToJson, RaiderRequest.class);
                String raiderToon = requestRaider.getToon();

                List<raiders>
            }
        }
    }

}
*/
package Week4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class RaiderRequestHandler implements HttpHandler {
    private final ObjectMapper om = new ObjectMapper();

    public RaiderRequestHandler() {
        SunwellRaiders sporkfinger = new SunwellRaiders("Sporkfinger", "Flex", "Warrior");
    }
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(exchange.getRequestBody(), StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder();
        String jsonInfo = null;

        while ((jsonInfo = br.readLine()) != null) {
            sb.append(jsonInfo + "\n");

        }



        //writeHttpResponse(httpExchange.getResponseBody(), )

    }
}

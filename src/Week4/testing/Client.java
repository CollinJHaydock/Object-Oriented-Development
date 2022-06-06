package Week4.testing;

public class Client {


    public static void main(String[] args) {
        SunwellRaiders cytochrome = new SunwellRaiders("Cytochrome", "Protection", "Warrior");

        String json = Server.ObjectToJSON(cytochrome);
        String object = String.valueOf(Server.JSONToObject(json));

        System.out.println(json);
        System.out.println(object);
    }
}

package Week1;

public class Raiders {

    private String Toon;
    private String Class;
    private String Spec;


    public Raiders(String Toon, String Class, String Spec) {
        this.Toon = Toon;
        this.Class = Class;
        this.Spec = Spec;

    }

    public String toString() {
        return "Toon: " + Toon + ", Class: " + Class + ", Spec: " + Spec;
    }
}

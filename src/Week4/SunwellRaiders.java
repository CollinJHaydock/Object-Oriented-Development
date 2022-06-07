package Week4;

public class SunwellRaiders {
    private String toon;
    private String spec;
    private String type;

    public SunwellRaiders() {}

    public SunwellRaiders(String toon, String spec, String type) {
        this.toon = toon;
        this.spec = spec;
        this.type = type;
    }
    public String getToon() {
        return toon;
    }

    public void setToon(String toon) {
        this.toon = toon;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getType() {
        return type;
    }

    public void setType(String Class) {
        this.type = Class;
    }

    public String toString() {
        return "Toon: " + toon + " || Spec: " + spec + " || Class: " + type;
    }
}

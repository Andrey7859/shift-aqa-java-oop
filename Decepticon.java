public class Decepticon extends Transformer {
    private String teamName;
    private final String eyeColor;
    private boolean kindness;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
        this.eyeColor = "red";
        this.kindness = false;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

    public boolean getKindness() {
        return kindness;
    }

    public void transform() {
        System.out.println(getName() + " transforms into ground and air transport, weapons, and equipment");
    }
}

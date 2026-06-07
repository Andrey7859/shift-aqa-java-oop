public class Autobot extends Transformer {
    private String teamName;
    private final String eyeColor;
    private boolean kindness;

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
        this.eyeColor = "blue";
        this.kindness = true;
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
        System.out.println(getName() + " transforms into vehicles");
    }
}

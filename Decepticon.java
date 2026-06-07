public class Decepticon extends Transformer implements Action {
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

    @Override
    public void transform() {
        System.out.println(getName() + " transforms into ground and air transport, weapons, and equipment");
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running");
    }

    @Override
    public void fire() {
        System.out.println(getName() + " is firing");
    }

    @Override
    public void charge() {
        System.out.println(getName() + " is charging");
    }
}

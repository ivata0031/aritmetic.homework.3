package Football;

class Player extends PlayerStatus {
    private String strName;
    private double dStatus;
    public Player(String name,int endurance, int sprint, int dribble, int passing, int shooting) {
        super(endurance, sprint, dribble, passing, shooting);
        this.setName(name);
        this.dStatus = this.calculateStatus();
    }
    public void setName(String name) {
        if (!name.isEmpty())
            this.strName = name;
        else
            throw new IllegalArgumentException("A name should not be empty.");
    }
    public double getStatus() {return this.dStatus;}
    public String getName() {return this.strName;}
}

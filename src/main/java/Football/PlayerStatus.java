package Football;

public class PlayerStatus {

    private double iEndurance;
    private double iSprint;
    private double iDribble;
    private double iPassing;
    private double iShooting;

    public PlayerStatus(int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }
    public void setEndurance(int endurance) {
        if (endurance>=0 && endurance <= 100)
            this.iEndurance = endurance;
        else
            throw new IllegalArgumentException("Endurance should be between 0 and 100.");
    }
    public void setSprint(int sprint) {
        if (sprint>=0 && sprint <= 100)
            this.iSprint = sprint;
        else
            throw new IllegalArgumentException("Sprint should be between 0 and 100.");
    }
    public void setDribble(int dribble) {
        if (dribble>=0 && dribble <= 100)
            this.iDribble = dribble;
        else
            throw new IllegalArgumentException("Dribble should be between 0 and 100.");
    }
    public void setPassing(int passing) {
        if (passing>=0 && passing <= 100)
            this.iPassing = passing;
        else
            throw new IllegalArgumentException("Passing should be between 0 and 100.");
    }
    public void setShooting(int shooting) {
        if (shooting>=0 && shooting <= 100)
            this.iShooting = shooting;
        else
            throw new IllegalArgumentException("Shooting should be between 0 and 100.");
    }
    public double calculateStatus() {return ((this.iDribble+this.iEndurance+this.iPassing+this.iShooting+this.iSprint)/5);}


}

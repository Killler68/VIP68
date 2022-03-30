package calculator.practices.inheritance;

public class Animal {
    private String say = "...";
    private String wool = "...";
    private int teeth = 0;


    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public String getWool() {
return wool;
    }

    public void setWool(String wool) {
        this.wool = wool;
    }
}
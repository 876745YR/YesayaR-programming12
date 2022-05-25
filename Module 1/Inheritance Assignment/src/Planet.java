
import java.util.ArrayList;

public class Planet{
    private int orbitTime;
    private String designation;
    ArrayList<Moon> moons = new ArrayList<Moon>();
    {

    };

    public Planet(int orbitTime, String designation) {
        
    }

    Planet() {

    }


    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public void setMoons(ArrayList<Moon> moons) {
        this.moons = moons;
    }

    public void addMoons(Moon){
        return Moon;
    }

    public ArrayList<Moon> getMoons() {
        return moons;
    }

}

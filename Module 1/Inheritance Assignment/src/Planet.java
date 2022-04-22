
import java.util.ArrayList;

public class Planet {
    private int orbitTime;
    private String designation;
    ArrayList<Moon> moons = new ArrayList<Moon>();
    {

    };

    public Planet(int orbitTime, String designation, ArrayList<Moon> moons) {
        this.orbitTime = orbitTime;
        this.designation = designation;
        this.moons = moons;
    }

    public Planet(int orbitTime, String designation) {
        
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


    public ArrayList<Moon> getMoons() {
        return moons;
    }

}

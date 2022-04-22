import java.awt.*;
import java.util.ArrayList;

public class GasPlanet extends Planet {
        private boolean hasRings;
        private Color color;

        public GasPlanet(int orbitTime, String designation, ArrayList<Moon> moons) {
                super(orbitTime, designation, moons);
        }

        public void setHasRings(boolean hasRings) {
                this.hasRings = hasRings;
        }

        public boolean isHasRings() {
                return hasRings;
        }

        public Color getColor() {
                return color;
        }

        public void setColor(Color color) {
                this.color = color;
        }

        @Override
        public String toString() {
                return "GasPlanet{" +
                        "hasRings=" + hasRings +
                        ", color=" + color +
                        '}';
        }


}

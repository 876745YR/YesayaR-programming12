public class Main {
    abstract class TwoDShape{
        double width;
        double height;
        String shape;
        public String toString(){
            return "Height:"+height+"Width:"+width;
        }
        public TwoDShape(double width, double height){

        }
        public TwoDShape(){

        }
        public double getArea(){
            return height*width;
        }
        public void setHeight(double height){

        }
        abstract class Circle {

            public final double Pi = 3.14;
            private double radius;

            Circle(double radius) {

            }

            public abstract double getArea();
        }
        class Triangle{
            double side1;
            double side2;
            double side3;
            public Triangle(double width, double height){

            }
            public Triangle(double side1, double side2, double side3){
                double height = heronsHeight();

            }
            private double heronsHeight(){
                double height = 2*getArea()/side2;
                return height;
            }
            public double getArea(){
                double semiperimeter = (side1+side2+side3/2);
                 return Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3)); //math

            }
        }
    }

}

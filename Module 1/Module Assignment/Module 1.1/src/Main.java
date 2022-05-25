public class Main {
    class TwoDShape{
        double width;
        double height;
        public TwoDShape(double width, double height){

        }
        public TwoDShape(){

        }
        public double getArea(){

            return 0;
        }
        public void setHeight(double height){

        }
        class Triangle{
            double side1;
            double side2;
            double side3;
            public Triangle(double width, double height){

            }
            public Triangle(double side1, double side2, double side3){
                double height = heronsHeight(side1,side2,side3);

            }
            private double heronsHeight(double side1, double side2, double side3){
                double area;
                double height;
                double semiperimeter = (side1+side2+side3/2);
                area = Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));
                height = 2*area/side2;
                return height;
            }
            public double getArea(){

                return 0;
            }
        }
    }
}

public class Triangle extends TwoDShape implements Rotate{
    double side1;
    double side2;
    double side3;
    public Triangle(double width, double height, Colour color){

    }
    public Triangle(double side1, double side2, double side3, Colour color){

    }
    private double heronsHeight(double side1, double side2, double side3){
        double area;
        double height;
        double semiperimeter = (side1+side2+side3/2); //sum of all sides divided by two in order to get
        area = Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));  //math formula to get area of triangle with side lengths
        height = 2*area/side2; // area = l*h/2 so h = 2*area/l
        return height;
    }

    public double getArea(){
        return this.side2*heronsHeight(side1,side2,side3);
    }
}

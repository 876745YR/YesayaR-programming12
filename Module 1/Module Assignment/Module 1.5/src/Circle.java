public class Circle extends TwoDShape{
    public final double Pi =3.14; //value of pi to the hundredth place

    private double radius;
    Circle(double radius, Colour Colour){

    }


    @Override
    public double getArea(){
        return Pi*(Math.pow(radius,2)); //area of circle = pi * radius squared
    }
}

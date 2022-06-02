public class Circle extends TwoDShape{
    public final double Pi =3.14;

    private double radius;
    Circle(double radius, Colour Colour){

    }


    @Override
    public double getArea(){
        return Pi*radius;
    }
}

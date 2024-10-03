public class Circle extends GeometricObject {

    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return (this.radius*this.radius)*Math.PI;
    }
}

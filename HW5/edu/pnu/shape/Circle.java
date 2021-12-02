package edu.pnu.shape;
public class Circle extends Shape{
    private Point center;
    private int radius;
    public Circle(Point center,int radius){
        this.center = center;
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float)Math.PI * radius *radius;
    }

    @Override
    public String toString() {
        String s = String.format("[Circle [" + center.getx() + ", "+center.gety()+"], radius: "+radius + " area: ");
        s+=String.format("%.2f",getArea());
        s+=String.format("]");
        return s;
    }
}

package edu.pnu.shape;
public class Rectangle extends Shape {
    private int width,height;
    public Rectangle(int x1,int y1,int x2,int y2){
        this.width = x2-x1;
        this.height = y2-y1;
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public String toString() {
       String s;
       s = String.format("[Rectangle "+ width + " "+height + " ");
       s+= String.format("%.2f",getArea());
       s+=String.format("]");
       return s;
    }
}

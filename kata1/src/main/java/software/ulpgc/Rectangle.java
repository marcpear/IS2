package software.ulpgc;

public class Rectangle {
    public final double height;
    public final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return height * width;
    }
}

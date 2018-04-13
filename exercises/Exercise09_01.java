public class Exercise09_01 {
    public static void main(String arg[]) {

        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5,35.9);

        System.out.println("The area of a rectangle with " + r1.getWidth() + " and " + r1.getHeight() + " is " + r1.getArea());
        System.out.println("The perimeter of a rectangle is " + r1.getPerimeter());
        System.out.println("The area of a rectangle with " + r2.getWidth() + " and " + r2.getHeight() + " is " + r2.getArea());
        System.out.println("The perimeter of a rectangle is " + r2.getPerimeter());

    }
}

class Rectangle{

    double width=1;
    double height=2;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea(){
        return width*height;
    }

    double getPerimeter(){
        return 2*(width+height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
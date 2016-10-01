public class AreaFinder {
  public static class Shape {
    public double area(){
      return 0;
    }
  }
  static class Rectangle extends Shape{
    Rectangle (double length, double width){
      this.length = length;
      this.width = width;
    }
    private double length;
    private double width;
    public double area(){
      return length*width;
    }
  }
  static class Circle extends Shape{
    Circle (double radius){
      this.radius = radius;
    }
    private double radius;
    private double PI = Math.PI;
    public double area(){
      return PI*radius*radius;
    }
  }
  static class Triangle extends Shape{
    Triangle (double base, double height){
      this.base = base;
      this.height = height;
    }
    private double base;
    private double height;
    public double area(){
      return (base*height)/2;
    }
  }

  public static void main(String[] args) {
    Shape shape1 = new Rectangle(3,5);
    System.out.println(shape1.area());
    Shape shape2 = new Circle(7);
    System.out.println(shape2.area());
    Shape shape3 = new Triangle(1,2);
    System.out.println(shape3.area());
  }

}

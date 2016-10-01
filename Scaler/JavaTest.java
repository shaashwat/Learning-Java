public class JavaTest {
  static class Point {
    int x;
    int y;
    Point(){
      this(0,0);
    }
    Point(int x, int y){
      this.x = x;
      this.y = y;
    }
    public void scale(){
      x = x/2;
      y = y/2;
    }
    public void print(){
      System.out.println(x + ", " + y);
    }
  }
  public static void main(String[] args) {
    Point p = new Point (6, 8);
    p.scale();
    p.print();
  }
  //Point p = new Point(3, 2);

}

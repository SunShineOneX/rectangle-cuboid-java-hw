public class Rectangle {
  public double width = 0;
  public double length = 0;


  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public double getLength() {
    return length;
  }

  public double getArea() {
    double area = width * length;
    return area;
  }
}
//  public void setWidth(double width) {
//    this.width = width;
//  }
//
//
//  public void setLength(double length) {
//    this.length = length;
//  }
//
//
//  public void getArea() {
//    this.area = width * length;
//  }


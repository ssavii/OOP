import java.util.Scanner;
public class rec {
 private double length;
 private double width;
 private double area;
 private String color;
 public double get_length() {
 return length;
 }
 public double get_wisth() {
 return width;
 }
 public double get_area() {
 this.area = this.length * this.width;
 return area;
 }
 public String get_color() {
 return color;
 }
 public rec(double l, double w, String color) {
 if (l < 0 || w < 0) {
 System.out.println("INVALID \n");
 System.exit(0);
 }
 this.length = l;
 this.width = w;
 this.color = color;
 }
 public String CompareRec(rec b) {
 if ((this.get_area() == b.get_area()) && (this.color.equalsIgnoreCase(b.color))) {
 return "MATCHING RECTANGLES";
 } else
 return "NO MATCH";
 }
 public static void main(String args[]) {
 System.out.println("ENTER THE DETAILS OF FIRST RECTANGLE \n");
 System.out.println("DETAILS OF FIRST \n");
 Scanner sc = new Scanner(System.in); System.out.println("ENTER THE LENGTH \n");
 double length = sc.nextDouble();
 System.out.println("ENTER THE WIDTH \n");
 double width = sc.nextDouble();
 System.out.println("ENTER THE COLOR \n");
 String color = sc.next();
 rec ONE = new rec(length, width, color);
 System.out.println("DETAILS OF SECOND \n");
 System.out.println("ENTER THE LENGTH \n");
 length = sc.nextDouble();
 System.out.println("ENTER THE WIDTH \n");
 width = sc.nextDouble();
 System.out.println("ENTER THE COLOR \n");
 color = sc.next();
 rec TWO = new rec(length, width, color);
 System.out.println("ARE REC EQUAL ? THERE ARE " + ONE.CompareRec(TWO));
 }
}

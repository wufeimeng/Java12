package pack6.subpack1.subsubpack;
 public class CStyle
 {
 public int style;

 public CStyle(int n)
 {
 style=n;
 System.out.println("style"+style);
 }
 }
 
 package pack6.subpack1;
 public class CCircle
 {
 public void show()
 {
 System.out.println("show() method of class CCircle called");
 }
 }
 
 package pack6.subpack2;
 public class CRectangle
 {
 public void show()
 {
 System.out.println("show() method of class CRectangle called");
 }
 }
package pack6;
 import pack6.subpack1.CCircle;
 import pack6.subpack2.CRectangle;
 import pack6.subpack1.subsubpack.CStyle;
 public class Class08
 {
 public static void main(String args[])
 {
 CCircle cir=new CCircle();
 CRectangle rect=new CRectangle();
 CStyle sty=new CStyle(1);
 cir.show();
 rect.show();
 }
 }

package pack9.sub1; 
 public class CSphere
 {
 final static double PI=3.14;
 private double radius;

 public CSphere(double r)
 {
 radius=r;
 }
  public void show()
  {
  double vol=4/3.0*PI*radius*radius*radius;
 
  System.out.print("radius="+radius);
  System.out.println(", volume="+vol);
  }
  }
  
  package pack9.sub2; 
  public class CTrapezoid
  {
	  private int upper;
	  private int base;
	  private int height;
 
  public CTrapezoid(int u,int b,int h)
  {
  upper=u;
  base=b;
  height=h;
  }
  public void show()
  {
  double area=(upper+base)*height/2.0;
  System.out.print("upper="+upper);
  System.out.print(", base="+base);
  System.out.print(", height="+height);
  System.out.println(", area="+area);
  }
  }
  
  package pack9;
  import pack9.sub1.CSphere;
  import pack9.sub2.CTrapezoid; 
 
  public class Class09*
  {
	  public static void main(String args[])
	   {
	   CSphere sp=new CSphere(2);
	   CTrapezoid tra=new CTrapezoid(2,3,4);
	   sp.show();
	   tra.show();
	   }
	  }

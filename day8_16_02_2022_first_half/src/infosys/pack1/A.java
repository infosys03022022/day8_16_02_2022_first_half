package infosys.pack1;

public class A {
  private int privateNum;
  int defaultNum;
  protected int protectedNum;
  public int publicNum;
  
  public void display()
  {
	  System.out.println(privateNum);
	  System.out.println(defaultNum);
	  System.out.println(protectedNum);
	  System.out.println(publicNum);
  }
}

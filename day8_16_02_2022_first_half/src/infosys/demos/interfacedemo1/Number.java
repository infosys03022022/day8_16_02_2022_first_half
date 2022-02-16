package infosys.demos.interfacedemo1;

public class Number implements ICalculator {
  private int num1;
  private int num2;
	@Override
	public int add(int a, int b) {
		num1=a;
		num2=b;
		int sum=a+b;
		return sum;
	}

	// @Override
	public int subtract(int a, int b) {
		num1=a;
		num2=b;
		int subtract=a-b;
		return subtract;
	} 

}

package infosys.demos.interfacedemo2;

public class Number implements ICalculator,ICalculator2 {
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

	@Override
	public int multiply(int a, int b) {
		num1=a;
		num2=b;
		return num1*num2;
	}

	@Override
	public int divide(int a, int b) {
		
		return num1/num2;
	} 

}

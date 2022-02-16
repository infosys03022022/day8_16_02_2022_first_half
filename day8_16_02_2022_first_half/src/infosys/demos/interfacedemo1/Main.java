package infosys.demos.interfacedemo1;

public class Main {

	public static void main(String[] args) {
		// ICalculator calc=new ICalculator();
          ICalculator calc=new Number();
         System.out.println(calc.add(4, 5));
         System.out.println(calc.subtract(5, 1));
         System.out.println(ICalculator.num);
	}

}

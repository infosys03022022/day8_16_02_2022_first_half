package infosys.demos.interfacedemo2;

public class Main {

	public static void main(String[] args) {
		// ICalculator calc=new ICalculator();
          ICalculator calc=new Number();
         System.out.println(calc.add(4, 5));
         System.out.println(calc.subtract(5, 1));
         System.out.println(ICalculator.num);
        // System.out.println(calc.multiply(4,5));
        //The above line is having error because reference 
         // is of ICalculator and ICalculator is not
         // having thr method multiply
         ICalculator2 calc2=new Number();
         System.out.println(calc2.multiply(4,5));
         //System.out.println(calc2.add(4,5));
         //The above line is having error because through ICalculator2
         // we cannot access the multiply method as it is
         // not declared in the ICalculator2
	}

}

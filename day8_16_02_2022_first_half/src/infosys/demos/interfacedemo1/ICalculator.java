package infosys.demos.interfacedemo1;
// Interface methods are with public access 
// In interface variables are public static and final
// as it is final we need to initialise it at the place of the 
// declaration 
public interface ICalculator {
	int num=10;
	int add(int a, int b); // abstract methods
	int subtract(int a, int b); 
}

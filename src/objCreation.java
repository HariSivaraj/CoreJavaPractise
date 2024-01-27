
// First write a business logic using non-public (default) class; then utilize it by creating object of it. 
// To call anyway you need to be created an object - so create an object & write main method for that.


class calculator {
	int add (int x, int y) {
		return x+y;
	}
}


public class objCreation {

	public static void main(String[] args) {
		calculator calc = new calculator();
		int res = calc.add(4, 8);
		System.out.println("res=" + res);

	}
}



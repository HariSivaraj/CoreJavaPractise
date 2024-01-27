package stringOps;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "radar";
		String reverseStr = "";

		char [] str2Array = str.toCharArray();
		
		for (String i : args) {
			System.out.println("each args: "+ i);
		}

		for (char i : str2Array) {
			reverseStr = reverseStr+i;
			System.out.println("reverseStr using for: "+ reverseStr);
		}

		System.out.println("Reverse char of str: "+ reverseStr);

		if (str.equals(reverseStr)) {
			System.out.println("Given text is palindrome " + str);
		}
		else {

			System.out.println("Given text is NOT palindrome " + str + reverseStr);
		}

		// concat bw two strings
		String one, two;
		one = "one1";
		two = "two2";
		System.out.println("one.concat(two)" + one.concat(two));
		System.out.println("two.concat(one)" + two.concat(one));
	}

}

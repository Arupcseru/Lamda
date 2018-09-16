package main;

public class NumericTestRun {

	public static void main(String[] args) {
		NumericTest isEven = (n) -> (n%2) == 0;
		NumericTest isNegetive = (n) -> (n<0);
		MyGreetings greetings = (name) -> "Good Morning " + name;
		
		System.out.println(isEven.computeTest(5));
		System.out.println(isEven.computeTest(12));
		System.out.println(isNegetive.computeTest(5));
		System.out.println(isNegetive.computeTest(-4));
		
		System.out.println(greetings.morningGreetings("Asik"));
		System.out.println(greetings.morningGreetings("Amlan"));
		System.out.println(greetings.morningGreetings("Rose"));
		System.out.println(greetings.morningGreetings("Thomas"));
		System.out.println(greetings.morningGreetings("Students"));
	}

}

package test_Junit;
import org.junit.jupiter.api.*;


public class Hello {
	@DisplayName("My First Testing")
	@Test 
	void print() {
		System.out.println("Hello All");
	}
	@RepeatedTest(2)
	void call()
	{
		welcome();
		int v = Value(2);
		System.out.println("Answer is "+ v);
	}
	void welcome()
	{
		System.out.println("Heyyy..!! this is kaviya here.");
	}
	int Value(int a)
	{
		return (a+5*20);
	}
} 

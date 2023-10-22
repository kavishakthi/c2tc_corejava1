package com.kavs.streamAPI;
import java.util.function.*;

public class PredicateFn {
	public static void main(String[] args) {
		
		// Boolean value in predicate
		Predicate<Integer> pd = num->(num>20);
		System.out.println("Num greater than 20: "+ pd.test(70));
	}
}

package com.kavs.Stream;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		//stream created from set of values
		Stream <Integer> st1 = Stream.of(10,20,42,12,79,64);
		
		//using terminal operation
		st1.forEach(System.out::println);
		
		//stream created from array
		Integer[] values = new Integer[] {10,13,29,11,9};
		Stream <Integer> st2 = Arrays.stream(values);
		System.out.println("Array Values : ");
		st2.forEach(System.out::println);
		
		//System.out.println("Total elements : "+ st1.count());
	}

}

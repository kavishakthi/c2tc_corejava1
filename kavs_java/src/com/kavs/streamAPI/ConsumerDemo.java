package com.kavs.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
	
		//consumerInterface
		List<String> cars = new ArrayList<>();
		cars.add("scorpio");
		cars.add("Xuv 500");
		cars.add("Fortuner");
		
		System.out.println(cars);
		Consumer<String> p = car->System.out.println(car);
		cars.forEach(p);
		}
	
		
}

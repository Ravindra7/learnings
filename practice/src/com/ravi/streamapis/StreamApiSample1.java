package com.ravi.streamapis;

import java.util.Arrays;
import java.util.Collection;

public class StreamApiSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> collection = Arrays.asList("value1", "value2", "value3");
		
		collection.stream().forEach(System.out::println);
		
	}

}

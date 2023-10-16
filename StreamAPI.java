package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
      
		List<Integer> nums= Arrays.asList(2,5,1,8,7);
		 nums.stream()
		        .filter(n ->n%2==1)
		        .map(n -> n*2)
		        .sorted()
		        .forEach(n ->System.out.println(n) );
		/*for (Integer integer : nums) {
			System.out.println(integer);}*/
		
		
	}

}

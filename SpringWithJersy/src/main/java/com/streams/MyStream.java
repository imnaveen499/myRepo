package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStream {

	
	
	
	public static void main(String[] args) {
		
		int xx[]=new int[]{1,5,7,5};
		
		ArrayList< Integer> list=new ArrayList<>();
		
		list.add(222);list.add(12);list.add(5);list.add(1);list.add(10);
		
		
	 Stream.of(1,2,3,4).filter(values->values>=3).map(nnn->nnn+nnn).forEach(values->System.out.println(values));;
		
		
	 
	 List<Integer> number = Arrays.asList(2,3,4,5);
	 
	    List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
	    System.out.println(square);
	    Arrays.stream(xx).filter(predicate->predicate>=4).map(nnn->nnn+nnn).forEach(values->System.out.println(values));
	    
	 
	    
	    Arrays.asList("a1", "a2", "a3");
	    list.stream()
	    .findFirst()
	    .ifPresent(System.out::println);
	    
	    
	    IntStream.range(1, 9)
	    .forEach(System.out::println);

	    Arrays.stream(new int[] {1, 2, 3})
	    .map(n -> 2 * n + 1)
	    .average()
	    .ifPresent(System.out::println);  // 5.0
	    
	    Stream<Integer> of = Stream.of(1,2,3,4);
	    
	    
	    Stream.of("a11", "a2", "a3")
	    .map(s -> s.substring(1))
	    .mapToInt(Integer::parseInt)
	    .max()
	    .ifPresent(System.out::println);  // 3
	    
	}

}
			
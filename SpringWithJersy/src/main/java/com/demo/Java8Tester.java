package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Tester {

   
   public static void main(String args[]) {
   
	   
	   List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	   List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
	   
	   System.out.println(strings.size());
	   
	   strings.forEach(System.out::println);
	   
	   long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
System.out.println(count+"  @@@@@@@@@@  "+filtered);

//with type declaration
	   
   }
	
   
}
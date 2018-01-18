package com.defaultMethodAndLambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.Employee;

public class ObjectComparingUsingLambdaExpression {

	public static void main(String[] args) {

		
		
		List<Employee> lst=new ArrayList<Employee>();
		
		lst.add(new Employee("123","nisum"));
		lst.add(new Employee("456","ibm"));
		lst.add(new Employee("789","tcs"));
		
		Collections.sort(lst,(p1,p2)->{  
	        return p1.empId.compareTo(p2.empId);  
	        });  
	        for(Employee p:lst){  
	            System.out.println(p.empId+" "+p.empName);  
	        }  
		
	}

}

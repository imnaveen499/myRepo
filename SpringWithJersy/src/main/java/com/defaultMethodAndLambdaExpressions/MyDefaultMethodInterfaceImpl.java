package com.defaultMethodAndLambdaExpressions;

interface MyDefaultMethodInterface{

	
	public void square(int a);
	
	default int show(int a){
		System.out.println("DEFAULT Method EXECUTED"+"---  "+a*a);
		return a;
	}
	
}
public class MyDefaultMethodInterfaceImpl implements MyDefaultMethodInterface{
	
	@Override
	public void square(int a) {
		System.out.println("OVERRIDDEN Method"+" ---   "+a*a);		
	}

	public static void main(String[] args) {
		
		MyDefaultMethodInterface def=new MyDefaultMethodInterfaceImpl();
		def.square(5);
		def.show(6);
		
	}

	
	
}
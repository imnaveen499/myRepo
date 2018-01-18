package com.defaultMethodAndLambdaExpressions;

@FunctionalInterface  //It is optional
interface MyLambdaInterface{
	
	 void calculate(int z);
	
	 	//void k();
}




public class Lambda {

		/*	@Override
			public int calculate(int z) {
				// TODO Auto-generated method stub
				return 0;
			}
		*/	
	
	public static void main(String[] args) {
		
	
		MyLambdaInterface lambd= x->{
			System.out.println(x*5);
		};
		lambd.calculate(8);
	}

	
	
}

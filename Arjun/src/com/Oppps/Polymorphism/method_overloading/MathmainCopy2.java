package com.Oppps.Polymorphism.method_overloading;

public class MathmainCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathCopy2 mathcopy2 =new MathCopy2();
     	int result= mathcopy2.add(10 ,2);
     	System.out.println("addition is "+result);
     	int res= mathcopy2.add(10 ,2,30);
     	System.out.println("addition is "+res);
	}

}

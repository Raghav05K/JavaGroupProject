package Interface_Impl;

import Interface_in.Calculator;

public class Calculator_Impl implements Calculator{

	@Override
	public int sum(int a, int b) {
		int sum = a+b;
		return sum;
	}

	@Override
	public int mul(int x, int y) {
		int mul =x*y;
		return mul;
	}

	
}

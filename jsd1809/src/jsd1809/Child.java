package jsd1809;

class A {
	protected int method(int a, int b) {
		return 0;
	}
}

class B extends A {
	// @Override
	// protected int method(int a, int b) {
	// // TODO Auto-generated method stub
	// return super.method(a, b);
	// }
	protected int method(int a, int b) {
		return 0;
	}
	private int method(int a, long b) {
		return 0;
	}
}
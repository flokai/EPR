package B;

import A.A;

public class B extends A {

//	protected int x = 10;
//	private double y = 10;
//	
//	public B (int x) {
//		super(x);
//		y += 1.50;
//	}
//
//	public void k (int x) {
//		System.out.println(x-1);
//	}
//	
//	public void k (double x){
//		System.out.println(x-2);
//		this.x = (int) (x*x);
//	}
//	
//	public void f () {
//		System.out.println("voll");
//	}
//
	public static void main (String [] args) {
		
//		B test2 = new B(3);
//		System.out.println(A.x);		// Nummer 6
//		System.out.println(C.x);		// Nummer 7
//		System.out.println(y);			// Nummer 8
//		System.out.println(C.z);		// Nummer 9
//		
//		test2.k(8.0);					// Nummer 10
//		test2.f();
//		
//		System.out.println(A.x);		// Nummer 11
//		System.out.println(x);			// Nummer 12
//	
//		A test3 = new A(6);
//		
//		test3.f();						// Nummer 13
	
	A a = new A();
	B b = new B();
	A a2 = new B();
	
	a.überschreiben();
	b.überschreiben();
	a2.überschreiben();
//	a=a2;
//	a.überschreiben();
	
	b.überladen(3);
	a2.überladen(3);
	
	}
	
//	public void print(){
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//	}
	
	
	public void überschreiben (){
		System.out.println("Methode aus Klasse B");
		
	}
	
	public void überladen (int eins){
		System.out.println("überladen 1B");	
	}
	
	public void überladen (int eins, int zwei){
		System.out.println("überladen 2");	
	}
	
	public void überladen (int eins, int zwei, int drei){
		System.out.println("überladen 3");	
	}

}


public class MyInteger {

	public static class A {
		A() {System.out.println("AAA");}
		A(int i) {System.out.print("AAAa");}
		public void method() {
			System.out.print("Main");
		}
	}

	public static class B extends A {
		B() {System.out.println("BBB");}
		B(int i) {System.out.println("BBBb");}
		public void method() {
			System.out.print("Sub");
		}
	}

	public static class C extends B {
		C() {System.out.println("CCC");}
	}


	public static void main(String[] args) {
		// A obj = new A();
		// B ob = new B();
		// C o = new C();
		// obj.method();
		// B obj = new B();
		// A ob = obj;
		// A o = new C(5);
		// ob = (A)obj;
		// System.out.println(o instanceof C);

	}
}

// obj >>> B:
// ob >>> C:

// output:
// "AAA"
// "BBB"
// "AAA"
// "BBB"
// "CCC"

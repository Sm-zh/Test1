class Base {
    public Base() {
        m2();
    }

    public  void m1() {
        System.out.println("1");
    }

    public void m2() {
        System.out.println("2");
    }

}

    class Derived extends Base {
        public Derived() {
            super();
        }

        public  void m1() {
            System.out.println("10");
        }

        public void m2() {
            System.out.println("3");
        }
    }

   public class MidQ1A {
    public static void main(String[] args) {
        Base c = new Derived();
        c.m1();
        new Derived();
    }
   }
   
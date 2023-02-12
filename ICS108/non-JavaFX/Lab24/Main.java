package Lab24;

public class Main {
    public static void main(String[] args) {
        GenericStack<String> aList = new GenericStack<>();
        aList.add("X");
        aList.add("Y");
        aList.add("Z");
        System.out.println(aList.remove());
        System.out.println(aList.remove());
        System.out.println(aList.remove());
        System.out.println(aList.remove());
    }
    
}

package Lab2;
public class TestClass {
    public static void main(String[] args) {
        SLL<Integer> numbers = new SLL<>();
        numbers.addToTail(7);
        numbers.addToTail(5);
        numbers.addToTail(3);
        numbers.addToTail(50);
        numbers.addToTail(7);
        numbers.addToTail(9);
        System.out.println("Original Integer array: " + numbers);
        numbers.insertBefore(4, 20);
        System.out.println("After inserting 20 before index 4: " + numbers);
        numbers.delete(4);
        System.out.println("Element deleted from index 4: 20");
        System.out.println("After deleting element from index 4: " + numbers);
        numbers.insertAfterSecondOccurrence(30, 7);;
        System.out.println("After inserting 30 after the second occurence of 7: " + numbers);
    }
    
}

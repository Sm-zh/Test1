package Lab3;
public class DLLTest {
	public static void main(String[] args) {
		DLL<String> test = new DLL<String>();
		for(int i = 0; i < 5; i++)
			test.addToTail("a" + i);
		System.out.print("Initiall list: ");
		test.printAll();
		System.out.print("reversed list: ");
		test.printReverse();
		System.out.print("After deleting 7th element until the end: \n");
		test.delete7();
		DLL<Integer> list1 = new DLL<Integer>();
		DLL<Integer> list2 = new DLL<Integer>();
		for(int i = 1; i < 5; i++) {
			list1.addToTail(i);
			list2.addToTail(i+4);
		}
		System.out.println("list1: ");
		list1.printAll();
		System.out.println("list2: ");
		list2.printAll();
		System.out.println("avter invocate the two lists: ");
		list1.insertAlternate(list2);
	}
}
package Lab3;
//****************************  DLL.java  *******************************
//                  generic doubly linked list class

public class DLL<T> {
    private DLLNode<T> head, tail;
    public DLL() {
        head = tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void setToNull() {
        head = tail = null;
    }
    public T firstEl() {
        if (head != null)
             return head.info;
        else return null;
    }
    public void addToHead(T el) {
        if (head != null) {
             head = new DLLNode<T>(el,head,null);
             head.next.prev = head;
        }
        else head = tail = new DLLNode<T>(el);
    }
    public void addToTail(T el) {
        if (tail != null) {
             tail = new DLLNode<T>(el,null,tail);
             tail.prev.next = tail;
        }
        else head = tail = new DLLNode<T>(el);
    }
    public T deleteFromHead() {
        if (isEmpty()) 
             return null;
        T el = head.info;
        if (head == tail)   // if only one node on the list;
             head = tail = null;
        else {              // if more than one node in the list;
             head = head.next;
             head.prev = null;
        }
        return el;
    }
    public T deleteFromTail() {
        if (isEmpty()) 
             return null;
        T el = tail.info;
        if (head == tail)   // if only one node on the list;
             head = tail = null;
        else {              // if more than one node in the list;
             tail = tail.prev;
             tail.next = null;
        }
        return el;
    }
    public void printAll() { 
        for (DLLNode<T> tmp = head; tmp != null; tmp = tmp.next)
             System.out.print(tmp.info + " ");
        System.out.println();
    }
    public T find(T el) {
        DLLNode<T> tmp;
        for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next);
        if (tmp == null)
             return null;
        else return tmp.info;
    }

    public void printReverse() {
        if (isEmpty())  
            System.out.println("[]");
        else {
            DLLNode<T> tmp = tail;  //Start for the last element 
            System.out.print("[");
            while (tmp != head) {
                System.out.print(tmp.info + " ");
                tmp = tmp.prev; //Go back one element
            }
            System.out.println(tmp.info + "]");

        }
    }

    public void delete7() {
        if (isEmpty())      
            System.out.println("g");
        else {
            DLLNode<T> tmp = head;
            int count = 0;
            boolean reverse = false;    //a condition to check if we reach the end to revers the order
            boolean found = false;  //a condition to check if the 7th element has been reached
            while (!isEmpty()) {
                if (tmp.next == null && tmp.prev == null) { //if the list has one elemet left 
                    head = null;
                    tail = null;
                    found = true;
                }
                if (count == 6) {   //if the 7th elemnt has found 
                    if (tmp == tail) { 
                        tail = tmp.prev;
                        tmp.prev.next = null;
                    }
                    else if (tmp == head ){
                        head = tmp.next;
                        tmp.next.prev = null;
                    }

                    else {
                        tmp.next.prev = tmp.prev;
                        tmp.prev.next = tmp.next;
                    }
                        
                    found = true;
                }
                if (reverse) {  
                    if (tmp == head)
                        tmp = tail;
                    else
                        tmp = tmp.prev;
                }
                else {
                    tmp = tmp.next;
                }
                if (tmp == tail)    //if we reach the last elemnt reverse the order
                    reverse = true;
                if (tmp == head)
                    reverse = false;    //if we reach the first elemnt
                count++;
                if (found) {
                    System.out.print("[ ");
                    for (tmp = head; tmp != null; tmp = tmp.next)
                        System.out.print(tmp.info + " ");
                    System.out.println("]");
                    tmp = head;
                    count = 0;
                    found = false;
                    reverse = false;
                }
            }
            
        }
    }

    public void insertAlternate(DLL<T> newList) {
        boolean equal = true;
        DLLNode<T> tmp1 = head;
        DLLNode<T> tmp2 = newList.head;
        while (true) {
            if ((tmp1.next == null && tmp2.next != null) || (tmp1.next != null && tmp2.next == null)) { //if we found that one elemnet is references to null where the other is not, the lists are not equal
                equal = false;
                break;
            }
            else if (tmp1.next != null && tmp2.next != null ) { //while we did not reach to the tail for both lists
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
            }
            else //we reach the tail for both lists
                break;
        }
        if (!equal)
            System.out.println("The size of each list are not equal.");
        else {
            tmp1 = head;
            tmp2 = newList.head;
            DLL<T> invocatedList = new DLL<T>();
            while (tmp1.next != null) {
                invocatedList.addToTail(tmp1.info);
                invocatedList.addToTail(tmp2.info);
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
            }
            invocatedList.addToTail(tmp1.info);
            invocatedList.addToTail(tmp2.info);
            invocatedList.printAll();
        }
        
    }
}
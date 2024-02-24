/**
 * Stack
 */
public class Stack {
    public static class Node{
        int data;
        Node next;
        private Node(int data) {
            this.data = data;
        }
    }

    Node top;

    //Peek
    int peek(){
        if(top == null) return 0; //ToDo: add Exception
        return top.data;
    }
    //isEmpty
    boolean isEmpty() {
        return top == null;
    }
    
    //Push : Add data
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    //Pop : Remove Data
    int pop() {
        if(top == null) return 0;//ToDo: add Exception
        top = top.next;
        return top.data;   
    }

    //Print all stack
    void printAllStack(){
        while (true) {
            Node traverser = top;
            System.out.println(traverser.data);
            traverser = traverser.next;
        }
    }

}
package assignment9.prob2;

public class LinkedListStack {
    class Node {
        Object data;
        Node next;
    }

    private Node head;
    public int top;

    LinkedListStack() {
        head = new Node();
        top = -1;
    }

    public void push(Object item) {
        Node newNode = new Node();
        newNode.data = item;
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        top++;
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Node previousNode = head;
        Node currentNode = previousNode.next;
        while (currentNode.next != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = null;
        top--;
        return currentNode;
    }

    public Object peek() {
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.print(currentNode.data + " ");
        }
        System.out.println();
    }

    public void getPeak() {
        Node node = (Node) peek();
        System.out.println("Peak: " + node.data);
    }

    public static void main(String[] args) {
        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push("A");
        linkedListStack.push("B");
        linkedListStack.push("C");
        linkedListStack.push("D");
        linkedListStack.display();
        System.out.println("Size: " + linkedListStack.size());
        linkedListStack.getPeak();
        linkedListStack.pop();
        linkedListStack.display();
        System.out.println("Size: " + linkedListStack.size());
        linkedListStack.getPeak();
        linkedListStack.push("E");
        linkedListStack.push("F");
        linkedListStack.display();
        System.out.println("Size: " + linkedListStack.size());
        linkedListStack.getPeak();
    }
}




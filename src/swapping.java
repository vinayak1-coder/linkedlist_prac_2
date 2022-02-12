//Swapping Nodes in a Linked List


public class swapping {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void swapNodes(int x, int y)
    {
        if (x == y)
            return;
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }
        if (currX == null || currY == null)
            return;
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;
        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
    public void push(int newest)
    {
        Node newNode = new Node(newest);
        newNode.next = head;
        head = newNode;
    }
    public void printList()
    {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }
    public static void main(String[] args)
    {
        swapping l = new swapping();
        l.push(7);
        l.push(6);
        l.push(5);
        l.push(4);
        l.push(3);
        l.push(2);
        l.push(1);

        System.out.print("Linked list before swap ");
        l.printList();

        l.swapNodes(4, 3);

        System.out.print(" \nLinked list after swap");
        l.printList();
    }


}

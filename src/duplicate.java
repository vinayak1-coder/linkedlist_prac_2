public class duplicate {
    Node head;
    class Node{
        int element;
        Node next;
        public Node(int e){
            element = e;
            next = null;
        }

    }
    public void removedup(){
        Node curr=head;
        while(curr!=null){
            Node temp=curr;
            while (temp != null && temp.element == curr.element){
                temp=temp.next;
            }
            curr.next=temp;
            curr=curr.next;
        }
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.element+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        duplicate d = new duplicate();
        d.push(20);
        d.push(13);
        d.push(13);
        d.push(11);
        d.push(11);
        d.push(11);

        System.out.println("List before removal of duplicates");
        d.printList();

        d.removedup();
        System.out.println("List after removal of elements");
        d.printList();
    }

}

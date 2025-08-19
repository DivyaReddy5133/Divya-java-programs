public class linkedlist{
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static void traverse()
    {
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.data+"------>");
            current = current.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args){
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        traverse();
        System.out.println("\n" +third);
        System.out.println("\n" +third.next);
        System.out.println("\n" +third.data);
    }
}
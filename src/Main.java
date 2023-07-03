public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //creating node n1 and passing data 10 to the node
        node n1=new node(10);
        node n2=new node (20);
        node n3= new node (30);
        //here we have created three nodes and initialized the data to it
        //Linking the nodes
        node head=n1;// Basically we name the first node as head and we use it as a pointer
        head.next=n2;
        n2.next=n3;
        n3.next=null;
        TraverseThroughoutTheLinkedlist.traverse(head);
    }
}
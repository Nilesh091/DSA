public class TraverseThroughoutTheLinkedlist {
    static void traverse(node head){
        node cur=head;
        while (cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }

    public static void main(String[] args) {

    }

}

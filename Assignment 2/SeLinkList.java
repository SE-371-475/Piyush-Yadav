
/**
 * SeLinkList
 */
public class SeLinkList {
    public class Node {
    public int data;
    public Node nxt;
    Node(int value){
         this.data = value; 
    }
    public Node(int val,Node nxt) { 
        this.data = val; 
        this.nxt = nxt; 
    }   
    }
    public static void main(String[] args) {
        SeLinkList LL=new SeLinkList();
        SeLinkList.Node head=LL.new Node(1);
        head.nxt=new SeLinkList().new Node(3);
        head.nxt.nxt=new SeLinkList().new Node(6);
        head.nxt.nxt.nxt=new SeLinkList().new Node(2);
        head.nxt.nxt.nxt.nxt=new SeLinkList().new Node(5);
        SeLinkList.Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.nxt;
        }
        
    }
}
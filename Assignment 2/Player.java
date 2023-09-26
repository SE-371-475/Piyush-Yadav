import java.util.Scanner;

public class Player {
    public int numPlayers;
    public SeLinkList head;
    public Player(int p){
        this.numPlayers=p;
        this.head=null;
    }
     public void addPlayer(int p1,int p2,int p3,int i) {
        SeLinkList LL=new SeLinkList(p1,p2,p3,i);
        LL.next=head;
        if(head!=null) head.prev=LL;
        head=LL;
        numPlayers=numPlayers+1;
    }

    public void removeNode(int i){
        if(head==null){
            System.out.println("It is an empty linked list");
            return;
        }
        SeLinkList ptr=head;
        while( ptr.index!=i && ptr!=null ) ptr=ptr.next;

        if(ptr==null){
            System.out.println("Index"+i+" not found.");
            return;
        }
        if(ptr.prev==null){
            head=ptr.next;
            if(head!=null) head.prev = null;
        } 
        else ptr.prev.next=ptr.next;
        if(ptr.next!=null) ptr.next.prev=ptr.prev;
         numPlayers=numPlayers-1;
    }

    public void findMaxWeight(){
        if(head==null){
            System.out.println("Empty linked list");
            return;
        }
        SeLinkList ptr=head.next,node=head;
        int Maxi=head.a+head.b+head.c;
        while(ptr!=null) {
            if(Maxi<(ptr.a+ptr.b+ptr.c)) {
                Maxi=ptr.a+ptr.b+ptr.c;
                node=ptr;
            }
            ptr = ptr.next;
        }

        System.out.println("Nodes are: Index="+node.index+" a="+node.a+" b="+node.b+" c=" + node.c);
        System.out.println("and Maximum Weight is: " + Maxi);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Task9");
        Player P=new Player(0);
        P.addPlayer (4,7,5,0);
        P.addPlayer(3,6,14,1);
        P.addPlayer(1,11,0,2);
        P.addPlayer(82,11,7,3);
        P.addPlayer(12,11,67,4);
        SeLinkList ptr =P.head;
        System.out.println("Overall number of players is:"+P.numPlayers);
        while(ptr!=null) {
            System.out.println("Index is " + ptr.index+", a is "+ptr.a+", b is "+ptr.b+" and c is "+ptr.c);            
            ptr= ptr.next;
        }
        P.findMaxWeight();
        System.out.println("Task12");
        System.out.println("Enter the node you wanna delete");
        int n=sc.nextInt();
        if(n>P.numPlayers){
            System.out.println("There is not such index in the list");
            return;
        }
        P.removeNode(n-1);
        ptr=P.head;
        System.out.println("now there are: "+P.numPlayers+" players overall");
        while(ptr!=null){
            System.out.println("a is "+ptr.a+", b is "+ptr.b +" and c is " + ptr.c);
            ptr=ptr.next;
        }
    }
}

import java.util.Scanner;

public class Player {
    public int numPlayers;
    public SeLinkList head;
    public Player(int p){
        this.numPlayers=p;
        this.head=null;
    }
    public void addPlayer(int p1, int p2, int p3) {
        SeLinkList LL = new SeLinkList(p1, p2, p3, numPlayers);
        LL.next = head;
        head = LL;
        numPlayers = numPlayers + 1;
    }

    public void removeNode(int i){
        if(head==null){
            System.out.println("Empty linked list");
            return;
        }
        if(i==0){
            numPlayers=numPlayers-1;
            head=head.next;
            return;
        }
        int curInd = 0;
        SeLinkList ptr=head;
        while(curInd<i-1 && ptr!=null){
            curInd=curInd+1;
            ptr=ptr.next;
        }
        if( ptr.next==null || ptr==null ){
            System.out.println("Index"+i+" not found.");
            return;
        }
        numPlayers=numPlayers-1;
        ptr.next=ptr.next.next;
    }
    public SeLinkList[] findMinMaxWeight() {
        if(head==null){
            System.out.println("Empty linked list");
            return null;
        }

        SeLinkList ptr=head.next,maxNode=head,minNode=head;
        int mini=head.a+head.b+head.c;
        int Maxi=mini;
        while(ptr!=null){
            int w=ptr.a+ptr.b+ptr.c;
            if(w>Maxi){
                Maxi=w;
                maxNode=ptr;
            }
            if(w<mini){
                minNode=ptr;
                mini=w;
            }
            ptr=ptr.next;
        }
        System.out.println("Minimum weight is: "+mini);
        System.out.println("Maximum weight is: "+Maxi);

        SeLinkList[] res={minNode,maxNode};
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Task9");
        Player P=new Player(0);
        P.addPlayer(4,7,5);
        P.addPlayer(3,6,14);
        P.addPlayer(1,1,0);
        SeLinkList ptr=P.head;
        System.out.println("The number of players is:"+P.numPlayers);
        while(ptr!=null){
            System.out.println("Index is "+ptr.index+", a is "+ptr.a+", b is "+ptr.b+" and c is "+ptr.c);            
            ptr=ptr.next;
        }
        SeLinkList[] minMaxPair=P.findMinMaxWeight();
        System.out.println("Max Node: Index="+minMaxPair[1].index+" a="+minMaxPair[1].a+" b="+minMaxPair[1].b+" c=" + minMaxPair[1].c);
        System.out.println("Min Node: Index="+minMaxPair[0].index+" a="+minMaxPair[0].a+" b="+minMaxPair[0].b+" c=" + minMaxPair[0].c);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index to remove");
        int index=sc.nextInt();
        if(index>P.numPlayers){
            System.out.println("Index not found");
            return;
        }
        P.removeNode(index);
        ptr=P.head;
        System.out.println("After removing index "+index+", there are: "+P.numPlayers+" players overall");
        while(ptr!=null){
            System.out.println("a is "+ptr.a+", b is "+ptr.b+" and c is "+ptr.c);
            ptr=ptr.next;
        }
    }
}
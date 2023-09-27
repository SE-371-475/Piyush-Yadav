
// import java.util.*;


public class Player {
    public int numPlayers,i=0;
    public SeLinkList head;
    public Player(int p){
        this.numPlayers=p;
        this.head=null;

    }
    // Adding comments to remove conflicts while merging
    
    // public void addPlayer(int p1, int p2, int p3) {
    //     SeLinkList LL=new SeLinkList(p1,p2,p3,numPlayers);
    //     LL.next=head;
    //     head=LL;
    //     numPlayers=numPlayers+1;
    // }
    public void updateIndexes(){
        int index=0;
        SeLinkList ptr=head;
        while(ptr!=null){
            ptr.index=index;
            index=index+1;
            ptr=ptr.next;
        }
    }
    public boolean removeNode(int i) {
        if(head==null){
            System.out.println("Empty linked list");
            return false;
        }
        if(i==0){
            head=head.next;
            if(head!=null) head.prev=null;
            updateIndexes();
            numPlayers=numPlayers-1;
            return true;
        }
        int curInd=0;
        SeLinkList ptr=head;
        while(curInd!=i && ptr!=null){
            curInd=curInd+1;
            ptr=ptr.next;
        }
        if(ptr==null){
            System.out.println("Index "+i+" not found.");
            return false;
        }
        if(ptr.prev!=null) ptr.prev.next=ptr.next;
        if(ptr.next!=null) ptr.next.prev=ptr.prev;
        numPlayers=numPlayers-1;
        updateIndexes();
        return true;
    }

     public void addPlayer(int p1,int p2,int p3,int i) {
        SeLinkList LL=new SeLinkList(p1,p2,p3,i);
        LL.next=head;
        if(head!=null) head.prev=LL;
        head=LL;
        numPlayers=numPlayers+1;
    }

    public SeLinkList[] findMinMaxWeight() {
        if(head==null){
            System.out.println("Empty linked list");
            return null;
        }

        SeLinkList ptr=head.next,maxWeightNode=head,minWeightNode=head;
        int mini=head.a+head.b+head.c;
        int Maxi=mini;
        while(ptr!=null){
            int w=ptr.a+ptr.b+ptr.c;
            if(w>Maxi){
                Maxi=w;
                maxWeightNode=ptr;
            }
            if(w<mini){
                minWeightNode=ptr;
                mini=w;
            }
            ptr=ptr.next;
        }
        System.out.println("Minimum weight is: "+mini);
        System.out.println("Maximum weight is: "+Maxi);

        SeLinkList[] res={minWeightNode,maxWeightNode};
        return res;
    }

    public static void main(String[] args) {
        Player P=new Player(0);
        P.addPlayer(4,7,5,0);
        P.addPlayer(3,6,14,1);
        P.addPlayer(4, 11, 0 ,2);
        P.addPlayer(1,1,0,3);
        P.addPlayer(14, 9, 21,4 );
        P.addPlayer(14, 20, 3,5);
        SeLinkList ptr=P.head;
        System.out.println("The number of players is:"+P.numPlayers);
        while(ptr!=null){
            System.out.println("Index is "+ptr.index+", a is "+ptr.a+", b is "+ptr.b+" and c is "+ptr.c);            
            ptr=ptr.next;
        }
        SeLinkList[] res=P.findMinMaxWeight();
        System.out.println("Min Node: Index="+res[0].index+" a="+res[0].a+" b="+res[0].b+" c=" + res[0].c);
        System.out.println("Max Node: Index="+res[1].index+" a="+res[1].a+" b="+res[1].b+" c=" + res[1].c);

        //commented to resolve conflicts, This is the code of the previous tasks of the assignment

        // SeLinkList[] minMaxPair=P.findMinMaxWeight();
        // System.out.println("Min Node: Index="+minMaxPair[0].index+", a="+minMaxPair[0].a+", b="+minMaxPair[0].b+", c=" + minMaxPair[0].c);
        // System.out.println("Max Node: Index="+minMaxPair[1].index+", a="+minMaxPair[1].a+", b="+minMaxPair[1].b+", c=" + minMaxPair[1].c);
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter index to remove");
        // int index=sc.nextInt();
        // sc.close();
        // if(index>P.numPlayers){
        //     System.out.println("Index not found");
        //     return;
        // }
        // boolean flag=P.removeNode(index);
        // if(flag==false) return ;
        // ptr=P.head;
        // System.out.println("After removing index "+index+", there are: "+P.numPlayers+" players overall");
        // while(ptr!=null){
        //     System.out.println("Index is "+(P.numPlayers-1-ptr.index)+", a is "+ptr.a+", b is "+ptr.b+" and c is "+ptr.c);
        //     ptr=ptr.next;
        // }
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Task9");
        // Player P=new Player(0);
        // P.addPlayer (4,7,5,0);
        // P.addPlayer(3,6,14,1);
        // P.addPlayer(1,11,0,2);
        // P.addPlayer(82,11,7,3);
        // P.addPlayer(12,11,67,4);
        // SeLinkList ptr =P.head;
        // System.out.println("Overall number of players is:"+P.numPlayers);
        // while(ptr!=null) {
        //     System.out.println("Index is " + ptr.index+", a is "+ptr.a+", b is "+ptr.b+" and c is "+ptr.c);            
        //     ptr= ptr.next;
        // }
        // P.findMaxWeight();
        // System.out.println("Task12");
        // System.out.println("Enter the node you wanna delete");
        // int n=sc.nextInt();
        // if(n>P.numPlayers){
        //     System.out.println("There is not such index in the list");
        //     return;
        // }
        // P.removeNode(n-1);
        // ptr=P.head;
        // System.out.println("now there are: "+P.numPlayers+" players overall");
        // while(ptr!=null){
        //     System.out.println("a is "+ptr.a+", b is "+ptr.b +" and c is " + ptr.c);
        //     ptr=ptr.next;
        // }

    }
}

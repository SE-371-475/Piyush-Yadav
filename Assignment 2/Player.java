public class Player {
    public int numPlayers;
    public SeLinkList head;
    public Player(int p) {
        this.numPlayers = p;
        this.head = null; 

    }
    public void addPlayer(int p1,int p2,int p3){

        SeLinkList LL=new SeLinkList(p1,p2,p3);
        LL.next=head;
        head=LL; 
    }

    public static void main(String[] args) {
        Player P=new Player(5);
        P.addPlayer (4, 7, 5);
        P.addPlayer(3, 6, 14 );
        P.addPlayer(1, 11, 0 );
        SeLinkList ptr =P.head;
        System.out.println("The number of players is:"+P.numPlayers);
        System.out.println("And the Data is:");
        while(ptr!=null) {
            System.out.println(ptr.a+" "+ptr.b+" "+ptr.c);
            ptr= ptr.next;
        }
    }
}

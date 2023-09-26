public class Player {
    public int numPlayers;
    public SeLinkList head;
    public Player(int p) {
        this.numPlayers = p;
        this.head = null; 

    }
    public void addPlayer(int p1,int p2,int p3){

        SeLinkList LL=new SeLinkList(p1,p2,p3,numPlayers);
        LL.next=head;
        head=LL; 
        numPlayers=numPlayers+1;
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
        // System.out.println("Task4");
        // PlayerData data=new PlayerData();
        // PlayerData[] myData=data.getMyData();
        // System.out.println("The number of players is: "+myData.length);
        // System.out.println("And the Data is:");
        // for(PlayerData i : myData) {
        //     System.out.println("A:"+i.a+"B:"+i.b+"C:"+i.c);
        // }
        System.out.println("Task9");
        Player P=new Player(5);
        P.addPlayer (4, 7, 5);
        P.addPlayer(3, 6, 14 );
        P.addPlayer(1, 11, 0 );
        SeLinkList ptr =P.head;
        System.out.println("The number of players is:"+P.numPlayers);
        while(ptr!=null) {
            System.out.println("Index is " + ptr.index+", a is "+ptr.a+", b is "+ptr.b+" and c is "+ptr.c);            
            ptr= ptr.next;
        }
        P.findMaxWeight();
    }
}
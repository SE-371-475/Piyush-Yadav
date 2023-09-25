public class Player {
    public int numPlayers;
    public SeLinkList head;
    public Player(int p) {
        this.numPlayers = p;
        this.head = null; 

    }
    public void initializeList(PlayerData[] a) {
        for (PlayerData data:a) {
            addPlayer(data.a, data.b, data.c);
        }
    }
    public void addPlayer(int p1,int p2,int p3){

        SeLinkList LL=new SeLinkList(p1,p2,p3);
        LL.next=head;
        head=LL; 
    }

    public static void main(String[] args) {
        PlayerData data=new PlayerData();
        PlayerData[] myData=data.getMyData();
        System.out.println("The number of players is: "+myData.length);
        System.out.println("And the Data is:");
        for(PlayerData i : myData) {
            System.out.println("A:"+i.a+"B:"+i.b+"C:"+i.c);
        }
        Player p = new Player(5);
        p.initializeList(myData);
        SeLinkList ptr= p.head;
        System.out.println("The number of players is: "+p.numPlayers);
        System.out.println("And the Data is:");
        while(ptr!=null) {
            System.out.println(ptr.a+" "+ptr.b+" "+ptr.c);
            ptr=ptr.next;
        }
        
    }
}

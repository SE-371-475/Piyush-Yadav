public class Player {
    public int numPlayers;
    public Player(int p) {
        this.numPlayers = p;
    }

    public static void main(String[] args) {
        PlayerData data=new PlayerData();
        PlayerData[] myData=data.getMyData();
        System.out.println("The number of players is: "+myData.length);
        System.out.println("And the Data is:");
        for(PlayerData i : myData) {
            System.out.println("A:"+i.a+"B:"+i.b+"C:"+i.c);
        }
    }
}

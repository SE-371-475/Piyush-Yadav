public class Player {
    public int numPlayers;
    public Player(int p) {
        this.numPlayers=p;
    }
    public static void main(String[] args) {
        Player p=new Player(5);
        System.out.println("The number players is:"+p.numPlayers);
    }
}

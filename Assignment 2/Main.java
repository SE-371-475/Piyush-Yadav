public class Main {
    public static void main(String[] args) {
        System.out.println("Assignment Task 1");

        // Instantiate Player
        Player player = new Player(0);

        // InitializeList()
        player.addPlayer(4, 7, 5);
        player.addPlayer(3, 6, 14);
        player.addPlayer(1, 11, 0);

        for (int i = 0; i < 3; i++) {
            // Find Min and Max weights and print out the Max and Min nodes.
            SeLinkList[] minMaxPair = player.findMinMaxWeight();
            System.out.println("Min Node: Index=" + minMaxPair[0].index + " a=" + minMaxPair[0].a + " b=" + minMaxPair[0].b + " c=" + minMaxPair[0].c);
            System.out.println("Max Node: Index=" + minMaxPair[1].index + " a=" + minMaxPair[1].a + " b=" + minMaxPair[1].b + " c=" + minMaxPair[1].c);

            // Remove Max and Min nodes.
            player.removeNode(minMaxPair[0].index);
            player.removeNode(minMaxPair[1].index);

            System.out.println("[Done!]");
        }
    }
}

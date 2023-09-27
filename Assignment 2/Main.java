import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[Piyush Yadav - Git Assignment]");
        Player P = new Player(0);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes that you want to add in the Linked list: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter value "+(i+1)+" in [a b c] format:"); 
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            P.addPlayer(a, b, c,n-i-1);
        }
        sc.close();
        for(int i=0;i<3;i++){
            System.out.println("Pass "+(i+1)+":");
            if(P.numPlayers==0){
                System.out.println("Not any node remaining to find minMaxWeights!!");
                return;
            }
            if(P.numPlayers==1){
                System.out.println("Only a single node remaining, Removing it!!");
                P.removeNode(0);
                System.out.println("Removed");
                return;
            }
            SeLinkList[] res=P.findMinMaxWeight();
            System.out.println("Minimum weighted Node: Index= "+res[0].index+" a="+res[0].a+" b="+res[0].b+" c=" + res[0].c);
            System.out.println("Maximum weighted Node: Index= "+res[1].index+" a="+res[1].a+" b="+res[1].b+" c=" + res[1].c);
            
            System.out.println("Removing minimum and maximum weighted nodes!!");
            P.removeNode(res[0].index);
            P.removeNode(res[1].index);
        }
        System.out.println("[Done!]");

        // for (int i = 0; i < 3; i++) {
        //     // Find Min and Max weights and print out the Max and Min nodes.
        //     SeLinkList[] minMaxPair = player.findMinMaxWeight();
        //     System.out.println("Min Node: Index=" + minMaxPair[0].index + " a=" + minMaxPair[0].a + " b=" + minMaxPair[0].b + " c=" + minMaxPair[0].c);
        //     System.out.println("Max Node: Index=" + minMaxPair[1].index + " a=" + minMaxPair[1].a + " b=" + minMaxPair[1].b + " c=" + minMaxPair[1].c);

        //     // Remove Max and Min nodes.
        //     player.removeNode(minMaxPair[0].index);
        //     player.removeNode(minMaxPair[1].index);

        // }
    }
}


import java.util.*;
import java.io.*;
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
    public SeLinkList[] findMinMaxWeight() {
        if(head==null){
            System.out.println("Empty linked list");
            return null;
        }
        SeLinkList ptr=head.next,minNode=head,maxNode=head;
        int mini=head.a+head.b+head.c;
        int Maxi=mini;
        while(ptr!=null){
            int w=ptr.a+ptr.b+ptr.c;
            if(w<mini){
                mini=w;
                minNode=ptr;
            }
            if(w>Maxi){
                Maxi=w;
                maxNode=ptr;
            }
            ptr=ptr.next;
        }   
        System.out.println("Minimum weight is: "+mini);
        System.out.println("Maximum weight is: "+Maxi);

        SeLinkList[] result = {minNode,maxNode};
        return result;
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
        P.addPlayer(3,6, 14);
        P.addPlayer(1, 11, 0);
        SeLinkList ptr =P.head;
        System.out.println("The number of players is:"+P.numPlayers);
        while(ptr!=null) {
            System.out.println("Index is " + ptr.index+", a is "+ptr.a+", b is "+ptr.b+" and c is "+ptr.c);            
            ptr= ptr.next;
        }
        SeLinkList[] minMaxPair=P.findMinMaxWeight();
        System.out.println("Min Node: Index="+minMaxPair[0].index+" a="+minMaxPair[0].a+" b="+minMaxPair[0].b+" c=" + minMaxPair[0].c);
        System.out.println("Max Node: Index="+minMaxPair[1].index+" a="+minMaxPair[1].a+" b="+minMaxPair[1].b+" c=" +minMaxPair[1].c);
    }
}
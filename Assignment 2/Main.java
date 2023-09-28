public class Main{
    public static void main(String[] args){
        System.out.println("Task 1 tested and Done");
        System.out.println("[Piyush Yadav - Git Assignment]");
        SeLinkList LL=new SeLinkList();
        PlayerData data=new PlayerData();
        Player P=new Player(0,LL);
        PlayerData[] a=data.getMyData();
        P.initializeList(a);
        for(int i=0;i<3;i++){
            System.out.println("Pass "+(i+1));
            P.findMinMaxWeight();
            SeLinkList.Node mini=P.findMinWeight(),maxi=P.findMaxWeight();
            if(mini!=null) P.removeNode(mini);
            if(maxi!=null) P.removeNode(maxi);
            }
            System.out.println("[Done!]");
            }

}

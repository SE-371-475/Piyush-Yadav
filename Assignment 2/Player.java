public class Player{
    public int numPlayers;
    public SeLinkList LL;
    public Player(int num,SeLinkList LL){
        this.LL=LL;
        this.numPlayers=num;
    }
    public static void main(String[] args){
        System.out.println("Task 2 tested and Done");
        System.out.println("Task 7 tested and Done");
        SeLinkList LL=new SeLinkList();
        PlayerData data=new PlayerData();
        Player P=new Player(0,LL);
        PlayerData[] a=data.getMyData();
        P.initializeList(a);
        System.out.println("Linked list after initializing ");
        SeLinkList.Node temp;
        for(temp=LL.head;temp!=null;temp=temp.nxt) 
        System.out.println("a is "+temp.a+", b is "+temp.b+", c is "+temp.c+", Index is "+temp.index);
        System.out.println("Task 8 tested and Done");
        P.findMaxWeight();
        System.out.println("Task 9 tested and Done");
        SeLinkList.Node head=LL.head,last=LL.ptr;
        P.removeNode(head);
        P.removeNode(last);
        for(head=LL.head,last=LL.ptr;head!=last;head=head.nxt,last=last.prev){}
        P.removeNode(head);
        SeLinkList.Node ptr; 
        System.out.println("Linked list after removing first, last and middle node");
        for(ptr=LL.head;ptr!=null;ptr=ptr.nxt)
        System.out.println("a is "+ptr.a+", b is "+ptr.b+", c is "+ptr.c+", Index is "+ptr.index);
        System.out.println("Task 12 tested and Done");
        P.findMinWeight();
        System.out.println("Task 13 tested and Done");
        P.findMinMaxWeight();
        System.out.println("Task 14 tested and Done");
    }
    public void addPlayer(int a,int b,int c){
        LL.addNode(a,b,c);
    } 
    public void initializeList(PlayerData[] a){
        for(PlayerData i:a) addPlayer(i.a,i.b,i.c);
    }  
    public SeLinkList.Node findMaxWeight(){
        int maxi=Integer.MIN_VALUE;
        SeLinkList.Node ptr,maxiNode=null;
        for(ptr=LL.head;ptr!=null;ptr=ptr.nxt){
             if(maxi<(ptr.a+ptr.b+ptr.c)){
                maxiNode=ptr;
                maxi=(ptr.a+ptr.b+ptr.c);
            }
        }
        return maxiNode;
    }
    public SeLinkList.Node findMinWeight(){
        int mini=Integer.MIN_VALUE;
        SeLinkList.Node ptr,miniNode=null;
        for(ptr=LL.head;ptr!=null;ptr=ptr.nxt){
             if(mini>(ptr.a+ptr.b+ptr.c)){
                miniNode=ptr;
                mini=(ptr.a+ptr.b+ptr.c);
        }
    }
        return miniNode;
    }
    public void findMinMaxWeight(){
        int maxi = Integer.MIN_VALUE,mini = Integer.MAX_VALUE;
        SeLinkList.Node ptr,maxiNode = null,miniNode = null;
        for(ptr=LL.head;ptr!=null;ptr=ptr.nxt){
            if(mini>(ptr.a+ptr.b+ptr.c)){
                miniNode=ptr;
                mini=(ptr.a+ptr.b+ptr.c);
        }
             if(maxi<(ptr.a+ptr.b+ptr.c)){
                maxiNode=ptr;
                maxi=(ptr.a+ptr.b+ptr.c);
            }
        }
        if(maxiNode!=null){
            System.out.println("Max weight player >> Node ("+maxiNode.index+","+maxiNode.a+","+maxiNode.b+","+maxiNode.c+
            ") and its weight:- "+maxi);
        }else System.out.println("No players found in the linked list.");
        if(miniNode!=null){
            System.out.println("Min weight player >> Node ("+miniNode.index+","+miniNode.a+","+miniNode.b+","+miniNode.c+") and its weight:- "+mini);
        }else System.out.println("No players found in the linked list.");
    
    }
    public void removeNode(SeLinkList.Node node){
        if(LL.head==null || node==null) return;
        if(LL.ptr==node){
            LL.ptr=node.prev;
            if(LL.ptr!=null)
            LL.ptr.nxt=null;
            return;
        }
        if(LL.head==node){
            LL.head=node.nxt;
            if(LL.head!=null) LL.head.prev=null;
            return;
        }
        SeLinkList.Node prevN=node.prev,nextN=node.nxt;
        nextN.prev=prevN;
        prevN.nxt=nextN;
    }
}

import java.util.Scanner;

public class SeLinkList {
    public SeLinkList next,prev;
    public int a,b,c,index;
    public SeLinkList(int a,int b,int c,int i){
        this.a=a;
        this.b=b;
        this.c=c;
        this.index=i;
        this.next=null;
        this.prev=null;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes that you want to add in the Linked list: ");
        int n=sc.nextInt();
        SeLinkList head=new SeLinkList(0,0,0,0);
        SeLinkList ptr=new SeLinkList(0,0,0,0);
        for(int i=0;i<n;i++){
            System.out.println("Enter value "+(i+1)+" in [a b c] format:"); 
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(i==0){
                head=new SeLinkList(a,b,c,n-i-1);
                ptr=head;
            }
            else{
                SeLinkList node=new SeLinkList(a,b,c,n-i-1);
                ptr.next=node;
                node.prev=ptr;
                ptr=ptr.next;
            }

        }
        SeLinkList curr=head;
        while(curr!=null){
            System.out.println("a: "+curr.a+", b: "+curr.b+", c: "+curr.c+", index: "+curr.index);
            curr = curr.next;
        }
        sc.close();
    }
}
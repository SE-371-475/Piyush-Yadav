
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
        SeLinkList fst=new SeLinkList(4, 7, 5,0);
        SeLinkList scnd=new SeLinkList(7, 11, 65,1);
        fst.next=scnd;
        scnd.prev=fst;
        SeLinkList thrd=new SeLinkList(9, 2, 21,2);
        scnd.next=thrd;
        thrd.prev=scnd;
        SeLinkList ptr = fst;
        while(ptr!=null){
            System.out.println("a: "+ptr.a+", b: "+ptr.b+", c: "+ptr.c+", index: "+ptr.index);
            ptr = ptr.next;
        }

    }
}
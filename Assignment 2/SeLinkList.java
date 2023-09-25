public class SeLinkList {
    public SeLinkList next;
    public int a;
    public int b;
    public int c;
    public SeLinkList(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        this.next=null;
    }
    public static void main(String[] args){
        SeLinkList fst=new SeLinkList(4, 7, 5);
        SeLinkList scnd=new SeLinkList(7, 11, 65);
        fst.next=scnd;
        SeLinkList thrd=new SeLinkList(9, 2, 21);
        scnd.next=thrd;
        SeLinkList ptr = fst;
        while(ptr!=null){
            System.out.println(ptr.a+" "+ptr.b+" "+ptr.c);
            ptr = ptr.next;
        }

    }
}

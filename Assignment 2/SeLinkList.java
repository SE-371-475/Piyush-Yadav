public class SeLinkList{     
    private int currInd=0;
    public Node ptr=null,head=null;     
    public class Node{    
        Node prev,nxt;    
        int index,a,b,c;  
        public Node(int i,int a,int b,int c){    
            this.a=a;
            this.b=b;
            this.c=c; 
            this.index=i;  
            this.prev=null; 
            this.nxt=null;    
        }    
    }      
    public static void main(String[] args){    
        SeLinkList LL = new SeLinkList();   
        System.out.println("Task 3 tested Done"); 
        LL.addNode(8,5,2);    
        LL.addNode(8,8,3);    
        LL.addNode(5,7,1);    
        LL.addNode(6,3,1);  
        Node ptr=LL.head;
        while(ptr!=null){
            System.out.println("a: "+ptr.a+" ,b: "+ptr.b+" ,c: "+ptr.c);
            ptr=ptr.nxt;
        }  
        System.out.println("Task 11 tested and Done"); 
    }    
    public void addNode(int a,int b,int c){    
        Node temp=new Node(currInd++,a,b,c);    
        if(head!=null){  
            temp.prev=ptr;
            ptr.nxt=temp;    
            ptr=temp;    
              
        }else{     
            ptr=temp;   
            head=temp;    
        }    
    }     
}  
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int N=sc.nextInt();
        int f0=0,f1=1,res=0;
        if(N==1 || N==2)
        System.out.println(N-1);
        else{
        for(int i=2;i<N;i++){
            res=f0+f1;
            f0=f1;
            f1=res;
        }
        System.out.println(res);
      }
    }
}
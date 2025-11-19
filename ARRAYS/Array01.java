import java.util.*;
class Array01{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array");
        int a[]=new int[5];
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Print Array :");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

    }
}
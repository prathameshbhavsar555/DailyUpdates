import java.util.*;
public class Strong05{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no =sc.nextInt();
		int temp=no;
		int sum=0;
		while(temp!=0){
			int t= temp%10;
			int fact=1;
			for(int i=1; i<=t; i++){
				fact*=i;
			}
			sum+=fact;
			temp/=10;
		}
		System.out.println(no==sum?"Strong Number":"No Strong Number");
	}
}
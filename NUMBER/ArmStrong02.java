import java.util.*;
public class ArmStrong02{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no =sc.nextInt();
		int temp=no;
		int armno=0;
		while(temp!=0){
			int r=temp%10;
			armno += r*r*r;
			temp/=10;
		}
		System.out.print(armno==no?"ArmStrong":"Not ArmStrong");
		
	}
}
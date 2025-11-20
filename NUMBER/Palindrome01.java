import java.util.*;
public class Palindrome01{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no =sc.nextInt();
		int temp=no;
		int rev=0;
		while(temp!=0){
			int r =temp%10;
			rev = rev*10+r;
			temp/=10;
		}
		System.out.print(no==rev?"Palindrome":"Not Palindrome");
		
	}
}
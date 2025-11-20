import java.util.*;
public class Perfect04{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no =sc.nextInt();
		int sum=0;
		for(int i=1; i<no; i++){
			if(no%i==0){
				sum +=i;
			}
		}
		System.out.println(sum==no?"Perfect Number":"No Perfect Number");
	}
}
import java.util.*;
public class DuckNo{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		String no = sc.nextLine();
		System.out.println(no.contains("0")?"Duck":"NO Duck");
	}
}
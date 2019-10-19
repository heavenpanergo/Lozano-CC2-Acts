import java.util.*;

public class KamoteSayote {
		public static void main (String [] arg) {
			Scanner sc = new Scanner(System.in);
				int n = 0;
				int m = 0;
				int k = 0;
			
				System.out.print("Enter Input: ");
					n = sc.nextInt();
					m = sc.nextInt();
					k = sc.nextInt();
			
			int x = n/m;
			int y = n%m*k;
			if (n <=1000 && k <= 1000 && m <= n){
				System.out.print(x + "kamotes \n"+ y + "sayotes");
			}else {
				System.out.print("Input Invalid.");
		}
	}
}
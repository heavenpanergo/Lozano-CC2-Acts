import java.util.*;
public class SixNumbers{
	public static void main (String arg []){
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 6 numbers: ");
		try{
			int num1 = in.nextInt();
			int	num2 = in.nextInt();
			int	num3 = in.nextInt();
			int	num4 = in.nextInt();
			int	num5 = in.nextInt();
			int	num6 = in.nextInt();
	
			int num = 11;
			if(num1>=0 && num1<=9 && num2>=0 && num2<=9 && num3>=0 && num3<=9 && num4>=0 && num4<=9 &&num5>=0 && num5<=9 && num6>=0 && num6<=9){
				for (;num<=99;num++){
					int ten = num/10;
					int ones = num%10;
					
					
						if(ten == num1 ||	ten == num2 ||	ten == num3 ||	ten == num4 ||	ten == num5 ||	ten == num6){
						
							continue;
						}
						if(ones == num1 ||ones == num2 ||ones == num3 ||ones == num4 ||ones == num5 ||ones == num6){
							
							continue;
						}
						System.out.println(num);
						
				}
			}else{
				System.out.println("Invalid Input");
			}
			
		}catch(Exception e){
				System.out.println("Invalid Input.");
		}
	}
}		
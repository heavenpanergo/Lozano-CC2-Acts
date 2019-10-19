import java.util.*;
	public class Time {
		public static void main (String pogi []){
			
		int min;
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Minutes: ");
			min = sc.nextInt();
			System.out.print(min + " minutes is " + (min/60) + "hours and " + (min%60) + " minutes.");
				}
			}
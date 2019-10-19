import java.io.*;
	import java.text.DecimalFormat;
	
		public class Room {
			public static void main (String arg []){
				BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
				String input ="";
				double length = 0;
				double width = 0;
				DecimalFormat df = new DecimalFormat("0.00");
			
				try{
					System.out.print("Enter Length: ");
						input = b.readLine();
						length = Double.parseDouble(input);
				System.out.print("Enter Width: ");
						input = b.readLine();
						width = Double.parseDouble(input + "\n");
			
				}
				catch(IOException e){
					System.out.print("Error");
				}
			
				System.out.print("The floor space of the room is " + (df.format(length*width)) + " square units."); 
			}
		}
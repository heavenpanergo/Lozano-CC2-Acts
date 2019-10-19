import java.util.Scanner;
public class Triangles{
	public static void main (String []args){
		Scanner in = new Scanner(System.in);
		//variable
		int triangle = in.nexInt();
		//loops
		for(int 1=1;1<triangle;1++){
			if(1!=triangle){
				System.out.print("l");
				
				for(int n=2;n<=1;n++){
					System.out.print("_"+n);
				}
				System.out.print("\n");
			}else{
				System.out.print("l");
				
				for(int n=2;n<=1;n++){
					System.out.print("_"+n);
				}
			}
		}
		}
}
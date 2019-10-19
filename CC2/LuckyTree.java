import javax.swing.JOptionPane;
public class LuckyTree{
	public static void main (String arg []){
		//your variable
	 int branches;
	 String text = "";
	 //your loop
	 do{
		String in = JOptionPane.showInputDialog("Enter Input:");
		branches = Integer.parseInt(in);
		if (branches==0){
			System.out.println(branches+"	-END-");
		}
		else if (branches==5000){
			System.out.println(branches + "	0");
		}
		else if (branches/10<1){
			System.out.println(branches  + "	NORMAL");
		}
		else if (branches%7==0 && branches%3==0){
			System.out.println(branches + "	LUCKY");
		}
		else
			System.out.println(branches + "	NORMAL");
		}while(branches!=0);
	 }
	}
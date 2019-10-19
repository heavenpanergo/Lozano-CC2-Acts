import java.util.*;

public class Grade_Identifier {
	public static void main(String[] brixx) {
	
		Scanner sc = new Scanner (System.in);
	
		int grade;
		//Input grade here
		System.out.print("Input grade: ");
		grade = sc.nextInt();
		if (grade >= 92 && grade <= 100)
			System.out.println("A");
		else if (grade >= 87 && grade <= 91)
			System.out.println("B+");
		else if (grade >= 83 && grade <= 86)
			System.out.println("B");
		else if (grade >= 79 && grade <= 82)
			System.out.println("C+");
		else if (grade >= 75 && grade <= 78)
			System.out.println("C");
		else if (grade >= 70 && grade <= 74)
			System.out.println("D");
		else if (grade < 70)
			System.out.println("F");
			
	}
}

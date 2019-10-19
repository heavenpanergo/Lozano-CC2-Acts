public class CC2_Lab3 {
  public static void main (String [] args){
  
  char letter1 ='J';
  char letter2 ='E';
  char letter3 ='A';
  char letter4 ='V';
  char letter5 ='E';
  char letter6 ='N';
  char point = '!';
  
  int code1 = letter1;
  int code2 = letter2;
  int code3 = letter3;
  int code4 = letter4;
  int code5 = letter5;
  int code6 = letter6;
  int code7 = point;
  int sum = letter1 + letter2 + letter3+ letter4 + letter5 + letter6 + point;
  long product = letter1 * letter2 * letter3 * letter4 * letter5 * letter6 * point;
  int average = sum/7;
  int remainder = sum%7;
  
    System.out.println(letter1 + " - " + code1);
    System.out.println(letter2 + " - " + code2);
    System.out.println(letter3 + " - " + code3);
    System.out.println(letter4 + " - " + code4);
    System.out.println(letter5 + " - " + code5);
    System.out.println(letter6 + " - " + code6);
    System.out.println(point + " - " + code7);
    System.out.println(letter1 +""+ letter2 +""+ letter3 +""+ letter4 +""+ letter5 +""+ letter6 +""+ point);
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
    System.out.println("Product: " + product);
    System.out.println("Remainder: " + remainder);
    
    }
   }
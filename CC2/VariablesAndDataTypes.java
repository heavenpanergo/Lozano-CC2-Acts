public class VariablesAndDataTypes{
 public static void main (String [] args){
    String temp = ("The temperature in Baguio City has warmed throughout the years");
    char a = 'A';
    float degrees = 16.0f;
    double degrees1 = 23.5;
    
    byte hours = 24;
    short days = 7;
    int weeks = 4;
    long months = 12;
    
    boolean warmed = true;
      if (warmed == true) {
          System.out.print(temp + "\n");
          System.out.print("\t" + a + " recent news article stated that the City has been averaging " + degrees + " degrees celsius at dawn and " + degrees1 + " at noon.\n");
          System.out.print("\t \t Regardless, lowlanders still feel cold " + hours + " hours a day, " + days + " days a week," + weeks + " weeks per month and " + months + " months each year.");
      
      
      }
      else{
        System.out.print("The boolean was changed to a False value.");
      }
      
    
  }
}
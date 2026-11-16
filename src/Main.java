import java.util.Scanner;
public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in); 
    Scanner scn1 = new Scanner(System.in);
      System.out.println("Enter first number:");
      double fNum = scn1.nextDouble();;
      System.out.println("Enter second number:");
      double sNum = scn1.nextDouble();
      System.out.println("Enter operation (+, -, *, /):");
      String operation = scn.nextLine();

      if (operation.equals("+")) {
        System.out.println(fNum + sNum);

      } else if (operation.equals("-")) {
        System.out.println(fNum - sNum);

      } else if (operation.equals("*")) {
        System.out.println(fNum * sNum);

      } else if (operation.equals("/")) {
        System.out.println(fNum / sNum);

      } else {
        System.out.println("Invalid operation");
        
      
      }
    }
   
}


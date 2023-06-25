import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter a word:");
    Scanner scan = new Scanner(System.in);

    String userName = scan.nextLine();
      
      int length = userName.length();
      System.out.println("The length of the word is: " + length);
    }
}
    //Your code will return the length of the entered String
  


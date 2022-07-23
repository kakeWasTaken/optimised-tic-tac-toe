import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Let's play Tic-Tac-Toe!");
    String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String[] firstPosition = {numbers[0], "X", "O"};
    String[] secondPosition = {numbers[1], "X", "O"};
    String[] thirdPosition = {numbers[2], "X", "O"};
    String[] fourthPosition = {numbers[3], "X", "O"};
    String[] fifthPosition = {numbers[4], "X", "O"};
    String[] sixthPosition = {numbers[5], "X", "O"};
    String[] seventhPosition = {numbers[6], "X", "O"};
    String[] eighthPosition = {numbers[7], "X", "O"};
    String[] ninthPosition = {numbers[8], "X", "O"};

    int[] symbolNum = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    int min = 1;
    int max = 9;

    boolean gameFinished = false; 

    3TSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum[0], symbolNum[1], symbolNum[2], symbolNum[3], symbolNum[4], symbolNum[5], symbolNum[6], symbolNum[7], symbolNum[8]);

    while(gameFinished == false) {
      int round = 1;
      String[] varNames = {"num" + round + "Scan", "num" + round};
      
      Scanner num1Scan = new Scanner(System.in);
      System.out.println("Choose from " + min + "-" + max + ".");
      System.out.print("Enter number choice here - ");  
      int num1 = num1Scan.nextInt();
    }
  }
}    
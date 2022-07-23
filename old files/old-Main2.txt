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

    int symbolNum1 = 0;
    int symbolNum2 = 0;
    int symbolNum3 = 0;
    int symbolNum4 = 0;
    int symbolNum5 = 0;
    int symbolNum6 = 0;
    int symbolNum7 = 0;
    int symbolNum8 = 0;
    int symbolNum9 = 0;

    int min = 1;
    int max = 9;

    TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);

    Scanner num1Scan = new Scanner(System.in);
    System.out.println("Choose from " + min + "-" + max + ".");
    System.out.print("Enter number choice here - ");  
    int num1 = num1Scan.nextInt();
    switch(num1) {
      case 1:
        symbolNum1 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 1!");
        min++;
        break;
      case 2:
        symbolNum2 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 2!");
        break;
      case 3:
        symbolNum3 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 3!");
        break;
      case 4:
        symbolNum4 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 4!");
        break;
      case 5:
        symbolNum5 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 5!");
        break;
      case 6:
        symbolNum6 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 6!");
        break;
      case 7:
        symbolNum7 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 7!");
        break;
      case 8:
        symbolNum8 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 8!");
        break;
      case 9:
        symbolNum9 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 9!");
        max--;
        break;
      default:
        System.out.println("Invalid input.");
        break;
    }

    int computerChoice1 = num1;
    while(computerChoice1 == num1) {
        computerChoice1 = (int)(Math.random()*(max-min+1)+min);
    }
    switch(computerChoice1) {
      case 1:
        if(computerChoice1 == num1) {
          System.out.println("Error");
          break;
        }
        symbolNum1 = 1;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! The computer killed 1!");
        if(num1 == 2) {
          min = 3;
        }else{
          min++;
        }
        break;
      case 2:
        if(computerChoice1 == num1) {
          System.out.println("Error");
          break;
        }
        symbolNum2 = 1;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! The computer killed 2!");
        if(num1 == 1) {
          min++;
        }
        break;
      case 3:
        if(computerChoice1 == num1) {
          System.out.println("Error");
          break;
        }
        symbolNum3 = 1;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! The computer killed 3!");
        break;
      case 4:
        if(computerChoice1 == num1) {
          System.out.println("Error");
          break;
        }
        symbolNum4 = 1;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! The computer killed 4!");
        break;
      case 5:
        if(computerChoice1 == num1) {
          System.out.println("Error");
          break;
        }
        symbolNum5 = 1;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! The computer killed 5!");
        break;
      case 6:
        if(computerChoice1 == num1) {
          System.out.println("Error");
          break;
        }
        symbolNum6 = 1;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! The computer killed 6!");
        break;
      case 7:
        if(computerChoice1 == num1) {
          System.out.println("Error");
          break;
        }
        symbolNum7 = 1;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! The computer killed 7!");
        break;
      case 8:
        if(computerChoice1 == num1) {
          System.out.println("Error");
          break;
        }
        symbolNum8 = 1;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! The computer killed 8!");
        if(num1 == 9) {
          max--;
        }
        break;
      case 9:
        if(computerChoice1 == num1) {
          System.out.println("Error");
          break;
        }
        symbolNum9 = 1;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! The computer killed 9!");
        if(num1 == 8) {
          max = 7;
        }else{
          max--;
        }
        break;
      default:
        System.out.println("Error");
        break;
    }

    Scanner num2Scan = new Scanner(System.in);
    System.out.println("Choose from " + min + "-" + max + ".");
    System.out.print("Enter number choice here - ");  
    int num2 = num2Scan.nextInt();

    switch(num2) {
      case 1:
        if(num2 == num1 || num2 == computerChoice1) {
          System.out.println("Error");
          break;
        }
        symbolNum1 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 1!");
        if(num1 == 2 || computerChoice1 >= 2 || num1 == 3 || computerChoice1 == 3) {
          min++;
          if(num1 == 3 || computerChoice1 == 3) {
            min++;
          }
        }
        break;
      case 2:
        if(num2 == num1 || num2 == computerChoice1) {
          System.out.println("Error");
          break;
        }
        symbolNum2 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 2!");
        if(num1 == 1 || computerChoice1 == 1) {
          min++;
        }else if(num1 == 1 && computerChoice1 == 3){
          min = 4;
        }else if(computerChoice1 == 1 && num1 == 3) {
          min = 4;
        }
        break;
      case 3:
        if(num2 == num1 || num2 == computerChoice1) {
          System.out.println("Error");
          break;
        }
        symbolNum3 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 3!");
        if(num1 == 1 && computerChoice1 == 2 || computerChoice1 == 1 && num1 == 2) {
          min = 4;
        }
        break;
      case 4:
        if(num2 == num1 || num2 == computerChoice1) {
          System.out.println("Error");
          break;
        }
        symbolNum4 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 4!");
        break;
      case 5:
        if(num2 == num1 || num2 == computerChoice1) {
          System.out.println("Error");
          break;
        }
        symbolNum5 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 5!");
        break;
      case 6:
        if(num2 == num1 || num2 == computerChoice1) {
          System.out.println("Error");
          break;
        }
        symbolNum6 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 6!");
        break;
      case 7:
        if(num2 == num1 || num2 == computerChoice1) {
          System.out.println("Error");
          break;
        }
        symbolNum7 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 7!");
        if(num1 == 8 && computerChoice1 == 9 || computerChoice1 == 8 && num1 == 9) {
          max = 6;
        }
        break;
      case 8:
        if(num2 == num1 || num2 == computerChoice1) {
          System.out.println("Error");
          break;
        }
        symbolNum8 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 8!");
        if(num1 == 9 || computerChoice1 == 9) {
          max--;
        }else if(num1 == 9 && computerChoice1 == 7){
          max = 6;
        }else if(computerChoice1 == 9 && num1 == 7) {
          max = 6;
        }
        break;
      case 9:
        if(num2 == num1 || num2 == computerChoice1) {
          System.out.println("Error");
          break;
        }
        symbolNum8 = 2;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! You killed 9!");
        if(num1 == 8 || computerChoice1 == 8) {
          max++;
        }else if(num1 == 8 && computerChoice1 == 7){
          max = 6;
        }else if(computerChoice1 == 8 && num1 == 7) {
          max = 6;
        }else{
          max--;
        }
        break;
      default:
        System.out.println("Error");
        break;
    }
    int computerChoice2 = num1;
    while(computerChoice2 == num2 || computerChoice2 == computerChoice1 || computerChoice2 == num1) {
        computerChoice2 = (int)(Math.random()*(max-min+1)+min);
    }
    switch(computerChoice2) {
      case 1:
        if(computerChoice2 == num1 || computerChoice2 == num2 || computerChoice2 == computerChoice1) {
          System.out.println("Error");
          break;
        }
        symbolNum1 = 1;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! The computer killed 1!");
        if(num1 == 2 || num2 == 2 || computerChoice1 == 2) {
          min = 3;
        }else if(num1 == 2 && num2 == 3 || num2 == 2 && num1 == 3 || num1 == 2 && computerChoice1 == 3 || computerChoice1 == 2 && num1 == 3 || num2 == 2 && computerChoice1 == 3 || computerChoice1 == 2 && num2 == 3) {
          min = 4;
        }else if(num1 == 2 && num2 == 3 && computerChoice1 == 4 || num1 == 2 && computerChoice1 == 3 && num2 == 4 || num2 == 2 && num1 == 3 && computerChoice1 == 4 || num2 == 2 && computerChoice1 == 3 || num1 == 4 || computerChoice1 == 2 && num1 == 3 && num2 == 4 || computerChoice1 == 2 && num2 == 3 && num1 == 4) {
          min = 5;
        }else{
          min++;
        }
        break;
      case 2:
        if(computerChoice2 == num1 || computerChoice2 == num2 || computerChoice2 == computerChoice1) {
          System.out.println("Error");
          break;
        }
        symbolNum1 = 1;
        TTTSetterUpper(firstPosition, secondPosition, thirdPosition, fourthPosition, fifthPosition, sixthPosition, seventhPosition, eighthPosition, ninthPosition, symbolNum1, symbolNum2, symbolNum3, symbolNum4, symbolNum5, symbolNum6, symbolNum7, symbolNum8, symbolNum9);
        System.out.println("Oh noes! The computer killed 2!");
        break;
      default:
        System.out.println("Error");
        break;
    }
  }
  static void TTTSetterUpper(String[] firstPosition, String[] secondPosition, String[] thirdPosition, String[] fourthPosition, String[] fifthPosition, String[] sixthPosition, String[] seventhPosition, String[] eighthPosition, String[] ninthPosition, int symbolNum1, int symbolNum2,int symbolNum3, int symbolNum4, int symbolNum5, int symbolNum6, int symbolNum7, int symbolNum8, int symbolNum9) {
    System.out.println(" " + firstPosition[symbolNum1] + " | " + secondPosition[symbolNum2] + " | " + thirdPosition[symbolNum3] + " ");
    System.out.println("-----------");
    System.out.println(" " + fourthPosition[symbolNum4] + " | " + fifthPosition[symbolNum5] + " | " + sixthPosition[symbolNum6] + " ");
    System.out.println("-----------");
    System.out.println(" " + seventhPosition[symbolNum7] + " | " + eighthPosition[symbolNum8] + " | " + ninthPosition[symbolNum9] + " ");
  }
}
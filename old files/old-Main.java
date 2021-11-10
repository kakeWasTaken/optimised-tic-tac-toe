import java.util.*;  
class Main  
{  
  public static void main(String[] args)  
  {  
    System.out.println("Let's play Tic-Tac-Toe!");
    int min = 1;
    int max = 9;
    System.out.println(" 1 | 2 | 3 ");
    System.out.println("-----------");
    System.out.println(" 4 | 5 | 6 ");
    System.out.println("-----------");
    System.out.println(" 7 | 8 | 9 ");

    Scanner num1Scan = new Scanner(System.in);
    System.out.println("Choose from 1-9.");
    System.out.print("Enter number choice here - ");  
    int num1 = num1Scan.nextInt();
    if(num1 == 1) {
      System.out.println(" X | 2 | 3 ");
      System.out.println("-----------");
      System.out.println(" 4 | 5 | 6 ");
      System.out.println("-----------");
      System.out.println(" 7 | 8 | 9 ");
      System.out.println("Oh noes! You killed 1!");
      int computerChoice1 = 1;
      min++;
      while(computerChoice1 == 1) {
        computerChoice1 = (int)(Math.random()*(max-min+1)+min);
      }
      if(computerChoice1 == 2) {
        System.out.println(" X | O | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 2!");
        min = 3;
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 3) {
          System.out.println(" X | O | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" X | O | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" X | O | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" X | O | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" X | O | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" X | O | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" X | O | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 3) {
        System.out.println(" X | 2 | O ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 3!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 2) {
          System.out.println(" X | X | O ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" X | 2 | O ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" X | 2 | O ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" X | 2 | O ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" X | 2 | O ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" X | 2 | O ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" X | 2 | O ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 4) {
        System.out.println(" X | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" O | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 4!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 2) {
          System.out.println(" X | X | 3 ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 3) {
          System.out.println(" X | 2 | X ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" O | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" O | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 5) {
        System.out.println(" X | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | O | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 5!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 2) {
          System.out.println(" X | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 3) {
          System.out.println(" X | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | O | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 6) {
        System.out.println(" X | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | O ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 6!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 2) {
          System.out.println(" X | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 3) {
          System.out.println(" X | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | X | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 7) {
        System.out.println(" X | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" O | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 7!");Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 2) {
          System.out.println(" X | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 3) {
          System.out.println(" X | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 8) {
        System.out.println(" X | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | O | 9 ");
        System.out.println("Oh noes! The computer killed 8!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 2) {
          System.out.println(" X | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 3) {
          System.out.println(" X | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max = 7;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 9) {
        System.out.println(" X | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | O ");
        System.out.println("Oh noes! The computer killed 9!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        max--;
        if(num2 == 2) {
          System.out.println(" X | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 3) {
          System.out.println(" X | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max = 7;
        }else {
          System.out.println("invalid input");
        }
      }
    }else if(num1 == 2) {
      System.out.println(" 1 | X | 3 ");
      System.out.println("-----------");
      System.out.println(" 4 | 5 | 6 ");
      System.out.println("-----------");
      System.out.println(" 7 | 8 | 9 ");
      System.out.println("Oh noes! You killed 2!");
      int computerChoice1 = 2;
      while(computerChoice1 == 2) {
        computerChoice1 = (int)(Math.random()*(max-min+1)+min);
      }
      if(computerChoice1 == 1) {
        System.out.println(" O | X | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 1!");
        min = 3;
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 3) {
          System.out.println(" O | X | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          min++;
        }else if(num2 == 4) {
          System.out.println(" O | X | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" O | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" O | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" O | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" O | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" O | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 3) {
        System.out.println(" 1 | X | O ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 3!");
        min++;
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | X | O ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          min = 4;
        }else if(num2 == 4) {
          System.out.println(" 1 | X | O ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" 1 | X | O ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | X | O ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | X | O ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | X | O ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | X | O ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 4) {
        System.out.println(" 1 | X | 3 ");
        System.out.println("-----------");
        System.out.println(" O | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 4!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | X | 3 ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          min = 3;
        }else if(num2 == 3) {
          System.out.println(" 1 | X | X ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" O | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" O | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 5) {
        System.out.println(" 1 | X | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | O | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 5!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          min = 3;
        }else if(num2 == 3) {
          System.out.println(" 1 | X | X ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" X | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | O | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 6) {
        System.out.println(" 1 | X | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | O ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 6!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          min = 3;
        }else if(num2 == 3) {
          System.out.println(" 1 | X | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | X | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 7) {
        System.out.println(" 1 | X | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" O | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 7!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          min = 3;
        }else if(num2 == 3) {
          System.out.println(" 1 | X | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 8) {
        System.out.println(" 1 | X | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | O | 9 ");
        System.out.println("Oh noes! The computer killed 8!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          min = 3;
        }else if(num2 == 3) {
          System.out.println(" 1 | X | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max = 7;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 9) {
        System.out.println(" 1 | X | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | O ");
        System.out.println("Oh noes! The computer killed 9!");
        max--;
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          min = 3;
        }else if(num2 == 3) {
          System.out.println(" 1 | X | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max = 7;
        }else {
          System.out.println("invalid input");
        }
      }
    }else if(num1 == 3) {
      System.out.println(" 1 | 2 | X ");
      System.out.println("-----------");
      System.out.println(" 4 | 5 | 6 ");
      System.out.println("-----------");
      System.out.println(" 7 | 8 | 9 ");
      System.out.println("Oh noes! You killed 3!");
      int computerChoice1 = 3;
      while(computerChoice1 == 3) {
        computerChoice1 = (int)(Math.random()*(max-min+1)+min);
      }
      if(computerChoice1 == 1) {
        System.out.println(" O | 2 | X ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 1!");
        min++;
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 2) {
          System.out.println(" O | X | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          min = 4;
        }else if(num2 == 4) {
          System.out.println(" O | 2 | X ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" O | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" O | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" O | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" O | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" O | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 2) {
        System.out.println(" 1 | O | X ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 2!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | O | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          min = 4;
        }else if(num2 == 4) {
          System.out.println(" 1 | O | X ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" 1 | O | X ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | O | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | O | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | O | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | O | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 4) {
        System.out.println(" 1 | 2 | X ");
        System.out.println("-----------");
        System.out.println(" O | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 4!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | 2 | X ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 2) {
          System.out.println(" 1 | X | X ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" O | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" O | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" O | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 5) {
        System.out.println(" 1 | 2 | X ");
        System.out.println("-----------");
        System.out.println(" 4 | O | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 5!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 2) {
          System.out.println(" 1 | X | X ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" X | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | O | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 6) {
        System.out.println(" 1 | 2 | X ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | O ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 6!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 2) {
          System.out.println(" 1 | X | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" X | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | X | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | O ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 7) {
        System.out.println(" 1 | 2 | X ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" O | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 7!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 2) {
          System.out.println(" 1 | X | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" O | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" O | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 8) {
        System.out.println(" 1 | 2 | X ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | O | 9 ");
        System.out.println("Oh noes! The computer killed 8!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 2) {
          System.out.println(" 1 | X | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | O | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | O | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 9) {
        System.out.println(" 1 | 2 | X ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | O ");
        System.out.println("Oh noes! The computer killed 9!");
        max--;
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 2) {
          System.out.println(" 1 | X | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 4) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" 4 | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | O ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }
    }else if(num1 == 4) {
      System.out.println(" 1 | 2 | 3 ");
      System.out.println("-----------");
      System.out.println(" X | 5 | 6 ");
      System.out.println("-----------");
      System.out.println(" 7 | 8 | 9 ");
      System.out.println("Oh noes! You killed 4!");
      int computerChoice1 = 4;
      while(computerChoice1 == 4) {
        computerChoice1 = (int)(Math.random()*(max-min+1)+min);
      }
      if(computerChoice1 == 1) {
        System.out.println(" O | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" X | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 1!");
        min++;
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 2) {
          System.out.println(" O | X | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 3) {
          System.out.println(" O | 2 | X ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" O | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" O | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" O | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" O | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" O | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 2) {
        System.out.println(" 1 | O | 3 ");
        System.out.println("-----------");
        System.out.println(" X | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 2!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | O | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max = 3;
        }else if(num2 == 3) {
          System.out.println(" 1 | O | X ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" 1 | O | 3 ");
          System.out.println("-----------");
          System.out.println(" X | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | O | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | O | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | O | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | O | 3 ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 3) {
        System.out.println(" 1 | 2 | O ");
        System.out.println("-----------");
        System.out.println(" X | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 3!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | 2 | O ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max = 2;
        }else if(num2 == 2) {
          System.out.println(" 1 | X | O ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 5) {
          System.out.println(" 1 | 2 | O ");
          System.out.println("-----------");
          System.out.println(" X | X | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | 2 | O ");
          System.out.println("-----------");
          System.out.println(" X | 5 | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | 2 | O ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | 2 | O ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | 2 | O ");
          System.out.println("-----------");
          System.out.println(" X | 5 | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 5) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" X | O | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 5!");
        Scanner num2Scan = new Scanner(System.in);
        System.out.println("Choose from " + min + "-" + max + ".");
        System.out.print("Enter number choice here - ");
        int num2 = num2Scan.nextInt();
        if(num2 == 1) {
          System.out.println(" X | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max = 2;
        }else if(num2 == 2) {
          System.out.println(" 1 | X | 3 ");
          System.out.println("-----------");
          System.out.println(" X | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 3) {
          System.out.println(" 1 | 2 | X ");
          System.out.println("-----------");
          System.out.println(" X | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 6) {
          System.out.println(" 1 | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | O | X ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 7) {
          System.out.println(" 1 | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | O | 6 ");
          System.out.println("-----------");
          System.out.println(" X | 8 | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 8) {
          System.out.println(" 1 | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | X | 9 ");
          System.out.println("Oh noes! You killed " + num2 + "!");
        }else if(num2 == 9) {
          System.out.println(" 1 | 2 | 3 ");
          System.out.println("-----------");
          System.out.println(" X | O | 6 ");
          System.out.println("-----------");
          System.out.println(" 7 | 8 | X ");
          System.out.println("Oh noes! You killed " + num2 + "!");
          max--;
        }else {
          System.out.println("invalid input");
        }
      }else if(computerChoice1 == 6) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" X | 5 | O ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 6!");
      }else if(computerChoice1 == 7) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" X | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" O | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 7!");
      }else if(computerChoice1 == 8) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" X | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | O | 9 ");
        System.out.println("Oh noes! The computer killed 8!");
      }else if(computerChoice1 == 9) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" X | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | O ");
        System.out.println("Oh noes! The computer killed 9!");
        max--;
      }
    }else if(num1 == 5) {
      System.out.println(" 1 | 2 | 3 ");
      System.out.println("-----------");
      System.out.println(" 4 | X | 6 ");
      System.out.println("-----------");
      System.out.println(" 7 | 8 | 9 ");
      System.out.println("Oh noes! You killed 5!");
      int computerChoice1 = 5;
      while(computerChoice1 == 5) {
        computerChoice1 = (int)(Math.random()*(max-min+1)+min);
      }
      if(computerChoice1 == 1) {
        System.out.println(" O | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | X | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 1!");
        min++;
      }else if(computerChoice1 == 2) {
        System.out.println(" 1 | O | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | X | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 2!");
      }else if(computerChoice1 == 3) {
        System.out.println(" 1 | 2 | O ");
        System.out.println("-----------");
        System.out.println(" 4 | X | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 3!");
      }else if(computerChoice1 == 4) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" O | X | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 4!");
      }else if(computerChoice1 == 6) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | X | O ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 6!");
      }else if(computerChoice1 == 7) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | X | 6 ");
        System.out.println("-----------");
        System.out.println(" O | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 7!");
      }else if(computerChoice1 == 8) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | X | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | O | 9 ");
        System.out.println("Oh noes! The computer killed 8!");
      }else if(computerChoice1 == 9) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | X | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | O ");
        System.out.println("Oh noes! The computer killed 9!");
        max--;
      }
    }else if(num1 == 6) {
      System.out.println(" 1 | 2 | 3 ");
      System.out.println("-----------");
      System.out.println(" 4 | 5 | X ");
      System.out.println("-----------");
      System.out.println(" 7 | 8 | 9 ");
      System.out.println("Oh noes! You killed 6!");
      int computerChoice1 = 6;
      while(computerChoice1 == 6) {
        computerChoice1 = (int)(Math.random()*(max-min+1)+min);
      }
      if(computerChoice1 == 1) {
        System.out.println(" O | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | X ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 1!");
        min++;
      }else if(computerChoice1 == 2) {
        System.out.println(" 1 | O | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | X ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 2!");
      }else if(computerChoice1 == 3) {
        System.out.println(" 1 | 2 | O ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | X ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 3!");
      }else if(computerChoice1 == 4) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" O | 5 | X ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 4!");
      }else if(computerChoice1 == 5) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | O | X ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 6!");
      }else if(computerChoice1 == 7) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | X ");
        System.out.println("-----------");
        System.out.println(" O | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 7!");
      }else if(computerChoice1 == 8) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | X ");
        System.out.println("-----------");
        System.out.println(" 7 | O | 9 ");
        System.out.println("Oh noes! The computer killed 8!");
      }else if(computerChoice1 == 9) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | X ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | O ");
        System.out.println("Oh noes! The computer killed 9!");
        max--;
      }
    }else if(num1 == 7) {
      System.out.println(" 1 | 2 | 3 ");
      System.out.println("-----------");
      System.out.println(" 4 | 5 | 6 ");
      System.out.println("-----------");
      System.out.println(" X | 8 | 9 ");
      System.out.println("Oh noes! You killed 7!");
      int computerChoice1 = 7;
      while(computerChoice1 == 7) {
        computerChoice1 = (int)(Math.random()*(max-min+1)+min);
      }
      if(computerChoice1 == 1) {
        System.out.println(" O | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" X | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 1!");
        min++;
      }else if(computerChoice1 == 2) {
        System.out.println(" 1 | O | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" X | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 2!");
      }else if(computerChoice1 == 3) {
        System.out.println(" 1 | 2 | O ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" X | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 3!");
      }else if(computerChoice1 == 4) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" O | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" X | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 4!");
      }else if(computerChoice1 == 5) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | O | 6 ");
        System.out.println("-----------");
        System.out.println(" X | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 5!");
      }else if(computerChoice1 == 6) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | O ");
        System.out.println("-----------");
        System.out.println(" X | 8 | 9 ");
        System.out.println("Oh noes! The computer killed 6!");
      }else if(computerChoice1 == 8) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" X | O | 9 ");
        System.out.println("Oh noes! The computer killed 8!");
      }else if(computerChoice1 == 9) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" X | 8 | O ");
        System.out.println("Oh noes! The computer killed 9!");
        max--;
      }
    }else if(num1 == 8) {
      System.out.println(" 1 | 2 | 3 ");
      System.out.println("-----------");
      System.out.println(" 4 | 5 | 6 ");
      System.out.println("-----------");
      System.out.println(" 7 | X | 9 ");
      System.out.println("Oh noes! You killed 8!");
      int computerChoice1 = 8;
      while(computerChoice1 == 8) {
        computerChoice1 = (int)(Math.random()*(max-min+1)+min);
      }
      if(computerChoice1 == 1) {
        System.out.println(" O | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | X | 9 ");
        System.out.println("Oh noes! The computer killed 1!");
        min++;
      }else if(computerChoice1 == 2) {
        System.out.println(" 1 | O | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | X | 9 ");
        System.out.println("Oh noes! The computer killed 2!");
      }else if(computerChoice1 == 3) {
        System.out.println(" 1 | 2 | O ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | X | 9 ");
        System.out.println("Oh noes! The computer killed 3!");
      }else if(computerChoice1 == 4) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" O | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | X | 9 ");
        System.out.println("Oh noes! The computer killed 4!");
      }else if(computerChoice1 == 5) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | O | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | X | 9 ");
        System.out.println("Oh noes! The computer killed 5!");
      }else if(computerChoice1 == 6) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | O ");
        System.out.println("-----------");
        System.out.println(" 7 | X | 9 ");
        System.out.println("Oh noes! The computer killed 6!");
      }else if(computerChoice1 == 7) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" O | X | 9 ");
        System.out.println("Oh noes! The computer killed 7!");
      }else if(computerChoice1 == 9) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | X | O ");
        System.out.println("Oh noes! The computer killed 9!");
        max--;
      }
    }else if(num1 == 9) {
      System.out.println(" 1 | 2 | 3 ");
      System.out.println("-----------");
      System.out.println(" 4 | 5 | 6 ");
      System.out.println("-----------");
      System.out.println(" 7 | 8 | X ");
      System.out.println("Oh noes! You killed 9!");
      int computerChoice1 = 9;
      while(computerChoice1 == 9) {
        computerChoice1 = (int)(Math.random()*(max-min+1)+min);
      }
      if(computerChoice1 == 1) {
        System.out.println(" O | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | X ");
        System.out.println("Oh noes! The computer killed 1!");
        min++;
      }else if(computerChoice1 == 2) {
        System.out.println(" 1 | O | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | X ");
        System.out.println("Oh noes! The computer killed 2!");
      }else if(computerChoice1 == 3) {
        System.out.println(" 1 | 2 | O ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | X ");
        System.out.println("Oh noes! The computer killed 3!");
      }else if(computerChoice1 == 4) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" O | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | X ");
        System.out.println("Oh noes! The computer killed 4!");
      }else if(computerChoice1 == 5) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | O | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | X ");
        System.out.println("Oh noes! The computer killed 5!");
      }else if(computerChoice1 == 6) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | O ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | X ");
        System.out.println("Oh noes! The computer killed 6!");
      }else if(computerChoice1 == 7) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" O | 8 | X ");
        System.out.println("Oh noes! The computer killed 7!");
      }else if(computerChoice1 == 8) {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | O | X ");
        System.out.println("Oh noes! The computer killed 8!");
        max = 7;
      }
    }else {
      System.out.println("invalid input");
    }
  }  
}  
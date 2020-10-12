import java.util.Scanner; 

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    // User input for name
    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("Hi " + name + ", I am Number Bot");

    //user input for number
    System.out.println("Hey " + name + ", pick a whole number 1 through 100. MAKE SURE IT IS BETWEEN THOSE NUMBERS");
    int num = scan.nextInt();


    //Response if number is not between 1 and 100
    if(num< 1 || num > 100){ // If they chose a number not 1-100
      num = 100;
      System.out.print("Sorry, you didn't listen to me, and chose " + num +", so I made your number 100!");
    }
    else{// This is for is they chose a number 1-100
      System.out.print("Good job! You chose a number between 1 and 100: " + num);
    }


    int favNum = 77;
    System.out.println(name + ", try to guess my favorite whole number");
    int guessOne = scan.nextInt();

    if(guessOne != favNum){
      System.out.println("Nope, that's not it")
       
    }
     
    
  





    
    
    
    
    
    
    
    
    
    }
 
  }
  
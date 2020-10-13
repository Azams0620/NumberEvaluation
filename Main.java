import java.util.Scanner; 

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    // User input for name
    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("Hi " + name + ", I am Number Bot");

    //user input for number
    System.out.println("Hey " + name + ", pick a whole number 1 through 10. MAKE SURE IT IS BETWEEN THOSE NUMBERS");
    int num = scan.nextInt();


    //Response if number is not between 1 and 100
    if(num< 1 || num > 10){ // If they chose a number not 1-10
      num = 10;
      System.out.println("Sorry, you didn't listen to me, and chose " + num +", so I made your number 10!");
    }
    else{// This is for is they chose a number 1-10
      System.out.println("Good job! You chose a number between 1 and 10: " + num);
    }


    int favNum = 7;
    System.out.println(name + ", try to guess my favorite whole number between 1 and 10");
    int guessOne = scan.nextInt();

    if(guessOne != favNum){
      System.out.println("Nope, that's not it. My number was actually 7");}
    else{
      System.out.println("Yeah, that's right!");
    }
     
    int sum = num + favNum;
    System.out.println("I wonder what the sum of both our numbers are. Oh! it's " + sum);

    
    System.out.println("Let's see how many times our sum can go into 100");
    int sumA = 0;
    int part = 1;
    while(sumA<= (100-sum)){
      sumA = sumA + sum;
      System.out.println(part);
      part++;
    }
    
    
    
    
    System.out.println("Hey, choose a number with a decimal between 1 and 10");
    double numDoub = scan.nextDouble();
    if(numDoub > 10.0 && numDoub >= 10.001){
      System.out.println("Sorry, you didn't listen to me, and chose " + numDoub +", so I made your number 10.0!");
      numDoub = 10.0;
    }
    else 
    if(numDoub > 10.0 ||numDoub < 1.0){
      System.out.println("Sorry, you didn't listen to me, and chose " + numDoub +", so I made your number 10.0!");
      numDoub = 10.0;}
    else{
      System.out.println("Cool! the number you chose was " + numDoub);
    }


    System.out.println("Guess what. " + numDoub + " is my favorite decimal number too!");
    Double sumDoub = numDoub * 2;
    System.out.println("The sum of these numbers are " + sumDoub);
    System.out.println("Just like we did for the whole numbers, let's see how many times this sum goes into 100");
    
    
    int partA = 1;
    for (double sumB = 0.0; sumB<= 100.0 - sumDoub; partA++)
    {
      sumB = sumB + sumDoub;
      System.out.println(partA);
    }

    System.out.print("Well, that's all " + name + ". See you next time to evaluate some more numbers.");



    







    
  





    
    
    
    
    
    
    
    
    
    }
 
  }
  
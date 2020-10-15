import java.util.Scanner; 

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    
    System.out.println("What is your name?");
    //Indication for user input for name
    String name = scan.next();
    System.out.println("Hi " + name + ", I am Number Bot");

    
    System.out.println("Hey " + name + ", pick a whole number 1 through 10. MAKE SURE IT IS BETWEEN THOSE NUMBERS");
    //Indication for user input for an integer 1-10
    int num = scan.nextInt();


    if(num< 1 || num > 10){
      //If the integer is not 1-10:
      System.out.println("Sorry, you didn't listen to me, and chose " + num +", so I made your number 10!\n");
      num = 10;
    } 
    else{
      //This will return if the number was 1-10
        System.out.println("Good job! You chose a number between 1 and 10: " + num + "\n");
    }


    int favNum = 7; 
    System.out.println(name + ", try to guess my favorite whole number between 1 and 10");
    //User input for a guess of the variable
    int guessOne = scan.nextInt();


    // If the guess was not equal to the variable
    if(guessOne != favNum){
      System.out.println("Nope, that's not it. My number was actually 7");
    }
    // If the guess WAS equal to the variable
    else{
      System.out.println("Yeah, that's right!");
    }
     
    //Sequence to create a new variable
    int sum = num + favNum;
    System.out.println("I wonder what the sum of both our numbers are. Oh! it's " + sum);

    
    System.out.println("Let's see how many times our sum can go into 100");
    //Variable assignment for while loop
    int sumA = 0;
    int part = 1;
    //While loops to find how many times "sum" goes into 100
    while(sumA<= (100-sum)){
      sumA = sumA + sum;
      System.out.println(part);
      part++;
    }
    System.out.println("Wow, our sum goes into 100 " + part + " times!\n");
    
    
    //Another part of the program dealing with doubles
    System.out.println("Let's move into numbers with decimals, choose a number with a decimal between 1 and 10");
    //User input for a double
    double numDoub = scan.nextDouble();
    
    //Statement for is number is over 10.0
    //I used >=10.001 as an extra parameter
    if(numDoub > 10.0 && numDoub >= 10.001){
      System.out.println("Sorry, you didn't listen to me, and chose " + numDoub +", so I made your number 10.0!\n");
      numDoub = 10.0;
    }
    //Else If statement for if the number is less than 10.001
    //Also if the number is less than 1.0
    else 
    if(numDoub > 10.0 ||numDoub < 1.0){
      System.out.println("Sorry, you didn't listen to me, and chose " + numDoub +", so I made your number 10.0!\n");
      numDoub = 10.0;
    }
    //The else staement will be if the number was between 1.0 and 10.0
    else{
      System.out.println("Cool! the number you chose was " + numDoub + "\n");
    }

  
    System.out.println("Guess what. " + numDoub + " is my favorite decimal number too!");
    //New variable assignment 
    Double sumDoub = numDoub * 2;
    System.out.println("The sum of these numbers are " + sumDoub);
    System.out.println("Just like we did for the whole numbers, let's see how many times this sum goes into 100");
    
    
    //Variable assignment for for loop
    int partA = 1;
    //for loop to see how many times "sumB" goes into 100
    for (double sumB = 0.0; sumB<= 100.0 - sumDoub; partA++)
    {
      sumB = sumB + sumDoub;
      System.out.println(partA);
    }
    System.out.println("Wow, our sum goes into 100 " + partA + " times!\n");

    System.out.print("Well, that's all " + name + ". See you next time to evaluate some more numbers.");



    







    
  





    
    
    
    
    
    
    
    
    
    }
 
  }
  
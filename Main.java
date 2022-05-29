//////////////////////////////////////////////////
Copy and paste the code into your IDE.
Read through it and try to understand each part 
before you hit run.
Make changes, removes, adds in order to break the
code or adjust it which should help you see what
does what and become more familar with the code.
//////////////////////////////////////////////////


import java.util.Scanner;

class Main {
  /*
  Topic: Conditional statements that will change the flow of your programs execution

  Types: if/else if/else statements, switch statements
  */

  public Main()
  {
    /*
    if/else if/else statements

    it will only execute the code- either one line directly following it OR code within {}, if what
    is between the () is true
    */

    boolean isRaining = true;

    if(isRaining)
      System.out.println("I will not go to the tennis match today");

    // the () can be filled in with anything that can be evaluated to true or false
    // such as the boolean variable,  < > == || && !

    if(!isRaining)
        System.out.println("Why did I go to the match?");
    System.out.println("I am going to the tennis match");

    // if handles the next step we want to do when () is true
    // else will handle the part when () is false always

    if(isRaining)
      System.out.println("I will not go to the tennis match");
    else
      System.out.println("I will go to the tennis match");

    // we can make the program doing any number of DIFFERENT steps by using multiple 'else if'

    int hourOfTheDay = 1600;   //1600 == 4pm and 4am == 0400

    if(hourOfTheDay < 1200)
      System.out.println("Moring Coffee");
    else if(hourOfTheDay == 1200)
      System.out.println("Afternoon Coffee");
    else if(hourOfTheDay > 1200 && hourOfTheDay < 1700)
      System.out.println("Mid Afternoon Coffee");
    else
      System.out.println("Evening Coffee");

    // Note that no step has overlap and that is how each if/else if/else needs to be treated
    // If you wanted overlap then you can NEST the step within another if statement

    if(hourOfTheDay < 1200)
    {
      if(!isRaining)
        System.out.println("I am going to an early tennis match");
    }

    //==========================================================================

    //However, once your if/else if/else statements are too many it is always easier to use a switch
    //statement

    //it will taken in a variable which is then compared with each case you have identified and switch 
    //to the matching one and execute that code

    //a simple switch statment to take in a user input symbol character and print it

    Scanner userInput = new Scanner(System.in);
    char symbol;

    System.out.println("Input character");
    symbol = userInput.next().charAt(0);  
    /**
     * next() is equivalent to a string because the method will return a string. So we can then use
     * a method associated with the String class such as charAt() to do something with the given
     * String obtained from user input
     */
    System.out.println("I got: " + symbol);

    //using the user input we will print it again but let the switch statement help us choose which is the
    //correct print

    switch(symbol)
    {
        case '!':
            System.out.println("!");
            break;
        case '@':
            System.out.println("@");
            break;
        case '#':
            System.out.println("#");
            break;
        default:
            System.out.println("You entered something I was not expecting");
    }
    
    /**
     * Note that similar to if statements while loops, for loops and methods we indent the next line and we 
     * wrap the lines of code pertaining to that statement with {}
     * 
     * deafult is not required but useful to define the case where the input to the switch statement (symbol here)
     * is wrong/unexpected input.
     * 
     * it is important to include break; in your cases otherwise if the symbol is "!" then it will print that
     * but also move right to the next case ("@") because there is nothing telling it to stop/skip
     */
    
    
  }
  public static void main(String[] args) {

    System.out.println("Hello world!");
    System.out.println();

    new Main();
    
  }
}

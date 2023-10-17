class Program1 extends ConsoleProgram {

  /**
  * Gets password from user. They have 5 tries
  * @JoshuaYin:
  */
  
  public void run() {

    //Declares the password variable. Password is "password123"
    String password = "password123";
    //The number of tries the user is given is 5
    int tries = 5;
    
    //Takes in the password guess of the user
    String passwordGuess = readLine("Enter the password: ");

    //Will continue running until either the user runs out of tries or guesses the password
    while(tries > 0 || !(passwordGuess.equals(password))){

      //If the user guesses the password correct it will print "Correct!" and break. 
      if(passwordGuess.equals(password)){
        System.out.println("Correct!");
      }
      //If they don't get it correct this code will run
      else {
        //Subtracts the number of tries the user has left by 1
        tries--; 
        //if the tries is not equal to 0 it will give them another try
        if(tries != 0){
          System.out.println("Incorrect. You have " + tries + " tries left");
          passwordGuess = readLine("Enter the password: ");
        }
        //if the tries is equal to 0 then it will break
        else{
          System.out.println("Incorrect, you have used up too many tries");
        }
      }
    }
  }
}

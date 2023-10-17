class Program1 extends ConsoleProgram {

  /**
  * While loops
  * @JoshuaYin:
  */
  
  public void run() {

    String password = "password123";
    int tries = 5;

    while(tries > 0){

      String passwordGuess = readLine("Enter the password: ");

      if(passwordGuess.equals(password)){
        System.out.println("Correct!");
        break;
      }
      else {
        tries--; 
        if(tries != 0){
          System.out.println("Incorrect. You have " + tries + " tries left");
        }
        else{
          System.out.println("Incorrect, you have used up too many tries");
        }
      }
    }
  }
}

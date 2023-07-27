/*
 Create a class Game , which allows a user to play "Guess the Number" game once.
 Game should have the following methods:
 1. Constructor to generate the random number
 2. takeUserInput() to take a user input of number
 3. isCorrectNumber() to detect whether the number entered by the user is true
 4. getter and setter for noOfGuesses
 Use properties such as noOfGuesses(int),etc to get this task done!
 */
import java.io.*;
import java.util.Random;
 class Game{
    int c;
    int count=0;
    public Game(){
        Random  game = new Random();
        c = 1 + game.nextInt(100); 
    }
    public void set(int count){
        this.count= count;
    }
    public int get(){
        return count;
    }
    public static int takeUserInput()throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int b = Integer.parseInt(br.readLine());
        return b;
    } 
    public void isCorrectNumber()throws IOException{
        for(int i = 0; i <= 20;i++){
            System.out.println("Enter a number between 1 to 100:");
            int z = takeUserInput();
            if(c == z) {
                System.out.println("Hurray!! you guesed it right");
                break;
            }
            else if(c > z){
                System.out.println("Too Less");
                System.out.println("Try Again");
            }
            else{
                System.out.println("Too High");
                System.out.println("Try Again");
            }
            count++;
            
        }
        System.out.println("Yupp the  number was:"+c);
        System.out.println("The total number of attempts you took is: " +count);
    }
    
}
public class gameguessthenumber {
    public static void main(String args[]) throws IOException {
        Game g = new Game();
        g.isCorrectNumber();
    }
}  

// Without using methods
/* 
import java.io.*;
import java.util.Random;
 class Game{
    int c;
    public int Random(){
        Random  game = new Random();
        c = 1 + game.nextInt(100); 
        return c;
    }  
}
public class gameguessthenumber {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Game g = new Game();
        g.Random();
        g.isCorrectNumber();
        int count=0;
            for(int i = 0; i <= 20;i++){
            System.out.println("Enter a number between 1 to 100:");
            int a = Integer.parseInt(br.readLine());
            if(b == a) {
                System.out.println("Hurray!! you guesed it right");
                break;
            }
            else if(b > a){
                System.out.println("The number entered by You is smaller than the Computer's number");
                System.out.println("Try Again");
            }
            else{
                System.out.println("You have entered a larger number than Computer");
                System.out.println("Try Again");
            }
            count = i;
        }
        System.out.println("Yupp the  number was:"+b);
        System.out.println("The total number of attempts you took is: " +count);
    }
}    
*/
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    private int rng;

    private int guess;

    Random RNG=new Random();

    Scanner inp=new Scanner(System.in);
    public int getGuess() {
        return guess;
    }
    public int getRng(){
        return rng;
    }
    public void setGuess(int guess){
        this.guess=guess;
    }
    public void setRng(int Rng){
        this.rng=rng;
    }
    public void game(){
        rng=RNG.nextInt(500)+1;
        while(rng!=guess){
            guess=inp.nextInt();
            if (guess<rng){
                System.out.println("Make a bigger guess");
            }
            else{
                System.out.println("Easy boy make a smaller guess");
            }


        }
        System.out.println("GZ MY FRIEND YOU DID IT!!!!!!");


    }
}

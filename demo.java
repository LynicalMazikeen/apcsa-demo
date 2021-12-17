import java.util.*;
public class demo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the human to dog years calculator!");
        System.out.print("Enter your human years: ");
        
        int humanYears = input.nextInt();

        System.out.println(humanYears + " human years is " + calculateDogYears() + " dog years!");
    }

    public static void calculateDogYears(){
        return humanYears * 7;
    }
}
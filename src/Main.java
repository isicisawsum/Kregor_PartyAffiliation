import java.util.Scanner; //importing Scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //making user able to input
        System.out.println("Enter the political party that you affiliate with. (Type ‘D’ for Democrat, R for Republican, or I for Independent):"); //prompting user to type in political party
        String party = in.nextLine(); //defining variables
        if (party.equals("D"))
        {
            System.out.println("You get a Democratic Donkey!"); //user gets Democratic Donkey after typing ‘D’
        }
        else if (party.equals("R"))
        {
            System.out.println("You get a Republican Elephant!"); //user get Republican Elephant after typing ‘R’
        }
        else if (party.equals("I"))
        {
            System.out.println("You get an Independent Person!"); //user gets Independent Person after typing I
        }
        else
        {
            System.out.println("You affiliate with another political party: " + party); //user affiliates with other political party
        }
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        //converts  days to hours, minutes, seconds
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of days: ");
        Time newDay = new Time (input.nextInt());


        System.out.println(newDay.day + " is " + newDay.getHours() +" hours: " + newDay.getMin()+ " min: "
                + newDay.getSec() + " sec ");

    }
}

package activitytwo;
import java.util.Scanner;

public class fruitsMain{

    public static String fruitsMain(String message){
        return message;
    }

    public static void main(String[] args) {
        String fruitname, fruitcolor, fruitquan;
        Scanner input = new Scanner(System.in);

        String message_one = "Fruitshaking...";
        

        System.out.print("Choose a fruit: ");
        fruitname = input.nextLine();
        System.out.print("Your Fruit Color: ");
        fruitcolor = input.nextLine();
        System.out.print("Fruit Quantity: ");
        fruitquan = input.nextLine();

        System.out.println(fruitsMain.fruitsMain(message_one));

        fruitname fruitName = new fruitname();
        fruitName.setName(fruitname);
        System.out.println("Fruit Name: " + fruitName.getName());

        fruitcolor fruitColor = new fruitcolor();
        fruitColor.setColor(fruitcolor);
        System.out.println("Fruit Color: " + fruitColor.getColor());

        fruitquan fruitQuantity = new fruitquan();
        fruitQuantity.setName(fruitquan);
        System.out.println("Fruit Quantity: " + fruitQuantity.getQuan());

        String message_two = "Fruitshaking your " + fruitquan + " " + fruitcolor + " " + fruitname + "! Enjoy! :>";
        System.out.println(fruitsMain.fruitsMain(message_two));


    }
}
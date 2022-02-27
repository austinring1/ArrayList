import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> animalList = new ArrayList<String>();
        boolean done = false;

        while(done == false){
            String choice = "";
            System.out.println(animalList);
            System.out.print("Would you like to (a)dd, (i)nsert, (r)emove, re(p)lace, or (q)uit?: ");
            choice =  scanner.nextLine();

            if(choice.equalsIgnoreCase("a")){
                String animal = "";
                System.out.print("Enter an animal: ");
                animal = scanner.nextLine();
                animalList.add(animal);
            }

            if(choice.equalsIgnoreCase("i")){
                int position = 0;
                String animal = "";
                
                System.out.print("Enter a position: ");
                position = scanner.nextInt();

                if(position <= 0){
                    System.out.println("Bad Position!");
                }else{

                System.out.print("Enter an animal: ");
                animal = scanner.nextLine();
                
                animalList.add(position - 1, animal);
                }
            }

            if(choice.equalsIgnoreCase("r")){
                int position = 0;
                
                System.out.print("Enter a position: ");
                position = scanner.nextInt();

                if(position <= 0){
                    System.out.println("Bad Position!");
                }else{

                animalList.remove(position - 1);
                }
            }

            if(choice.equalsIgnoreCase("p")){
                int position = 0;
                String animal = "";
                
                System.out.print("Enter a position: ");
                position = scanner.nextInt();

                if(position <= 0){
                    System.out.println("Bad Position!");
                }else{

                System.out.print("Enter an animal: ");
                animal = scanner.nextLine();
                
                animalList.add(position, animal);
                }
            }

            if(choice.equalsIgnoreCase("q")){
                done = true;
            }
        }       
}
}


package practice;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        System.out.println("Commands:");
        System.out.println("Add - adds a bird to database");
        System.out.println("Observation - adds one observation to named bird");
        System.out.println("One - prints number of observations for a bird");
        System.out.println("All - prints number of observations for every bird");
        while(true){
            System.out.print("> ");
            String command = scan.nextLine();

            if( command.equals("Quit")){
                break;
            }

            if ( command.equals("Add")){
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scan.nextLine();
                Bird bird = new Bird(name, nameLatin);
                Bird.addToBirdCollection(bird);
            }

            if ( command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                if (Bird.isInBirdCollection(birdName)) {
                    Bird.findBird(birdName).incrementObservation();
                } else {
                    System.out.println("Not a bird!");
                }
            }

            if ( command.equals("One")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                System.out.println(Bird.findBird(birdName));
            }

            if ( command.equals("All")) {
                System.out.println(Bird.stringifyAll());
            }
        }


    }

}


package practice;


import java.util.ArrayList;

public class Bird {
    private String name;
    private String nameLatin;
    private int observationCounter;

    private static ArrayList<Bird> birds = new ArrayList<>();

    public Bird(String name, String nameLatin){
        this.name = name;
        this.nameLatin = nameLatin;
        this.observationCounter = 0;
    }

    public void incrementObservation() {
        observationCounter++;
    }

    public static void addToBirdCollection(Bird bird){
        birds.add(bird);
    }

    public static boolean isInBirdCollection(String birdName){
        for(Bird b : birds){
            if (b.name.equals(birdName)) {
                return true;
            }
        }
        return false;
    }

    public static Bird findBird(String birdName){
        for(Bird b : birds){
            if (b.name.equals(birdName)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String observation = observationCounter == 1 ? "observation" : "observations";
        return name + " (" + nameLatin + "): " + observationCounter + " " + observation;
    }

    public static String stringifyAll() {
        String out = "";
        for(Bird b : birds){
            out += b + "\n";
        }
        return out.trim();
    }


}


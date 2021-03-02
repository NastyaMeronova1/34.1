package kg.megacom;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> seconds = new ArrayList<>();
        seconds.add(3600); //seconds in hour
        seconds.add(86400); //seconds in day
        seconds.add(604800); //seconds in week
        seconds.add(2419200); //seconds in month
        seconds.add(60); //seconds in minutes
        System.out.println("List of numbers " + seconds + "\n");
        Collections.sort(seconds);
        System.out.println("Sorted list " + seconds + "\n");
        int position = Collections.binarySearch(seconds, 60);
        System.out.println("Index of seconds in minute in binarySearch " + position + "\n");
        Collections.reverse(seconds);
        System.out.println("Reversed list  " + seconds + "\n");
        Collections.shuffle(seconds);
        System.out.println("Shuffled list  " + seconds + "\n");
        int maxValue = Collections.max(seconds);
        System.out.println("Max value is " + maxValue + "\n");
        int minValue = Collections.min(seconds);
        System.out.println("Max value is " + minValue + "\n");
        Collections.fill(seconds, 42);
        System.out.print("Filled the whole list with a number 42" + seconds);
    }
}

package Searching;

public class StringReview {

    public static void main(String[] args) {
        String x = "The quick brown fox";
        //          0123456789012345678
        //          0000000000111111111
        //indexOf . returns an int, start location of something
        int loc = x.indexOf('q');
        System.out.println("q is at location" + loc);
        loc = x.indexOf('0', 13);
        System.out.println("Starting at 13, the next 0 is at location" + loc);
        loc = x.indexOf("q",5);
        System.out.println("Starting at 5, the next q is at location " +loc);
        char c = x.charAt(13);
        System.out.println("The letter at pos 13 is " +c);
        int len = x.length();
        System.out.println(x + " is " + len + " letters long.");
        String y = x.substring(10,13);
        System.out.println("Hey " + y);
        y = x.substring(16);
        System.out.println("Crazy like a " + y);
        System.out.println(x.toUpperCase());
        x = x.toLowerCase();
        y = "jumps over the lazy dog";
        int z = y.compareTo(x);
        System.out.println("y vs x = " +z);
        z = x.compareTo(y);
        System.out.println("x vs y = " +z);
        System.out.print("Andy vs Bob\t");
        System.out.println("Andy".compareTo("Bob"));
        System.out.print("Andy vs Bob\t");
        System.out.println("Andy".compareTo("Bob"));
        
        
    }

}

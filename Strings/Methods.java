package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Akanksha";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("    Akanksha  ".strip());
        System.out.println((Arrays.toString(name.split(" "))));
    }
    
}

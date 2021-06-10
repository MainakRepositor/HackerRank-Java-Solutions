import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    scan.useDelimiter("\\Z");
    String s = scan.next().trim();
    if (s.length() > 0) {
        String[] tokens = s.split("[!,?._'@\\s]+");
        System.out.println(tokens.length);
        for(String token : tokens) {
            System.out.println(token);
        }
    } else {
        System.out.println(0);
    }
    scan.close();
}
}


package Utils;

import java.io.IOException;
import java.util.Scanner;

public class promptGenerator {
    Scanner sc =  new Scanner(System.in);
    public String getStringInput(String prompt){
        System.out.println(prompt);
        String inputString = sc.next();

        return inputString;
        //Usage
        /*
        promptGenerator pG = new promptGenerator();
        String output = pG.getInput("Enter a vehicle");
         */
    }
    public String getInput(){
        return sc.next();
    }
}

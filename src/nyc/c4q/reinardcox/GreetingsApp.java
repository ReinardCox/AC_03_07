package nyc.c4q.reinardcox;

/**
 * Created by djshadowslim on 3/7/15.
 */

import java.util.Scanner;

public class GreetingsApp {
    public static void  main (String [] args) {
        System.out.println("Hello!\nHow are you?");

        String hello;
        Scanner Input = new Scanner(System.in);

        boolean keepgoing =true;

        while (keepgoing) {
            hello = Input.next();
            if (hello.equalsIgnoreCase("hello") || hello.equalsIgnoreCase("hi")) {
                System.out.print("Nice to meet you!");
                keepgoing =false;

            } else {
                System.out.println("I'm sorry, I didn't understand your response. Please tell the follow commands: " +
                        "\n1. Hello\n2. Hi");

            }


        }
    }
}

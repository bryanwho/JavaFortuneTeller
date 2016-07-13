package com.company;

import java.util.*;

/**
 * Created by bryan on 3/31/16.
 * Ask the user what they want to know
 decide if question is legitimate or not
 either respond with a nice or a nasty response
 */
public class FortuneReader {

    private boolean running;

    public void start() {

        running = true;

        while (running ){
            //code will continue looping while running == true

            System.out.println("What do you want to know?");

            Scanner in = new Scanner(System.in);
            String question = " " + in.nextLine().toLowerCase() + " ";

            if(question.trim().equals("exit")) {
                stop();
                return;
            }

            if(question.contains(" who ") ||
                    question.contains(" what ") ||
                    question.contains(" when ") ||
                    question.contains(" where ") ||
                    question.contains(" why ") ||
                    question.contains(" how ") ||
                    question.contains(" will ")
                    ) {
                //give the user a real response
                System.out.println(getNiceResponse());
            } else {
                //give the user a nasty response
                System.out.println(getNastyResponse());
            }
        }
    }

    public void stop() {
        running = false;
        System.out.println("Thank you for playing. Program will exit now. Bye!");
    }

    private String getNiceResponse() {
        String response;
        Random random = new Random();

        switch (random.nextInt(4)) {
            case 0:
                response = "I can see something positive in the " +
                        "near future";
                break;
            case 1:
                   response = "You will have everything you derire this month";
                break;
            case 2:
                    response = "I dont see positive things ahead";
                break;
            case 3:
                    response = "Look forward to something great tomorrow";
                break;
            default:
                response = "I dont know";
                break;
        }

        return response;
    }

    //create a method for nasty response
    //call method like we did for the getNiceResponse method

    private String getNastyResponse() {
        String response;
        Random random = new Random();

        switch (random.nextInt(4)) {
            case 0:
                response = "Screw You!";
                break;
            case 1:
                response = "Please ask a real quesiton dummy";
                break;
            case 2:
                response = "This program doesnt like you at all!";
                break;
            case 3:
                response = "why are you reall here?";
                break;
            default:
                response = "I dont know";
                break;
        }

        return response;
    }
}

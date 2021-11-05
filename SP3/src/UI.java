import java.util.Scanner;

public class UI {
        Scanner playerInput = new Scanner(System.in);

        System.out.println("Enter your name and your teammates :");


        String names = playerInput.nextLine();
        System.out.println("Team: " + names);

        System.out.println("Enter your team name :");


        String teamname = playerInput.nextLine();
        System.out.println("Team name: " + teamname);


        System.out.println("Welcome to the tournament");

    }
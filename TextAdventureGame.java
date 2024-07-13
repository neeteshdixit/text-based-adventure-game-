import java.util.Scanner;

 class TextAdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You wake up in a mysterious forest. What do you do?");
        System.out.println("1. Look around");
        System.out.println("2. Search for a way out");

        int choice = getUserChoice(scanner, 2);

        if (choice == 1) {
            System.out.println("You look around and find a path. Do you follow it?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            choice = getUserChoice(scanner, 2);

            if (choice == 1) {
                System.out.println("You follow the path and encounter a troll. What do you do?");
                System.out.println("1. Fight the troll");
                System.out.println("2. Try to sneak past the troll");

                choice = getUserChoice(scanner, 2);

                if (choice == 1) {
                    System.out.println("You engage in a fierce battle with the troll and emerge victorious!");
                    System.out.println("Congratulations, you've won the game!");
                } else {
                    System.out.println("You try to sneak past the troll, but it catches you.");
                    System.out.println("Game over!");
                }
            } else {
                System.out.println("You decide not to follow the path and wander deeper into the forest.");
                System.out.println("You get lost and can't find your way out.");
                System.out.println("Game over!");
            }
        } else {
            System.out.println("You search for a way out but can't find any paths.");
            System.out.println("You hear a growling noise behind you.");
            System.out.println("What do you do?");
            System.out.println("1. Turn around to see what it is");
            System.out.println("2. Run in the opposite direction");

            choice = getUserChoice(scanner, 2);

            if (choice == 1) {
                System.out.println("You turn around and see a hungry wolf.");
                System.out.println("You try to run, but the wolf catches you.");
                System.out.println("Game over!");
            } else {
                System.out.println("You run in the opposite direction and find a way out of the forest.");
                System.out.println("Congratulations, you've won the game!");
            }
        }
    }

     static int getUserChoice(Scanner scanner, int maxChoice) {
        int choice = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= maxChoice) {
                    isValid = true;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and " + maxChoice + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        return choice;
    }
}
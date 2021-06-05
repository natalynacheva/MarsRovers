//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        Scanner in = new Scanner(System.in);
        System.out.println("Enter dimensions of the plateau: x = ");
        int x;
        int y;
        x = Integer.parseInt(in.nextLine());
        System.out.println("y = ");
        y = Integer.parseInt(in.nextLine());
       Plateu plateu=new Plateu(x,y);
        while (true) {

            System.out.print("Enter drop information for the rover x = ");
            char compass;
            x = Integer.parseInt(in.nextLine());
            System.out.println("y = ");
            y = Integer.parseInt(in.nextLine());

            System.out.println("compass = ");
            compass = in.nextLine().charAt(0);

            try {
                Rover rover = new Rover();
                rover.dropRover(plateu,x,y,compass);
                System.out.println("Current position: " + rover.currentPosition());

                System.out.print("Enter instructions for the rover (in the form LMRMMMLMM):");
                String instructions = in.nextLine();

                Instruction[] instructionsCollection = new Instructions(instructions).getInstructions();
                rover.processInstructions(instructionsCollection);
                System.out.println("Report: " + rover.currentPosition());
            } catch (Exception | UnknownInstructionException | NotDroppedException ex) {
                System.out.println(ex.getMessage());
            }
        }*/


    }
}

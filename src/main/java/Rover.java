public class Rover {
    private Plateu plateu;
    private Position position;
    private Compass compass = Compass.S;


    public Position getPosition() {
        return position;
    }


    public void dropRover(Plateu plateu, Position position, Compass compass) {
        if (position.isOnPlateau(plateu)) {
            throw new PositionOutOfPlateuException();
        }

        if (plateu.isOnTopOfARover(position)) {
            throw new RoversCrashingException();
        }

        this.plateu = plateu;
        this.position = position;
        this.compass=compass;

        plateu.addRover(this);
    }

    public void dropRover(Plateu plateau, int posX, int posY, char compass) {

        dropRover(plateau, new Position(posX, posY),toCompass(compass));

    }

    private static Compass toCompass(char compass) {
        return switch (compass) {
            case 'N' -> Compass.N;
            case 'W' -> Compass.W;
            case 'S' -> Compass.S;
            case 'E' -> Compass.E;
            default -> throw new WrongCompassParametersException();
        };
    }
    private static char toChar(Compass compass) {
        return switch (compass) {
            case N -> 'N';
            case W -> 'W';
            case S -> 'S';
            case E -> 'E';
            default -> throw new WrongCompassParametersException();
        };
    }



    public String currentPosition() {
        if (position == null || compass == null) {
            return "Rover is not dropped.";
        }
        return position + "" + toChar(compass);
    }


    //calculating directions

    private void turnLeft() {
        switch (compass) {
            case E -> compass = Compass.N;
            case N -> compass = Compass.W;
            case S -> compass = Compass.E;
            case W -> compass = Compass.S;
            default ->throw new WrongCompassParametersException();
        }
    }

    private void turnRight() {
        switch (compass) {
            case E -> compass = Compass.S;
            case N -> compass = Compass.E;
            case S -> compass = Compass.W;
            case W -> compass = Compass.N;
            default -> throw new WrongCompassParametersException();
        }
    }

    private void moveForward() {
        Position newPosition = position.moveForward(compass);
        if (newPosition.isOnPlateau(plateu)) {
            throw new PositionOutOfPlateuException();
        }
        position = newPosition;
    }

    //moving
    private void processInstruction(Instruction instruction){
        if (position == null || compass == null) {
            throw new NotDroppedException();
        }

        switch (instruction) {
            case L -> turnLeft();
            case M -> moveForward();
            case R -> turnRight();
            default -> throw new UnknownInstructionException();
        }
    }

    public void processInstructions(Instruction[] instructions) throws NotDroppedException {
        for (Instruction i : instructions) {
            processInstruction(i);
        }
    }
}

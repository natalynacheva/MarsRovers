public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEqual(Position position) {
        return x == position.x && y == position.y;
    }

    public boolean isOnPlateau(Plateu p) {
        //checking x and y are not negative numbers
        //and are not out of plateu's coordinates
        if (this.x < 0 || this.x > p.getX()) {
            return true;
        }

        return this.y < 0 || this.y > p.getY();
    }

    //setting movement
    public Position moveForward(Compass compass) {
        return switch (compass) {
            case E -> new Position(x + 1, y);
            case N -> new Position(x, y + 1);
            case S -> new Position(x, y - 1);
            case W -> new Position(x - 1, y);
        };
    }

    @Override
    public String toString() {
        return
                "" + x +
                "" + y;
    }
}

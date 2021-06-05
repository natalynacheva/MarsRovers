import java.util.ArrayList;
import java.util.List;

enum Compass{
    N,
    E,
    S,
    W
}
enum Instruction{
    L,R,M
}

public class Plateu {
private int x;
private int y;

private List<Rover> roverList= new ArrayList<>();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public List<Rover> getRoverList() {
        return roverList;
    }

    //checking for collapsing rovers
    public boolean isOnTopOfARover(Position position) {
        for (Rover r : roverList) {
            if (r.getPosition().isEqual(position)) {
                return true;
            }
        }
        return false;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRoverList(List<Rover> roverList) {
        this.roverList = roverList;
    }
    public void addRover(Rover rover) {
        this.roverList.add(rover);
    }

    public Plateu(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

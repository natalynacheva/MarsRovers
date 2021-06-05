import org.junit.Test;
import static org.junit.Assert.*;
public class TestingRovers {
    private final Plateu plateu = new Plateu(5,5);
    Rover rover  = new Rover();
    @Test
    public void RoverNotDroppedCurrentPositionMessage(){

        String currentPosition = rover.currentPosition();
        assertEquals("Rover is not dropped.",currentPosition);
    }
    @Test
    public void RoversCrashingExceptionTrown(){
        Rover rover1 = new Rover();
        try {
            rover.dropRover(plateu,2,2,'W');
            rover1.dropRover(plateu,2,2,'W');
        }catch (RoversCrashingException e){
            assertEquals("Rovers are going to crash!",e.getMessage());
        }
    }
    @Test
    public void IncorrectCompassValues(){
        try {
            rover.dropRover(plateu,1,1,'Z');
        }catch (WrongCompassParametersException e){
            assertEquals("Character is not N,W,S or E!",e.getMessage());
        }

    }
    @Test
    public void RoverNotDroppedAndTryingToBeMovedExceptionThrown(){

        try {
            Instruction[] instruction = new Instruction[0];
            rover.processInstructions(instruction);

        }
        catch (NotDroppedException e) {
            assertEquals("Rover was not dropped on the plateau!",e.getMessage());

        }
    }

 @Test
 public void RoversCollapsingThrowException() {

     Rover rover1 = new Rover();
     rover.dropRover(plateu,4,4,'S');
     try {
         rover1.dropRover(plateu,4,4,'S');
     }
     catch (RuntimeException e){
         assertEquals("Rovers are going to crash!",e.getMessage());
     }

 }
@Test
    public void UnknownInstructionThrowsException(){

        Instructions i= new Instructions("KKK");

      try {
       rover.processInstructions(i.getInstructions());
      }catch (UnknownInstructionException e){
          assertEquals("Unknown instruction!", e.getMessage());
      }
}
@Test
    public void DroppingRoverOutsideThePlateuThrowsException(){
     try {
         rover.dropRover(plateu,8,8,'W');
     }catch (PositionOutOfPlateuException e){
         assertEquals("Position is not on the plateu!",e.getMessage());
     }
}
@Test
public void MovingRoverOutsideThePlateu(){

        Instructions instructions = new Instructions("MMMMMM");
        rover.dropRover(plateu,1,1,'N');
     try {
         rover.processInstructions(instructions.getInstructions());
     } catch (UnknownInstructionException ignored) {

     } catch (NotDroppedException e) {
         assertEquals("Rover was not dropped on the plateau!",e.getMessage());
     } catch (PositionOutOfPlateuException e){
         assertEquals("Position is not on the plateu!",e.getMessage());
     }
}
@Test
    public void TestInput() throws UnknownInstructionException, NotDroppedException {

        rover.dropRover(plateu,1,2,'N');
        Instructions instructions=new Instructions("LMLMLMLMM");
        rover.processInstructions(instructions.getInstructions());

        Rover rover1 = new Rover();
        rover1.dropRover(plateu,3,3,'E');
        Instructions instructions1 =   new Instructions("MMRMMRMRRM");
        rover1.processInstructions(instructions1.getInstructions());

        String expectedOutput = rover.currentPosition()+" "+ rover1.currentPosition();
        assertEquals("13N 51E",expectedOutput);

}

}

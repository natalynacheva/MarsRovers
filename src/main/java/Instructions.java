import java.util.ArrayList;

public class Instructions {
        private final String instructions;


        public Instructions(String instructions) {
            this.instructions = instructions;
        }


        //takes the string of instructions and convert it to array of class Instruction
        //as well as checking for exceptions
        public Instruction[] getInstructions() throws UnknownInstructionException {
            ArrayList<Instruction> result = new ArrayList<>();

            for (char c: instructions.toCharArray()) {
                switch (c) {
                    case 'L' -> result.add(Instruction.L);
                    case 'M' -> result.add(Instruction.M);
                    case 'R' -> result.add(Instruction.R);
                    default -> throw new UnknownInstructionException();
                }
            }

            return result.toArray(new Instruction[result.size()]);
        }
    }


package decoder;

public class SyntaxException extends Exception {
    private final int instructionIndex;

    public SyntaxException(String message, int instructionIndex) {
        super(message);
        this.instructionIndex = instructionIndex;
    }

    public int getInstructionIndex() {
        return instructionIndex;
    }
}

package learningakka.messages;

public class Input {

    private final String message;

    public Input(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

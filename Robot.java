class Robot {
    String name;

    // Constructor
    Robot(String name) {
        this.name = name;
    }

    void greet() {
        System.out.println("Hello, I am " + name + ". How can I assist you today?");
    }
}

public class Main {
    public static void main(String[] args) {
        Robot myBot = new Robot("Gemini");
        myBot.greet();
    }
}

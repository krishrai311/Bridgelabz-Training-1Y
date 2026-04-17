package src.com.gla.lambda;

interface LightAction {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {

        // Motion detected → turn on lights
        LightAction motionTrigger = () ->
                System.out.println("Lights ON (motion detected)");

        // Night time → dim lights
        LightAction nightMode = () ->
                System.out.println("Lights DIMMED (night mode)");

        // Voice command → party mode
        LightAction voiceCommand = () ->
                System.out.println("Lights COLORFUL (party mode)");

        motionTrigger.execute();
        nightMode.execute();
        voiceCommand.execute();
    }
}

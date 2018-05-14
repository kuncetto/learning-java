public class IfElseCountdown {
    public static void main(String[] args) {
        for (int i = 60; i >= 0; i--) {
            String message = null;
            if (i == 50) {
                message = "Orbiter transfers from ground to internal power";
            } else if (i == 31) {
                message = "Ground launch sequencer is go for auto sequence start";
            } else if (i == 16) {
                message = "Activate launch pad sound suppression system";
            } else if (i == 10) {
                message = "Activate main engine hydrogen burnoff system";
            } else if (i == 6) {
                message = "Main engine start";
            } else if (i == 0) {
                message = "Solid rocket booster ignition and liftoff!";
            } else {
                message = "T-" + i;
            }
            System.out.println(message);
        }
    }
}

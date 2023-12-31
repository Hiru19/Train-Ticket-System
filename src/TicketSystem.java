public class TicketSystem {
    public static double getCharge(Location place, boolean isAdult, int numTickets) {
        double basicCharge = 0.0;
        double totalCharge = 0.0;

        switch (place) {
            case SUNNYCITY:
                basicCharge = 2.3;
                break;
            case HAPPYTOWN:
                basicCharge = 2.6;
                break;
            case GLORIOUSLTAKE:
                basicCharge = 3.4;
                break;
        }

        if (!isAdult) {
            basicCharge *= 0.9;
        }

        totalCharge = basicCharge * numTickets;
        return totalCharge;
    }

    // Assume Location is an enum defined somewhere in your code
    // For example:
    // public enum Location { SUNNYCITY, HAPPYTOWN, GLORIOUSLAKE }
}

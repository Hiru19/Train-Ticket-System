public class Driver {
    public static void main(String[]args){
        double charge=TicketSystem.getCharge(Location.SUNNYCITY,false,2);
        System.out.println(charge);
        charge=TicketSystem.getCharge(Location.HAPPYTOWN,true,3);
        System.out.println(charge);
        charge=TicketSystem.getCharge(Location.GLORIOUSLTAKE,true,4);
        System.out.println(charge);

    }
}

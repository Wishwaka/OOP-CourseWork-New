import java.util.Scanner;

public class Configuration {
    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketCapacity;

    public Configuration(){
    }

    public Configuration(int totalTickets, int ticketReleaseRate, int customerRetrievalRate, int maxTicketCapacity){
        this.totalTickets = totalTickets;
        this.ticketReleaseRate = ticketReleaseRate;
        this.customerRetrievalRate = customerRetrievalRate;
        this.maxTicketCapacity = maxTicketCapacity;
    }

    public void userInputs(){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the total number of tickets: ");
        int noOfTickets = myScanner.nextInt();
        System.out.print("Enter the ticket release rate: ");
        int ticRelRate = myScanner.nextInt();
        System.out.print("Enter the customer release rate: ");
        int cusRelRate = myScanner.nextInt();
        System.out.print("Enter the maximum ticket capacity: ");
        int maxTicCap = myScanner.nextInt();
    }
}

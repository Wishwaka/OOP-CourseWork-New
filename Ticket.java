public class Ticket {
    private int ticketId;
    private String eventName;

    public Ticket(int ticketId, String eventName){
        this.ticketId = ticketId;
        this.eventName = eventName;
    }
    public int getTicketId(){
        return this.ticketId;
    }
    public void setTicketId(int id){
        this.ticketId = id;
    }
    public String getEventName(){
        return this.eventName;
    }
    public void setEventName(String eventName){
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", eventName='" + eventName + '\'' +
                '}';
    }
}

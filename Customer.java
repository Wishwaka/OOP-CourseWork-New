public class Customer implements Runnable {
    private int customerId;
    private int retrievalInterval;

    public Customer(){
    }

    public Customer(int customerId, int retrievalInterval){
        this.customerId = customerId;
        this.retrievalInterval = retrievalInterval;
    }

    @Override
    public void run() {
    }

}

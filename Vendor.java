public class Vendor implements Runnable {
    private int vendorId;
    private int ticketsPerRelease;
    private int releaseInterval;

    public Vendor(){
    }

    public Vendor(int vendorId, int ticketsPerRelease, int releaseInterval){
        this.vendorId = vendorId;
        this.ticketsPerRelease = ticketsPerRelease;
        this.releaseInterval = releaseInterval;
    }
    @Override
    public void run() {
    }

}

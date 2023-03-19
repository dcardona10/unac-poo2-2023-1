package co.edu.unac.poo2.cl06.p1;

public class Cashier extends Thread {

    private String csName;
    private Client client;
    private long init;

    public Cashier(String name, Client client, long init) {
        this.csName = name;
        this.client = client;
        this.init = init;
    }

    public void run() {
        System.out.println("co.edu.unac.poo2.cl06.p1.Cashier " + this.csName + " starting purchase for co.edu.unac.poo2.cl06.p1.Client " + this.client.getName() + " in " + getCurrentSeconds(this.init) + " sec");
        client.getShoppingCart().forEach(s -> {
            this.waitSeconds(s.getIndex());
            System.out.println("Processing item: " + s.getItem() + " in " + getCurrentSeconds(this.init) + " sec");
        });
        System.out.println("co.edu.unac.poo2.cl06.p1.Cashier " + this.csName + " finished processing purchase for client " + this.client.getName() + " in " + getCurrentSeconds(this.init) + " sec");
    }

    private void waitSeconds(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private long getCurrentSeconds(long timestamp) {
        return (System.currentTimeMillis() - timestamp) / 1000;
    }

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public long getInit() {
        return init;
    }

    public void setInit(long init) {
        this.init = init;
    }
}

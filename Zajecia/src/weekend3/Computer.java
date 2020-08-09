package weekend3;

public class Computer {
    public final String brand;

    private String ip;
    private int price;
    private boolean isRunning = false;

    public Computer(String ip, String brand, int price) {
        if (!ip.isEmpty() && ip.contains(".")) {
            this.ip = ip;
        } else {
            System.out.println("Ustaw poprawne ip");
        }
        if (!brand.isEmpty()) {
            this.brand = brand;
        } else {
            System.out.println("Ustaw poprawna marke...");
            this.brand = "";
        }
        if (price > 0 && price < 20000) {
            this.price = price;
        } else {
            System.out.println("Ustaw poprawna cene....");
        }
    }

    public void run() {
        System.out.println("Wlaczam komputer");
        isRunning = true;
    }


    public void stop() {
        System.out.println("Wylaczam komputer");
        isRunning = false;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        if (!ip.isEmpty() && ip.contains(".")) {
            this.ip = ip;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0 && price < 20000) {
            this.price = price;
        } else {
            System.out.println("Ustaw poprawna cene....");
        }
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void showSpecification() {
        System.out.println("Marka komputera to: " + brand);
        System.out.println("Cena komputera to: " + price);
        System.out.println("IP komputera to: " + ip);
    }
}

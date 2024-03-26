public class Bank {
    private String name;
    private double exchangeCurr;

    public Bank(String name, double exchangeCurr) {
        this.name = name;
        this.exchangeCurr = exchangeCurr;
    }

    public double getExchangeCurr() {
        return exchangeCurr;
    }

    @Override
    public String toString() {
        return "Bank {" +
                "name='" + name + '\'' +
                ", exchangeRate=" + String.format("%.2f", exchangeCurr) +
                '}';
    }
}

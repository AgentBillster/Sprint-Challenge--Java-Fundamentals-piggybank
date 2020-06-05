package piggyBank;

public abstract class AbstractClass {
    public double worth;
    public int quant;

    public AbstractClass(int quant) {
        this.quant = quant;
    }

    public double getWorth() {
        return worth;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

}
package piggyBank;

public class Nickel extends AbstractClass {

    public Nickel(int quant){
        super(quant);
        this.worth = 0.05;
    }

    public int getSize(){
        return quant;
    }

    @Override
    public String toString(){
        return (quant + " Nickel");
    }

    
}
package piggyBank;

public class Quarter extends AbstractClass {

    public Quarter(int quant){
        super(quant);
        this.worth = 0.25;
    }

    public int getSize(){
        return quant;
    }
    
    @Override
    public String toString(){
        return (quant + " Nickel");
    }

    
}
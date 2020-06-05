package piggyBank;

public class Penny extends AbstractClass {

    public Penny(int quant){
        super(quant);
        this.worth = 0.01;
    }

    public int getSize(){
        return quant;
    }

    @Override
    public String toString(){
        return (quant + " Penny");
    }


    
}
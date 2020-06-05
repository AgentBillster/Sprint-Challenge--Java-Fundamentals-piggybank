package piggyBank;

public class Dollar extends AbstractClass {

    public Dollar(int quant){
        super(quant);
        this.worth = 1.00;
    }

    public int getSize(){
        return quant;
    }


    @Override
    public String toString(){
        return (quant + " Dollar");
    }


    
}
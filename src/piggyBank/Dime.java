package piggyBank;

public class Dime extends AbstractClass {

    public Dime(int quant){
        super(quant);
        this.worth = 0.10;
    }

    public int getSize(){
        return quant;
    }


    @Override
    public String toString(){
        return (quant + " Dime");
    }


    

    
}
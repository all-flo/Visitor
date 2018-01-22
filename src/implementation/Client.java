package implementation;

import contract.IVisitable;
import contract.IVisitor;

import java.util.List;

/**
 * Created by flallard on 22/01/2018.
 */
public class Client implements IVisitable {
    private String name;
    private List<Commande> commande;

    public Client (String name){
        this.name=name;
    }

    public void accept (IVisitor visitor){

    }
    public String getName(){
        return name;
    }

    public void addComande (Commande c){
        commande.add(c);
    }

}

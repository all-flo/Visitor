package implementation;

import contract.IVisitable;
import contract.IVisitor;

import java.util.List;

/**
 * Created by flallard on 22/01/2018.
 */
public class Commande implements IVisitable {
    private String name;
    private List<Ligne> ligne;

    public Commande (String Name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void addLigne(Ligne l){
            ligne.add(l);
    }

    @Override
    public void accept(IVisitor visitor) {

    }
}

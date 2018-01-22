package implementation;

import contract.IVisitable;
import contract.IVisitor;

/**
 * Created by flallard on 22/01/2018.
 */
public class Ligne implements IVisitable {

    private String name;

    public Ligne (String name)
    {
        this.name=name;
    }
    @Override
    public void accept(IVisitor visitor) {

    }

    public String getName(){
        return name;
    }
    public void setName(String name){ this.name=name;}
}

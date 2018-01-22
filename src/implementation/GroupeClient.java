package implementation;

import contract.IVisitable;
import contract.IVisitor;

import java.util.List;

/**
 * Created by flallard on 22/01/2018.
 */
public class GroupeClient implements IVisitable{

    private String name;
    private List<Client> client;

    public GroupeClient (String name){
        this.name=name;
    }

    @Override
    public void accept(IVisitor visitor) {

    }
    public String getName(){
        return name;
    }

    public void addClient(Client c){
        client.add(c);
    }
}

package contract;

import implementation.Client;
import implementation.Commande;
import implementation.Ligne;

/**
 * Created by flallard on 22/01/2018.
 */
public interface IVisitor {
    public void visit (Client c);
    public void visit (Commande o);
    public void visit (Ligne l);
    public void afficherCommandes();
}

package contract;

/**
 * Created by flallard on 22/01/2018.
 */
public interface IVisitable {
    public void accept(IVisitor visitor);
}

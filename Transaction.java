package p3;
import p2.Balance;
public interface Transaction {
	Balance b1=new Balance();
	public abstract void process(double amt);
}

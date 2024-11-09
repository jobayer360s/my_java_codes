public interface AccountOperations 
{
	//by default methods in interface are public + abstract
	void addAccount(Account ac);
	public abstract void removeAccount(Account ac);
	abstract void showAllAccounts();
}
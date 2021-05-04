
public abstract class BaseCustomerManager implements ICustomerService {
	public void  save(Customer customer) {
		System.out.println("SAVED   :"+customer.getFirstName());
	}

}

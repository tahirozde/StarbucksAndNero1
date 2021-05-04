
public class SatrbucksCustomerManager extends BaseCustomerManager implements ICustomerService {
	private ICustomerCheckService cutoCheckService;
	public SatrbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.cutoCheckService=customerCheckService;
	}
	 
	
	
}

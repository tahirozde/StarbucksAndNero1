import java.sql.Date;

public class main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager= new SatrbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1, "TAH�R", "�ZDE",new Date(1996), "55555"));

	}

}

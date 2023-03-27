package maven.demo.dao;

import java.util.List;

import maven.demo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public void deleteCustomer(int theId);

	public Customer getCustomer(int theId);

}

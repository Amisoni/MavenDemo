package maven.demo.service;

import java.util.List;

import maven.demo.entity.Customer;

public interface CustomerService {

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

	public List<Customer> getCustomers();

}

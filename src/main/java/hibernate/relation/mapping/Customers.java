package hibernate.relation.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
	
	@Id
	int customer_id;
	
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	String customer_name;
	

}

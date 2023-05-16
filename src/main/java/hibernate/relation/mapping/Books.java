package hibernate.relation.mapping;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//import antlr.collections.List;
import java.util.List;

@Entity
public class Books {

	@Id
	int book_id;
	String book_name;
	
    
	
	public List<Customers> getC() {
		return c;
	}
	public void setC(List<Customers> c) {
		this.c = c;
	}
	@ManyToOne
	public List<Customers> c = new ArrayList();
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	
}

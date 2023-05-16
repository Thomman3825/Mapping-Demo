package hibernate.relation.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Author {

	@Id
	private int author_id;
	private String author_name;
	
	
//	@OneToOne
//	Books b;
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
//	public Books getB() {
//		return b;
//	}
//	public void setB(Books b) {
//		this.b = b;
//	}
//	
}

package hibernate.relation.mapping;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
      
        Configuration config = new Configuration().configure().addAnnotatedClass(Books.class).addAnnotatedClass(Author.class).addAnnotatedClass(Customers.class);
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        
        for (int i =1;i <=3;i++) {
        	List<Customers> customers= new ArrayList();
        	Books b1 = new Books();
        	Customers c1 = new Customers();
        	Author a1 = new Author();
            
        	b1.setBook_id(i);
            b1.setBook_name("Book"+i);
            customers.add(c1);
            b1.setC(customers);  //ManytoOne
            session.save(b1);
        
        //Books b = new Books();
       
        	
            a1.setAuthor_id(i);
            a1.setAuthor_name("Author"+i);
            //a1.setB(b1); //OnetoOne
            session.save(a1);
        
        
        
       
        	
        	c1.setCustomer_id(i);
        	c1.setCustomer_name("Customer"+i);
        	session.save(c1);
        }
        
       tx.commit();
        
    }
}

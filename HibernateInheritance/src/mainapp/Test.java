package mainapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		System.out.println("welcome");
		//step1
		Configuration config=new Configuration();
		

		//Configuration configuration = new Configuration();
		config.configure("com/ui/config/hibernate.cfg.xml");
		
		//step2

		SessionFactory sessionfactory = config.buildSessionFactory();
		
		//step3

		Session session = sessionfactory.openSession();

		//step4
		
		Transaction transaction = session.beginTransaction();

		Che che = new Che();
		che.setAmt("100");
		che.setPaymentId(101);
		che.setPaymentType("school");
	
		Cash cash = new Cash();
		che.setAmt("1000");
		che.setPaymentId(105);
		che.setPaymentType("vacation");
	
		
	
		session.save(che);
		session.save(cash);
		System.out.println("saved succesfully");
		transaction.commit();
		session.close();
	}
}
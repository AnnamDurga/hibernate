package p5;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DatabaseOperation {
	public static void main(String[] args) {
		Session hibernate = HibernateConnection.getHibernateLink();

		Parent p=new Parent("appu","divaya",912345668L);
		Parent g=new Parent("moorthy","lakshmi",9078493944L);
		
		Vaccination v1=new Vaccination("c10", LocalDate.of(2022,3,10).toString(),"c8", LocalDate.of(2022,3,10).toString(),"good",200);
		Vaccination v2=new Vaccination("c11", LocalDate.of(2022,3,10).toString(),"c2", LocalDate.of(2022,3,10).toString(),"good",400);
		Vaccination v3=new Vaccination("c19", LocalDate.of(2022,3,10).toString(),"c6", LocalDate.of(2022,3,10).toString(),"good",800);
		
		Vaccination v4=new Vaccination("c7", LocalDate.of(2022,3,10).toString(),"c8", LocalDate.of(2022,3,10).toString(),"good",900);
		
		List<Vaccination> AllVaccinationCertificates = Arrays.asList(v1,v2,v3,v4);
		
		Kid k1=new Kid(LocalDate.of(2022, 7, 20).toString(),"harihsitha","female",5);
		k1.setId(106);
		k1.setParentInfo(p);
		k1.setGrandParentInfo(g);
		k1.setVaccinationCard(AllVaccinationCertificates);
		
		insertKid(hibernate, k1);
	
	}
	public static void insertKid(Session hibernate, Kid k) {

		Transaction t1 = hibernate.beginTransaction();

		hibernate.save(k); // code to save Student in the database

		t1.commit();
		hibernate.close();

		System.out.println(" 5. Database commit & hibernate closed ...");
	}
	
	
	
	
	
	
	

}


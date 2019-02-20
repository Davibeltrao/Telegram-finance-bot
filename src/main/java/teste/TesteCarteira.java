package teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import database.models.Carteira;

public class TesteCarteira {

	public static void main (String[] args) {
		
		Carteira carteira = new Carteira();
		carteira.setCompany("EGIE");
		carteira.setMarket_share("EGIE3");
		carteira.setActual_percentage(2.0);
		carteira.setIdeal_percentage(10.0);
		carteira.setMoney_amount_desired(new BigDecimal("10000.00"));
		carteira.setMoney_amount_owned(new BigDecimal("2000.00"));
		carteira.setMoney_amount_diff(new BigDecimal("8000.00"));
		carteira.setNota(10);
		carteira.setStock_price(new BigDecimal("25.42"));
		carteira.setStock_quantity_needed(153);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("finance-bot");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(carteira);
		
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
	}
	
}

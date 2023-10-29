package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Interfaces.Iusuarioable;
import model.TblUsuariocl2;

public class CrudUsuarioImp implements Iusuarioable{

	@Override
		// 
		public void RegistrarUsuario(TblUsuariocl2 tblusu) {
			EntityManagerFactory cnx=Persistence.createEntityManagerFactory("LPII_CL2_MAUTINOVILLAFUERTE");
			EntityManager em= cnx.createEntityManager();
			em.getTransaction().begin();
			em.persist(tblusu);
			em.getTransaction().commit();
			em.close();
		}

	@Override
	public String ValidarUsuario(TblUsuariocl2 tbusu) {
		EntityManagerFactory cnx = Persistence.createEntityManagerFactory("LPII_CL2_MAUTINOVILLAFUERTE");
		EntityManager em = cnx.createEntityManager();
		em.getTransaction().begin();
		
		Query cons = em.createQuery("select u from TblUsuariocl2 u where u.usuariocl2=:x and u.passwordcl2=:y",TblUsuariocl2.class);
		cons .setParameter("x", tbusu.getUsuariocl2());		
		cons.setParameter("y",tbusu.getPasswordcl2());
		
		String mensaje = ""; 
		TblUsuariocl2  u;
		try{ 
			u=(TblUsuariocl2) cons.getSingleResult();
			mensaje = "Bienvenido : " + tbusu.getUsuariocl2();
		} catch (Exception ex){
			u = null;
			mensaje = "No encontrado, por favor registrese";
		}
					
		return mensaje;
	
		
	}

}

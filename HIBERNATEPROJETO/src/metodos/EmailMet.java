/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.persistence.*;
import Entidades.Email;
/**
 *
 * @author gabri
 */
public class EmailMet {
    private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("HIBERNATE");
    private static EntityManager em= emf.createEntityManager();
    
    public void criar(Email email){
        email= new Email(); 
        em.getTransaction().begin();
        em.persist(email);
        em.getTransaction().commit();
    }
    
    public void excluir(Email email, int id){
        email= em.find(Email.class, id);
        em.getTransaction().begin();
        em.remove(email);
        em.getTransaction().commit();
    }
    
    public void alterar(Email email, int id){
        email= new Email();
        em.getTransaction().begin();
        em.merge(email);
        em.getTransaction().commit();
    }
    
    public void ler(Email email, int id){
        email= em.find(Email.class, id);
        System.out.println("Editora Código:"+email.getCod_Email()+"\n"+"Livro: "+email.getCodigo_autor() +"\n"+"Nome: "+email.getEmail()+"\n");
          }
    
}

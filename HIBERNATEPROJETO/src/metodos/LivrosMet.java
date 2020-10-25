/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.persistence.*;
import Entidades.Livros;
/**
 *
 * @author gabri
 */
public class LivrosMet {
    private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("HIBERNATE");
    private static EntityManager em= emf.createEntityManager();
    
    public void criar(Livros lv){
        lv= new Livros(); 
        em.getTransaction().begin();
        em.persist(lv);
        em.getTransaction().commit();
    }
    
    public void excluir(Livros lv, int id){
        lv= em.find(Livros.class, id);
        em.getTransaction().begin();
        em.remove(lv);
        em.getTransaction().commit();
    }
    
    public void alterar(Livros lv, int id){
        lv= new Livros();
        em.getTransaction().begin();
        em.merge(lv);
        em.getTransaction().commit();
    }
    
    public void ler(Livros lv, int id){
        lv= em.find(Livros.class, id);
        System.out.println("Isbn:"+lv.getIsbn()+"\n"+"Edição: "+ lv.getEdicao()+"\n"+"Custo: "+ lv.getCusto()+"\n"+"Titulo"+ lv.getTitulo()+"\n");
          }
}
